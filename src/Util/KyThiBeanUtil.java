/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.KyThiDTO;
import Entity.KyThiEntity;



/**
 *
 * @author hocgioinhatlop
 */
public class KyThiBeanUtil {
    public static KyThiDTO entity2Dto(KyThiEntity entity) {
		KyThiDTO dto = new KyThiDTO();
		dto.setMaKyThi(entity.getMaKyThi());
		dto.setTenKyThi(entity.getTenKyThi());
                dto.setDiaDiem(entity.getDiaDiem());
                dto.setNgayThi(entity.getNgayThi());
                dto.setNgayKetThuc(entity.getNgayKetThuc());                             
		return dto;
	}
	public static KyThiEntity dto2Entity(KyThiDTO dto) {
		KyThiEntity entity = new KyThiEntity();
		entity.setMaKyThi(dto.getMaKyThi());
		entity.setTenKyThi(dto.getTenKyThi());
                entity.setDiaDiem(dto.getDiaDiem());
                entity.setNgayThi(dto.getNgayThi());
                entity.setNgayKetThuc(dto.getNgayKetThuc());	
		return entity;
	}
}
