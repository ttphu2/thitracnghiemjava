/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class KetQuaDTO implements Serializable{   
    private Integer maKetQua;  
    private Double diemBaiThi;      
    private Timestamp ngayTao;   
    private DeThiDTO deThi; 
    private NguoiDungDTO nguoiDung;
    private BaiThiDTO baiThi;

    public BaiThiDTO getBaiThi() {
        return baiThi;
    }

    public void setBaiThi(BaiThiDTO baiThi) {
        this.baiThi = baiThi;
    }
    
    
    

    public Integer getMaKetQua() {
        return maKetQua;
    }

    public void setMaKetQua(Integer maKetQua) {
        this.maKetQua = maKetQua;
    }

    public Double getDiemBaiThi() {
        return diemBaiThi;
    }

    public void setDiemBaiThi(Double diemBaiThi) {
        this.diemBaiThi = diemBaiThi;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public DeThiDTO getDeThi() {
        return deThi;
    }

    public void setDeThi(DeThiDTO deThi) {
        this.deThi = deThi;
    }

    public NguoiDungDTO getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDungDTO nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
    
    
}
