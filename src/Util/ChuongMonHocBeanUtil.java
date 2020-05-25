/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.ChuongMonHocDTO;
import DTO.MonHocDTO;
import Entity.ChuongMonHocEntity;
import Entity.MonHocEntity;

/**
 *
 * @author hocgioinhatlop
 */
public class ChuongMonHocBeanUtil {
    public static ChuongMonHocDTO entity2Dto(ChuongMonHocEntity entity) {
		ChuongMonHocDTO dto = new ChuongMonHocDTO();
		dto.setMaChuong(entity.getMaChuong());
		dto.setTenChuong(entity.getTenChuong());
                dto.setMonHocDTO(MonHocBeanUtil.entity2Dto(entity.getMonHocEntity()));
		return dto;
	}
	public static ChuongMonHocEntity dto2Entity(ChuongMonHocDTO dto) {
		ChuongMonHocEntity entity = new ChuongMonHocEntity();
		entity.setMaChuong(dto.getMaChuong());
		entity.setTenChuong(dto.getTenChuong());
                entity.setMonHocEntity(MonHocBeanUtil.dto2Entity(dto.getMonHocDTO()));		
		return entity;
	}
}
