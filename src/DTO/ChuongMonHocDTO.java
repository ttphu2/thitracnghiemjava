/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import Entity.MonHocEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class ChuongMonHocDTO implements Serializable{
    private Integer maChuong;    
    private String tenChuong;    
    private MonHocDTO monHocDTO;
    private Integer soTiet;
    private List<CauHoiDTO> cauHoiDTOS;

    public ChuongMonHocDTO() {
    }

    public ChuongMonHocDTO(Integer maChuong, String tenChuong, MonHocDTO monHocDTO, Integer soTiet) {
        this.maChuong = maChuong;
        this.tenChuong = tenChuong;
        this.monHocDTO = monHocDTO;
        this.soTiet = soTiet;
    }

    public Integer getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(Integer soTiet) {
        this.soTiet = soTiet;
    }
    
    public Integer getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(Integer maChuong) {
        this.maChuong = maChuong;
    }

    public String getTenChuong() {
        return tenChuong;
    }

    public void setTenChuong(String tenChuong) {
        this.tenChuong = tenChuong;
    }

    public MonHocDTO getMonHocDTO() {
        return monHocDTO;
    }

    public void setMonHocDTO(MonHocDTO monHocDTO) {
        this.monHocDTO = monHocDTO;
    }

    public List<CauHoiDTO> getCauHoiDTOS() {
        return cauHoiDTOS;
    }

    public void setCauHoiDTOS(List<CauHoiDTO> cauHoiDTOS) {
        this.cauHoiDTOS = cauHoiDTOS;
    }

    
}
