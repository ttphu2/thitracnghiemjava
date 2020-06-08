/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NguoiDungEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hocgioinhatlop
 */
public interface NguoiDungDAO  extends GenericDao<Integer, NguoiDungEntity> {
   public Object[] checkLogin(String userName, String password);
    
}
