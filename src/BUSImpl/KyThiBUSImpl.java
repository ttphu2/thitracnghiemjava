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

    
    
}
