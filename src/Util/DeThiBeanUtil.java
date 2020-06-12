/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.MonHocDTO;
import Entity.CauHoiEntity;
import Entity.DeThiEntity;
import Entity.MonHocEntity;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hocgioinhatlop
 */
public class DeThiBeanUtil {
    public static DeThiDTO entity2Dto(DeThiEntity entity) {
		DeThiDTO dto = new DeThiDTO();
		dto.setMaDeThi(entity.getMaDeThi());
		dto.setTenDeThi(entity.getTenDeThi());
                dto.setSlCauHoi(entity.getSlCauHoi());
                dto.setSlCauHoiDe(entity.getSlCauHoiDe());
                dto.setSlCauHoiTb(entity.getSlCauHoiTb());
                dto.setSlCauHoiKho(entity.getSlCauHoiKho());
                dto.setDiemToiDa(entity.getDiemToiDa());
                dto.setThoiGian(entity.getThoiGian());
                dto.setChuongMonHocDTO(ChuongMonHocBeanUtil.entity2Dto(entity.getChuongMonHocEntity1()));
                dto.setKyThiDTO(KyThiBeanUtil.entity2Dto(entity.getKyThiEntity()));
                dto.setNguoiDungDTO(NguoiDungBeanUtil.entity2Dto(entity.getNguoiDungEntity1()));// tac gia
//                if(entity.getListCauHoi().size()>0){
//                
//                Set<CauHoiDTO> set=new HashSet<>();
//                for(CauHoiEntity item:entity.getListCauHoi()){
//                    CauHoiDTO temp= CauHoiBeanUtil.entity2Dto(item);
//                    set.add(temp);
//                }
//                dto.getListCauHoi().addAll(set);
//                }
             //   dto.setChuongMonHocList(entity.getChuongMonHocList());
		return dto;
	}
	public static DeThiEntity dto2Entity(DeThiDTO dto) {
		DeThiEntity entity = new DeThiEntity();
		entity.setMaDeThi(dto.getMaDeThi());
		entity.setTenDeThi(dto.getTenDeThi());
                entity.setSlCauHoi(dto.getSlCauHoi());
                entity.setSlCauHoiDe(dto.getSlCauHoiDe());
                entity.setSlCauHoiTb(dto.getSlCauHoiTb());
                entity.setSlCauHoiKho(dto.getSlCauHoiKho());
                entity.setDiemToiDa(dto.getDiemToiDa());
                entity.setThoiGian(dto.getThoiGian());
                entity.setChuongMonHocEntity1(ChuongMonHocBeanUtil.dto2Entity(dto.getChuongMonHocDTO()));
                entity.setKyThiEntity(KyThiBeanUtil.dto2Entity(dto.getKyThiDTO()));
                entity.setNguoiDungEntity1(NguoiDungBeanUtil.dto2Entity(dto.getNguoiDungDTO()));// tac gia
               // if ̣(dto.)
              //  entity.setListCauHoi();
//                if(dto.getListCauHoi().size()>0){
//                Set<CauHoiEntity> set=new HashSet<>();
//                for(CauHoiDTO item: dto.getListCauHoi()){
//                    CauHoiEntity temp= CauHoiBeanUtil.dto2Entity(item);
//                    set.add(temp);
//                }
//                entity.getListCauHoi().addAll(set);	
//                }
		return entity;
	}
}
