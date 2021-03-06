/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import BUS.SingletonBusUtil;
import DAOImpl.ChiTietDeThiDAOImpl;
import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.NguoiDungDTO;
import Entity.CauHoiEntity;
import Entity.ChiTietDeThiEntity;
import Entity.DeThiEntity;
import Entity.NguoiDungEntity;
import Util.DeThiBeanUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Transactional

public class TestDao {
    static Session session=null;
    public static void insert(DeThiEntity entity){
     
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.merge(entity);
        session.flush();
        tx.commit();
        session.close();
    }
    public static void insert2(DeThiEntity entity){
     
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.merge(entity);
       // session.flush();
        tx.commit();
        session.close();
    }
    public static void main(String[] args){
////    DeThiEntity deThiEntity=SingletonDaoUtil.getDeThiDAOInstance().findbyID(10);
////    System.out.print(deThiEntity.getCtdtEntityList().get(0).getCauHoiEntity().getMaCauHoi());
////    System.out.print(deThiEntity.getCtdtEntityList().size());
//ChiTietDeThiDAO dao = new ChiTietDeThiDAOImpl();
//
//List<ChiTietDeThiEntity> list =dao.findEqualUnique("deThiEntity.maDeThi", 10);
//System.out.print(list.size());
//System.out.print(list.get(0).getCauHoiEntity().getMaCauHoi());
//System.out.print(list.get(1).getCauHoiEntity().getMaCauHoi());

//json

List<NguoiDungDTO> list=new ArrayList<NguoiDungDTO>();
NguoiDungDTO dto=SingletonBusUtil.getNguoiDungBUSInstance().findById(1);
NguoiDungDTO dto1=SingletonBusUtil.getNguoiDungBUSInstance().findById(2);
list.add(dto);
list.add(dto1);
Gson gson = new Gson();
String json = gson.toJson(list);
List<NguoiDungDTO> temp = gson.fromJson(json, new TypeToken<List<NguoiDungDTO>>(){}.getType());

for(NguoiDungDTO item:temp)
{
    System.out.println(item.getTenDangNhap());
}
// NguoiDungEntity entity=SingletonDaoUtil.getNguoiDungDAOInstance().findbyID(1);
// System.out.println(entity.getPhongThiList().size());
// System.out.println(entity.getPhongThiList().get(0).getMaPhong());
// System.out.println(entity.getPhongThiList().get(1).getMaPhong());
// System.out.println(entity.getPhongThiList().get(2).getMaPhong());

    }
}
