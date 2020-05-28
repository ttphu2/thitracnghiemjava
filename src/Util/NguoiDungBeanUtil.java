package Util;

import DTO.NguoiDungDTO;
import Entity.NguoiDungEntity;



public class NguoiDungBeanUtil {
    public static NguoiDungDTO entity2Dto(NguoiDungEntity entity){
        NguoiDungDTO dto= new NguoiDungDTO();
        dto.setMaNguoiDung(entity.getMaNguoiDung());
        dto.setHo(entity.getHo());
        dto.setTen(entity.getTen());
        dto.setTenDayDu(entity.getTenDayDu());        
        dto.setTenDangNhap(entity.getTenDangNhap());
        dto.setMatKhau(entity.getMatKhau());
        dto.setNgaySinh(entity.getNgaySinh());
        dto.setNgayTao(entity.getNgayTao());
        dto.setSoDienThoai(entity.getSoDienThoai());
        dto.setGioiTinh(entity.getGioiTinh());
        dto.setEmail(entity.getEmail());
        dto.setVaiTroDTO(VaiTroBeanUtil.entity2Dto(entity.getVaiTroEntity()));
        return dto;

    }
    public static NguoiDungEntity dto2Entity(NguoiDungDTO dto){
        NguoiDungEntity entity= new NguoiDungEntity();
        entity.setMaNguoiDung(dto.getMaNguoiDung());
        entity.setHo(dto.getHo());
        entity.setTen(dto.getTen());
        entity.setTenDayDu(dto.getTenDayDu());        
        entity.setTenDangNhap(dto.getTenDangNhap());
        entity.setMatKhau(dto.getMatKhau());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setNgayTao(dto.getNgayTao());
        entity.setSoDienThoai(dto.getSoDienThoai());
        entity.setGioiTinh(dto.getGioiTinh());
        entity.setEmail(dto.getEmail());
       entity.setVaiTroEntity(VaiTroBeanUtil.dto2Entity(dto.getVaiTroDTO()));       
        return entity;

    }
}
