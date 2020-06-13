/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class PhongThiDTO implements Serializable{
     private Integer maPhong;
     private NguoiDungDTO nguoiDungDTO;
     private DeThiDTO deThiDTO;
     private Integer trangThai;
      private Integer ID;
    public PhongThiDTO() {
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

     
    public Integer getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Integer maPhong) {
        this.maPhong = maPhong;
    }

    public NguoiDungDTO getNguoiDungDTO() {
        return nguoiDungDTO;
    }

    public void setNguoiDungDTO(NguoiDungDTO nguoiDungDTO) {
        this.nguoiDungDTO = nguoiDungDTO;
    }

    public DeThiDTO getDeThiDTO() {
        return deThiDTO;
    }

    public void setDeThiDTO(DeThiDTO deThiDTO) {
        this.deThiDTO = deThiDTO;
    }
     
     

    
     
    
}
