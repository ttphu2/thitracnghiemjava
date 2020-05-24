package Util;

import DTO.VaiTroDTO;
import Entity.VaiTroEntity;



public class VaiTroBeanUtil {
    public static VaiTroDTO entity2Dto(VaiTroEntity entity){
        VaiTroDTO dto=new VaiTroDTO();
        dto.setMaVaiTro(entity.getMaVaiTro());
        dto.setTenVaiTro(entity.getTenVaiTro());
        return dto;
    }
    public static VaiTroEntity dto2Entity(VaiTroDTO dto){
        VaiTroEntity entity=new VaiTroEntity();
        entity.setMaVaiTro(dto.getMaVaiTro());
        entity.setTenVaiTro(dto.getTenVaiTro());
        return entity;
    }
}
