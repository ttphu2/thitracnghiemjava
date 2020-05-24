/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.VaiTroEntity;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hocgioinhatlop
 */
public interface VaiTroDAO extends GenericDao<Integer, VaiTroEntity>  {
//    public List<VaiTroEntity> findByRoles(List<String> roles) {
//
//        Session session= HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction=session.beginTransaction();
//        List<VaiTroEntity> roleEntities= new ArrayList<VaiTroEntity>();
//        try{
//            StringBuilder sql=new StringBuilder("FROM VaiTroEntity ue WHERE ue.tenvaitro IN (:roles)");
//            Query query=session.createQuery(sql.toString());
//            query.setParameterList("roles",roles);
//            roleEntities=query.list();
//        }catch(HibernateException e){
//            transaction.rollback();
//            throw e;
//        }finally {
//            session.close();
//        }
//        return roleEntities;
//
//
//    }
    
}
