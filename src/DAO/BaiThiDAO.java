/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.BaiThiEntity;
import Entity.CauHoiEntity;
import Entity.DeThiEntity;
import Entity.KyThiEntity;
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
public interface BaiThiDAO extends GenericDao<Integer, BaiThiEntity>  {

    
}
