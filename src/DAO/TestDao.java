/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import BUS.SingletonBusUtil;
import DAOImpl.CauHoiDAOImpl;
import DAOImpl.DeThiDAOImpl;
import DAOImpl.NguoiDungDAOImpl;
import DTO.CauHoiDTO;
import DTO.NguoiDungDTO;
import Entity.CauHoiEntity;
import Entity.DeThiEntity;
import Entity.NguoiDungEntity;
import Util.NguoiDungBeanUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Transactional

public class TestDao {
    static Session session=null;
    public static void insert(DeThiEntity entity){
     
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(entity);
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
        // Code Persist       
    /* DeThiEntity entity= new DeThiEntity();
     
       DeThiDAO dao= new DeThiDAOImpl();
        // entity = dao.findbyID(11);
        entity.setTenDeThi("vua tan cong 1");
        Set<CauHoiEntity> cauhois = new HashSet<>();
        CauHoiDAO daocauhoi= new CauHoiDAOImpl();
       // CauHoiEntity temp= daocauhoi.findbyID(1);
        CauHoiEntity temp2= daocauhoi.findbyID(7);
        CauHoiEntity temp= new CauHoiEntity();
        temp.setCauHoi("7vnr");
        temp.setDapAn1("a");
        temp.setDapAn2("a");
        temp.setDapAn3("a");
        temp.setDapAn4("a");
        temp.setDapAnDung("a");
        temp.setDoKho(1);
     //   CauHoiEntity temp3= daocauhoi.findbyID(3);
     // cauhois.add(temp);
   //  entity.getListCauHoi().add(temp);
  
     entity.getListCauHoi().add(temp);
      // temp.getListDeThi().add(entity);
     //  entity.setListCauHoi(cauhois);
//       tx.commit();
//       session.close();
      entity.setDiemToiDa(50);
      dao.save(entity);
    */
        
        
        //Code xóa
   /*      DeThiEntity entity= new DeThiEntity();
     //  entity.setTenDeThi("de thi test");
       DeThiDAO dao= new DeThiDAOImpl();
         entity = dao.findbyID(16);
    
       
       CauHoiDAO daocauhoi= new CauHoiDAOImpl();
       
        CauHoiEntity temp2= daocauhoi.findbyID(7);       
    
    for(CauHoiEntity cauhoi:entity.getListCauHoi()){
        entity.removeCauHoi(cauhoi);
    }
     
      // temp.getListDeThi().add(entity);
     //  entity.setListCauHoi(cauhois);
//       tx.commit();
//       session.close();
   //   entity.setDiemToiDa(50);
   List<Integer> ids = new ArrayList<Integer>();
   
   ids.add(16);
   dao.update(entity);
   dao.delete(ids);
   */
   
   // code them 1 de thi vao cau hoi
  /*    DeThiEntity entity= new DeThiEntity();
     //  entity.setTenDeThi("de thi test");
       DeThiDAO dao= new DeThiDAOImpl();
         entity = dao.findbyID(10);
    
       
       CauHoiDAO daocauhoi= new CauHoiDAOImpl();
       
        CauHoiEntity temp2= daocauhoi.findbyID(10);  
       // CauHoiEntity temp3= daocauhoi.findbyID(7);  
    
        temp2.getListDeThi().add(entity);
     
      // temp.getListDeThi().add(entity);
     //  entity.setListCauHoi(cauhois);
//       tx.commit();
//       session.close();
   //   entity.setDiemToiDa(50);
 //  List<Integer> ids = new ArrayList<Integer>();
   
 //  ids.add(16);
   daocauhoi.update(temp2);
  // dao.delete(ids);
   */
  
  //code them 1 cau hoi vao de thi chua hoan` thien dang bi loi
//  
//   DeThiEntity entity= new DeThiEntity();
//     //  entity.setTenDeThi("de thi test");
//       DeThiDAO dao= new DeThiDAOImpl();
//         entity = dao.findbyID(10);
//    
//       
//       CauHoiDAO daocauhoi= new CauHoiDAOImpl();
//       
//        CauHoiEntity temp2= daocauhoi.findbyID(10);  
//       // CauHoiEntity temp3= daocauhoi.findbyID(7);  
//    
//        temp2.getListDeThi().add(entity);
//        entity.getCa
//      // temp.getListDeThi().add(entity);
//     //  entity.setListCauHoi(cauhois);
////       tx.commit();
////       session.close();
//   //   entity.setDiemToiDa(50);
// //  List<Integer> ids = new ArrayList<Integer>();
//   
// //  ids.add(16);
//   daocauhoi.update(temp2);
//  // dao.delete(ids);
  
  //code set ListCauHoi vao de thi
    // Code Persist       
//       DeThiEntity entity= new DeThiEntity();
//     
//       DeThiDAO dao= new DeThiDAOImpl();
//         entity = dao.findbyID(8);
//    
//       Set<CauHoiEntity> cauhois = new HashSet<>();
//       CauHoiDAO daocauhoi= new CauHoiDAOImpl();
//       
//        CauHoiEntity temp2= daocauhoi.findbyID(7);
//        CauHoiEntity temp3=daocauhoi.findbyID(10);
//        
//        CauHoiEntity temp= new CauHoiEntity();
//        temp.setCauHoi("7vnr");
//        temp.setDapAn1("a");
//        temp.setDapAn2("a");
//        temp.setDapAn3("a");
//        temp.setDapAn4("a");
//        temp.setDapAnDung("a");
//        temp.setDoKho(1);
//     //   CauHoiEntity temp3= daocauhoi.findbyID(3);
//        cauhois.add(temp);
//       // cauhois.add(temp3);
//   //  entity.getListCauHoi().add(temp);
//  
//    
//       entity.setListCauHoi(cauhois);

   //   entity.setDiemToiDa(50);
  //   dao.update(entity);
   // insert(entity);
   
   //test EDIT
//        NguoiDungDAO dao=new NguoiDungDAOImpl();
//       NguoiDungEntity entity= dao.findbyID(1);
//       NguoiDungDTO dto=NguoiDungBeanUtil.entity2Dto(entity);
//       dto.setEmail("edit@123");
//       dao.update(NguoiDungBeanUtil.dto2Entity(dto));

//test rand() cau cau
   Map<String, Object> property = new HashMap<String, Object>();  
   property.put("maChuong", "4");
   
Object[] objects=SingletonBusUtil.getCauHoiBUSInstance().findByProperty(property, "RAND()",Constant.Constant.SORT_ASC , null, null, null);
    List<CauHoiDTO> list=(List<CauHoiDTO>) objects[1];
    System.out.println(list.get(0).getMaCauHoi());
    System.out.println(list.get(1).getMaCauHoi());
    
    }
}
