/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.KetQuaDTO;
import DTO.KyThiDTO;
import Entity.KetQuaEntity;
import Entity.KyThiEntity;



/**
 *
 * @author hocgioinhatlop
 */
public class KetQuaBeanUtil {
    public static KetQuaDTO entity2Dto(KetQuaEntity entity) {
		KetQuaDTO dto = new KetQuaDTO();
		dto.setMaKetQua(entity.getMaKetQua());
		dto.setDiemBaiThi(entity.getDiemBaiThi());
                dto.setNgayTao(entity.getNgayTao());
                dto.setBaiThi(BaiThiBeanUtil.entity2Dto(entity.getBaiThiEntity()));
                dto.setNguoiDung(NguoiDungBeanUtil.entity2Dto(entity.getNguoiDung()));
                dto.setDeThi(DeThiBeanUtil.entity2Dto(entity.getDeThi()));
		return dto;
	}
	public static KetQuaEntity dto2Entity(KetQuaDTO dto) {
		KetQuaEntity entity = new KetQuaEntity();
		entity.setMaKetQua(dto.getMaKetQua());
		entity.setDiemBaiThi(dto.getDiemBaiThi());
                entity.setNgayTao(dto.getNgayTao());
                 entity.setBaiThiEntity(BaiThiBeanUtil.dto2Entity(dto.getBaiThi()));
                 entity.setNguoiDung(NguoiDungBeanUtil.dto2Entity(dto.getNguoiDung()));
                  entity.setDeThi(DeThiBeanUtil.dto2Entity(dto.getDeThi()));
		return entity;
	}
}
