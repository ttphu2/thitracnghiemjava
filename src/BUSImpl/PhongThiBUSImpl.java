/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.KyThiBUS;
import BUS.PhongThiBUS;
import DAO.SingletonDaoUtil;
import DTO.KyThiDTO;
import DTO.NguoiDungDTO;
import DTO.PhongThiDTO;
import Entity.KyThiEntity;
import Entity.NguoiDungEntity;
import Entity.PhongThiEntity;
import Util.KyThiBeanUtil;
import Util.NguoiDungBeanUtil;
import Util.PhongThiBeanUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hibernate.exception.ConstraintViolationException;

public class PhongThiBUSImpl implements PhongThiBUS{

    @Override
    public List<PhongThiDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PhongThiDTO> findListIdPhongThi() {
       Object[] objects = SingletonDaoUtil.getPhongThiDAOInstance().findByProperty(null, null, null, null, null," GROUP BY maPhong ");
        List<PhongThiDTO> phongThiDTOS = new ArrayList<PhongThiDTO>();
        for (PhongThiEntity item : (List<PhongThiEntity>) objects[1]) {
            PhongThiDTO phongThiDTO = PhongThiBeanUtil.entity2Dto(item);
            phongThiDTOS.add(phongThiDTO);
        }
        //objects[1] = phongThiDTOS;
        return phongThiDTOS;
    }

    @Override
    public List<NguoiDungDTO> findSinhVienByEqualUnique(String property, Object value) {
         List <NguoiDungDTO> listSV=new ArrayList<NguoiDungDTO>();      
        List<PhongThiEntity> list=SingletonDaoUtil.getPhongThiDAOInstance().findEqualUnique(property, value);       
        for(PhongThiEntity item:list){
           NguoiDungDTO dto1=NguoiDungBeanUtil.entity2Dto(item.getNguoiDungEntity());
           listSV.add(dto1);
       }
        return listSV;
    }

    @Override
    public List<PhongThiDTO> findByProperties(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, String whereClause) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer deleteDeThi(Integer ID) {
        List<PhongThiEntity> list= SingletonDaoUtil.getPhongThiDAOInstance().findEqualUnique("maPhong", ID);       
        List<Integer> ids = new ArrayList<>();
        for(PhongThiEntity item:list)
        {
            ids.add(item.getID());
        }        
        Integer result = SingletonDaoUtil.getPhongThiDAOInstance().delete(ids);
        return result;
    }
        
}
