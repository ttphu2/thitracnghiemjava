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
public class NguoiDungDTO implements Serializable{
    private Integer maNguoiDung;
    private String tenDangNhap;
    private String matKhau;
    private String ten;
    private String ho;
    private String tenDayDu;
    private Date ngaySinh;
    private Timestamp ngayTao;
    private String soDienThoai;
    private String gioiTinh;
    private String email;
    private VaiTroDTO vaiTroDTO;
    private List<CauHoiDTO> cauHoiDTOs;

    public Integer getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(Integer maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDayDu() {
        return tenDayDu;
    }

    public void setTenDayDu(String tenDayDu) {
        this.tenDayDu = tenDayDu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public VaiTroDTO getVaiTroDTO() {
        return vaiTroDTO;
    }

    public void setVaiTroDTO(VaiTroDTO vaiTroDTO) {
        this.vaiTroDTO = vaiTroDTO;
    }

    public List<CauHoiDTO> getCauHoiDTOs() {
        return cauHoiDTOs;
    }

    public void setCauHoiDTOs(List<CauHoiDTO> cauHoiDTOs) {
        this.cauHoiDTOs = cauHoiDTOs;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
