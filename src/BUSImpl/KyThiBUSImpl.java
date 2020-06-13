/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.KyThiBUS;
import DAO.SingletonDaoUtil;
import DTO.KyThiDTO;
import Entity.KyThiEntity;
import Util.KyThiBeanUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.exception.ConstraintViolationException;


/**
 *
 * @author hocgioinhatlop
 */
public class KyThiBUSImpl implements KyThiBUS{

    @Override
    public KyThiDTO findById(Integer kyThiId) {
        KyThiEntity entity = SingletonDaoUtil.getKyThiDAOImplInstance().findbyID(kyThiId);
        KyThiDTO dto = KyThiBeanUtil.entity2Dto(entity);
        return dto;
    }
    @Override
    public Integer saveKyThi(KyThiDTO chuongMonHocDTO) throws ConstraintViolationException {
     return  SingletonDaoUtil.getKyThiDAOImplInstance().save(KyThiBeanUtil.dto2Entity(chuongMonHocDTO)).getMaKyThi();
        
    }

    @Override
    public Integer deleteKyThi(Integer ID) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(ID);
        return SingletonDaoUtil.getKyThiDAOImplInstance().delete(list);
    }

    @Override
    public List<KyThiDTO> findAll() {
        List<KyThiDTO> list=new ArrayList<KyThiDTO>();
         List<KyThiEntity> entitys=SingletonDaoUtil.getKyThiDAOImplInstance().findAll();
        for(KyThiEntity item: entitys){
            KyThiDTO dto= KyThiBeanUtil.entity2Dto(item);
            list.add(dto);
            
        }
        return list;
    }
    
    
}
