/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.DeThiBUS;
import BUS.KyThiBUS;
import DAO.SingletonDaoUtil;
import DTO.DeThiDTO;
import DTO.MonHocDTO;
import Entity.DeThiEntity;
import Entity.MonHocEntity;
import Util.DeThiBeanUtil;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hocgioinhatlop
 */
public class DeThiBUSImpl implements DeThiBUS{

    @Override
    public List<DeThiDTO> findAll() {
        ArrayList <DeThiDTO> listDeThi=new ArrayList<DeThiDTO>();      
        List<DeThiEntity> list=SingletonDaoUtil.getDeThiDAOInstance().findAll();           
        for(DeThiEntity item:list){
           DeThiDTO dto1=DeThiBeanUtil.entity2Dto(item);
           listDeThi.add(dto1);
       }
        return listDeThi;
    }
//    @Override
//    public List<DeThiEntity> findEqualUnique(String property,Object value) {
//        ArrayList <DeThiDTO> listDeThi=new ArrayList<DeThiDTO>();      
//        List<DeThiEntity> list=SingletonDaoUtil.getDeThiDAOInstance().findEqualUnique(property, value);       
//        for(DeThiEntity item:list){
//           DeThiDTO dto1=DeThiBeanUtil.entity2Dto(item);
//           listDeThi.add(dto1);
//       }
//        return listDeThi;
//    }
    
}
