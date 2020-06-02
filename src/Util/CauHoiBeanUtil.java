/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.CauHoiDTO;
import Entity.CauHoiEntity;



/**
 *
 * @author hocgioinhatlop
 */
public class CauHoiBeanUtil {
    public static CauHoiDTO entity2Dto(CauHoiEntity entity) {
		CauHoiDTO dto = new CauHoiDTO();
		dto.setMaCauHoi(entity.getMaCauHoi());
		dto.setCauHoi(entity.getCauHoi());
                dto.setDoanVan(entity.getDoanVan());
                dto.setNghe(entity.getNghe());
                dto.setHinhAnh(entity.getHinhAnh());
                dto.setDoanVan(entity.getDoanVan());
                dto.setDapAn1(entity.getDapAn1());
                dto.setDapAn2(entity.getDapAn2());
                dto.setDapAn3(entity.getDapAn3());
                dto.setDapAn4(entity.getDapAn4());
                dto.setDapAnDung(entity.getDapAnDung());
                dto.setDoKho(entity.getDoKho());
                dto.setLoaiCauHoi(entity.getLoaiCauHoi());
                dto.setNguoiDungDTO(NguoiDungBeanUtil.entity2Dto(entity.getNguoiDungEntity()));
                dto.setChuongMonHocDTO(ChuongMonHocBeanUtil.entity2Dto(entity.getChuongMonHocEntity()));
                          
		return dto;
	}
	public static CauHoiEntity dto2Entity(CauHoiDTO dto) {
		CauHoiEntity entity = new CauHoiEntity();
		entity.setMaCauHoi(dto.getMaCauHoi());
		entity.setCauHoi(dto.getCauHoi());
                entity.setDoanVan(dto.getDoanVan());
                entity.setNghe(dto.getNghe());
                entity.setHinhAnh(dto.getHinhAnh());
                entity.setDoanVan(dto.getDoanVan());
                entity.setDapAn1(dto.getDapAn1());
                entity.setDapAn2(dto.getDapAn2());
                entity.setDapAn3(dto.getDapAn3());
                entity.setDapAn4(dto.getDapAn4());
                entity.setDapAnDung(dto.getDapAnDung());
                entity.setDoKho(dto.getDoKho());
                 entity.setLoaiCauHoi(dto.getLoaiCauHoi());
                entity.setNguoiDungEntity(NguoiDungBeanUtil.dto2Entity(dto.getNguoiDungDTO()));
                entity.setChuongMonHocEntity(ChuongMonHocBeanUtil.dto2Entity(dto.getChuongMonHocDTO()));		
		return entity;
	}
}
