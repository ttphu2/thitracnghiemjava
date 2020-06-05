/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.MonHocDTO;
import Entity.MonHocEntity;

/**
 *
 * @author hocgioinhatlop
 */
public class MonHocBeanUtil {
    public static MonHocDTO entity2Dto(MonHocEntity entity) {
		MonHocDTO dto = new MonHocDTO();
		dto.setMaMonHoc(entity.getMaMonHoc());
		dto.setTenMonHoc(entity.getTenMonHoc());
                dto.setSoTinChi(entity.getSoTinChi());
             //   dto.setChuongMonHocList(entity.getChuongMonHocList());
		return dto;
	}
	public static MonHocEntity dto2Entity(MonHocDTO dto) {
		MonHocEntity entity = new MonHocEntity();
		entity.setMaMonHoc(dto.getMaMonHoc());
		entity.setTenMonHoc(dto.getTenMonHoc());
                entity.setSoTinChi(dto.getSoTinChi());
		return entity;
	}
}
