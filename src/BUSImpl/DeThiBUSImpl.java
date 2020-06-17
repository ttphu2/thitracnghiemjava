/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.DeThiBUS;
import BUS.KyThiBUS;
import DAO.SingletonDaoUtil;
import static DAO.SingletonDaoUtil.getCTDTDAOImplInstance;
import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.MonHocDTO;
import Entity.CauHoiEntity;
import Entity.ChiTietDeThiEntity;
import Entity.DeThiEntity;
import Entity.MonHocEntity;
import Util.CauHoiBeanUtil;
import Util.DeThiBeanUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    @Override
    public Integer saveDeThi(DeThiDTO deThiDTO) {
        DeThiEntity entity=null;       
        entity=  SingletonDaoUtil.getDeThiDAOInstance().save(DeThiBeanUtil.dto2Entity(deThiDTO));      
        return entity.getMaDeThi();
    }
    public void saveNoiDungDeThi (Set<CauHoiDTO> cauHoiDTOS,Integer maBaiThi) {
        DeThiEntity entity=SingletonDaoUtil.getDeThiDAOInstance().findbyID(maBaiThi);
        for(CauHoiDTO item:cauHoiDTOS){
        ChiTietDeThiEntity chitiet=new ChiTietDeThiEntity();
        chitiet.setCauHoiEntity(CauHoiBeanUtil.dto2Entity(item));
        chitiet.setDeThiEntity(entity);
        SingletonDaoUtil.getCTDTDAOImplInstance().save(chitiet);
        }
    }
    public void deleteDeThi (Integer maBaiThi) {
        List<ChiTietDeThiEntity> ctdtList=SingletonDaoUtil.getCTDTDAOImplInstance().findEqualUnique("deThiEntity.maDeThi", maBaiThi);
       List<Integer> ids= new ArrayList<>();
        //xoa noi dung bai thi
       if(ctdtList.size()>0){
            for(ChiTietDeThiEntity item:ctdtList){
                ids.add(item.getId());            
            }
        SingletonDaoUtil.getCTDTDAOImplInstance().delete(ids);
          }
       //xoa ket qua cua bai thi
       //....
       //xoa bai thi
         List<Integer> idDeThi= new ArrayList<>();
         idDeThi.add(maBaiThi);        
        SingletonDaoUtil.getDeThiDAOInstance().delete(idDeThi);
        }
    public List<CauHoiDTO> getCauHoiByMaDe (Integer maDeThi) {
        DeThiEntity entity=SingletonDaoUtil.getDeThiDAOInstance().findbyID(maDeThi);            
       List<ChiTietDeThiEntity> ctdt=SingletonDaoUtil.getCTDTDAOImplInstance().findEqualUnique("deThiEntity.maDeThi", maDeThi);
       List<CauHoiDTO> cauHoiDTOS=new ArrayList<CauHoiDTO>();
       for(ChiTietDeThiEntity item:ctdt)
       {
           CauHoiDTO dto=new CauHoiDTO();
           dto=CauHoiBeanUtil.entity2Dto(item.getCauHoiEntity());
           cauHoiDTOS.add(dto);                  
       }
       return cauHoiDTOS;
       
    }
    public DeThiDTO findById(Integer maDeThi)
    {
        DeThiEntity entity=SingletonDaoUtil.getDeThiDAOInstance().findbyID(maDeThi); 
        return DeThiBeanUtil.entity2Dto(entity);
        
    }
    
       
}
