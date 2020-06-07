/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.CauHoiBUS;
import BUS.KyThiBUS;
import DAO.SingletonDaoUtil;
import DTO.CauHoiDTO;
import Entity.CauHoiEntity;
import Util.CauHoiBeanUtil;
import Util.ChuongMonHocBeanUtil;
import Util.NguoiDungBeanUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 *
 * @author hocgioinhatlop
 */
public class CauHoiBUSImpl implements CauHoiBUS{
public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause) {
        Object[] objects = SingletonDaoUtil.getCauHoiDAOInstance().findByProperty(property, sortExpression, sortDirection, offset, limit,whereClause);
        List<CauHoiDTO> cauHoiDTOS = new ArrayList<CauHoiDTO>();
        for (CauHoiEntity item : (List<CauHoiEntity>) objects[1]) {
            CauHoiDTO cauHoiDTO = CauHoiBeanUtil.entity2Dto(item);
            cauHoiDTOS.add(cauHoiDTO);
        }
        objects[1] = cauHoiDTOS;
        return objects;
    }
    public CauHoiDTO findById(Integer maCauHoi) {
        CauHoiEntity entity = SingletonDaoUtil.getCauHoiDAOInstance().findbyID(maCauHoi);
        CauHoiDTO dto = CauHoiBeanUtil.entity2Dto(entity);
        return dto;

    }

    @Override
    public Integer saveCauHoi(CauHoiDTO cauHoiDTO) {
      return  SingletonDaoUtil.getCauHoiDAOInstance().save(CauHoiBeanUtil.dto2Entity(cauHoiDTO)).getMaCauHoi();
    }
     @Override
    public Integer deleteCauHois(List<Integer> ids) {
        Integer result = SingletonDaoUtil.getCauHoiDAOInstance().delete(ids);
        return result;
    }

    @Override
    public void saveCauHoiImport(List<CauHoiDTO> cauHoiDTOS) {
     for (CauHoiDTO item : cauHoiDTOS) {
         //   CauHoiEntity entity=new CauHoiEntity();
//            entity.setCauHoi(item.getCauHoi());
//            entity.setDapAn1(item.getDapAn1());
//            entity.setDapAn2(item.getDapAn2());
//            entity.setDapAn3(item.getDapAn3());
//            entity.setDapAn4(item.getDapAn4());
//            entity.setDapAnDung(item.getDapAnNguoiDung());
//            entity.setDoKho(item.getDoKho());
//            entity.setLoaiCauHoi(item.getLoaiCauHoi());
//            entity.setHinhAnh(item.getHinhAnh());
//            entity.setNghe(item.getNghe());
//            entity.setChuongMonHocEntity(ChuongMonHocBeanUtil.dto2Entity(item.getChuongMonHocDTO()));
//           // entity.setNguoiDungEntity(NguoiDungBeanUtil.dto2Entity(item.getNguoiDungDTO()));
            
           
            SingletonDaoUtil.getCauHoiDAOInstance().save(CauHoiBeanUtil.dto2Entity(item));
            
        }
    }
    
}
