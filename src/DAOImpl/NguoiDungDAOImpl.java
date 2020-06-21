/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.AbstractDao;
import DAO.HibernateUtil;
import DAO.NguoiDungDAO;
import DAO.VaiTroDAO;
import Entity.NguoiDungEntity;
import Entity.VaiTroEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hocgioinhatlop
 */
public class NguoiDungDAOImpl extends AbstractDao<Integer, NguoiDungEntity> implements NguoiDungDAO{
    
    public Object[] checkLogin(String userName, String password) {
       Session session=HibernateUtil.getSessionFactory().openSession();
       Transaction transaction=session.beginTransaction();
       boolean isUserExist=false;
       String roleName=null;
       Integer userId = null;
        try{
            StringBuilder sql= new StringBuilder("FROM NguoiDungEntity ue WHERE ue.tenDangNhap= :tenDangNhap AND ue.matKhau= :matKhau");
            Query query=session.createQuery(sql.toString());
            query.setParameter("tenDangNhap",userName);
            query.setParameter("matKhau",password);
            if(query.list().size()>0){
                isUserExist=true;
                NguoiDungEntity userEntity= (NguoiDungEntity) query.uniqueResult();
                roleName=userEntity.getVaiTroEntity().getTenVaiTro();
                userId=userEntity.getMaNguoiDung();
            }
        }catch(HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return new Object[]{isUserExist,roleName,userId};
    }
}
