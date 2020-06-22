/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.BaiThiDTO;
import DTO.KyThiDTO;
import Entity.BaiThiEntity;
import Entity.KyThiEntity;



/**
 *
 * @author hocgioinhatlop
 */
public class BaiThiBeanUtil {
    public static BaiThiDTO entity2Dto(BaiThiEntity entity) {
		BaiThiDTO dto = new BaiThiDTO();
		dto.setMaBaiThi(entity.getMaBaiThi());
                dto.setNoiDung(entity.getNoiDung());
		return dto;
	}
	public static BaiThiEntity dto2Entity(BaiThiDTO dto) {
		BaiThiEntity entity = new BaiThiEntity();
		entity.setMaBaiThi(dto.getMaBaiThi());
		entity.setNoiDung(dto.getNoiDung());
                
		return entity;
	}
}
