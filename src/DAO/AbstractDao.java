package DAO;


import Constant.Constant;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;



import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;

public class AbstractDao <ID extends Serializable,T> implements GenericDao<ID,T> {
  
    private Class<T> persistenceClass;
    public AbstractDao(){
        this.persistenceClass =(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    public String getPersistenceClassName(){
        return persistenceClass.getSimpleName();
    }

    public List<T> findAll() {
        List<T> list = new ArrayList<T>();
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;
        try{
            transaction=session.beginTransaction();
            StringBuilder sql= new StringBuilder("from ");
            sql.append(this.getPersistenceClassName());
            Query query = session.createQuery(sql.toString());
            list=query.list();
            transaction.commit();
        }catch(HibernateException e){
            transaction.rollback();
         //   log.error(e.getMessage(),e);
         System.out.println("Find ALl that bai");
            throw e;
        }finally {
            session.close();
        }

        return list;
    }

    public T update(T entity) {
    T result=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
   Transaction transaction=session.beginTransaction();
     try{
         Object object= session.merge(entity);
        result= (T) object;
        transaction.commit();
     }catch(HibernateException e){
         transaction.rollback();
       //  log.error(e.getMessage(),e);
       System.out.println("Update that bai");
         throw e;
     } finally {
         session.close();
     }
        return result;
    }

    public T save(T entity){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        try{
            session.persist(entity);
            transaction.commit();
        }catch(HibernateException e){
            transaction.rollback();
          //  log.error(e.getMessage(),e);
          System.out.println("Save that bai");
            throw e;
        }finally {
            session.close();
        }
        return entity;
    }

    public T findbyID(ID id) {
        T result=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        try{
         result= (T) session.get(persistenceClass,id);
         if(result==null){
             throw new ObjectNotFoundException("NOT FOUND "+id,null);
         }
        }catch (HibernateException e){
            transaction.rollback();
        //    log.error(e.getMessage(),e);
        System.out.println("FindById that bai");
            throw e;
        }finally {
            session.close();
        }

        return result;
    }

    public Object[] findByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause) {
        List<T> list = new ArrayList<T>();
        Integer size;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Object[] nameQuery=HibernateUtil.buildNameQuery(property);
        try{
            StringBuilder sql= new StringBuilder("from ");
            sql.append(this.getPersistenceClassName()).append(" where 1=1 ").append(nameQuery[0]);

            if(sortExpression!=null&&sortDirection!=null){
            sql.append(" order by ").append(sortExpression);
            sql.append(" "+(sortDirection.equals(Constant.SORT_ASC)?"asc":"desc"));
            }
            if (whereClause != null) {
                sql.append(whereClause);
            }
            Query query1 = session.createQuery(sql.toString());
            setParameterToQuery(nameQuery,query1);
            size=query1.list().size();
            if(offset!=null && offset>=0) {
                query1.setFirstResult(offset);
            }
            if(limit !=null && limit >0){
                query1.setMaxResults(limit);
            }
            list = query1.list();
            transaction.commit();
        }catch(HibernateException e){
            transaction.rollback();
         //   log.error(e.getMessage(),e);
            throw e;
        }finally {
            session.close();
        }

        return new Object[]{(long)size,list};
    }

    public Integer delete(List<ID> ids) {
        Integer count=0;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        try{
           for(ID item:ids){
               T t=(T) session.get(persistenceClass,item);
               session.delete(t);
               count++;
           }
            transaction.commit();
        }catch(HibernateException e){
            transaction.rollback();
            //log.error(e.getMessage(),e);
             System.out.println("Delete Id that bai");
            throw e;
        }finally {
            session.close();
        }
        return count;
    }

    public T findEqualUnique(String property, Object value) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        T result=null;
        try{
            String sql="FROM "+getPersistenceClassName()+" model WHERE model."+property+"= :value";
            Query query=session.createQuery(sql.toString());
            query.setParameter("value",value);
            result= (T) query.uniqueResult();


        }catch(HibernateException e){
            transaction.rollback();
         //   log.error(e.getMessage(),e);
         System.out.println("findByUnique that bai");
            throw e;
        }finally {
            session.close();
        }
    return result;

    }

    private void setParameterToQuery(Object[] nameQuery, Query query1) {
        if(nameQuery.length==3){
            String[] params= (String[]) nameQuery[1];
            Object[] values= (Object[])  nameQuery[2];
            for(int i2=0;i2< params.length;i2++){
                query1.setParameter(params[i2],values[i2]);
            }

        }
    }
}
