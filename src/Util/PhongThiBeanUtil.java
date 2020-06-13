/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.MonHocDTO;
import DTO.PhongThiDTO;
import Entity.MonHocEntity;
import Entity.PhongThiEntity;

/**
 *
 * @author hocgioinhatlop
 */
public class PhongThiBeanUtil {
    public static PhongThiDTO entity2Dto(PhongThiEntity entity) {
		PhongThiDTO dto = new PhongThiDTO();
                dto.setID(entity.getID());
		dto.setMaPhong(entity.getMaPhong());
                dto.setTrangThai(entity.getTrangThai());
                dto.setDeThiDTO(DeThiBeanUtil.entity2Dto(entity.getDeThiEntity()));
                dto.setNguoiDungDTO(NguoiDungBeanUtil.entity2Dto(entity.getNguoiDungEntity()));
		return dto;
	}
	public static PhongThiEntity dto2Entity(PhongThiDTO dto) {
		PhongThiEntity entity = new PhongThiEntity();
                entity.setID(dto.getID());
		entity.setMaPhong(dto.getMaPhong());
                entity.setTrangThai(dto.getTrangThai());
                entity.setDeThiEntity(DeThiBeanUtil.dto2Entity(dto.getDeThiDTO()));
                entity.setNguoiDungEntity(NguoiDungBeanUtil.dto2Entity(dto.getNguoiDungDTO()));
		return entity;
	}
}
