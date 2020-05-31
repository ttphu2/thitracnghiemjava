/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class KyThiDTO implements Serializable{
   
    private Integer maKyThi;        
    private String tenKyThi;       
    private Date ngayThi;     
    private Date ngayKetThuc;         
    private String diaDiem;

    public Integer getMaKyThi() {
        return maKyThi;
    }

    public void setMaKyThi(Integer maKyThi) {
        this.maKyThi = maKyThi;
    }

    public String getTenKyThi() {
        return tenKyThi;
    }

    public void setTenKyThi(String tenKyThi) {
        this.tenKyThi = tenKyThi;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
    
    
}
