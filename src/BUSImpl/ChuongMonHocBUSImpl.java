/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;

import BUS.ChuongMonHocBUS;
import DAO.SingletonDaoUtil;
import DTO.ChuongMonHocDTO;
import Entity.ChuongMonHocEntity;
import Util.ChuongMonHocBeanUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hocgioinhatlop
 */
public class ChuongMonHocBUSImpl implements ChuongMonHocBUS{

    @Override
    public Integer saveChuongMonHoc(ChuongMonHocDTO chuongMonHocDTO) throws ConstraintViolationException {
     return  SingletonDaoUtil.getChuongMonHocDAOInstance().save(ChuongMonHocBeanUtil.dto2Entity(chuongMonHocDTO)).getMaChuong();
        
    }

    @Override
    public Integer deleteChuongMonHoc(Integer ID) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(ID);
        return SingletonDaoUtil.getChuongMonHocDAOInstance().delete(list);
    }

    @Override
    public List<ChuongMonHocDTO> findAll() {
        List<ChuongMonHocDTO> list=new ArrayList<ChuongMonHocDTO>();
         List<ChuongMonHocEntity> entitys=SingletonDaoUtil.getChuongMonHocDAOInstance().findAll();
        for(ChuongMonHocEntity item: entitys){
            ChuongMonHocDTO dto= ChuongMonHocBeanUtil.entity2Dto(item);
            list.add(dto);
            
        }
        return list;
    }
    
}
