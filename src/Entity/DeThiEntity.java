/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.CauHoiDAO;
import DAOImpl.CauHoiDAOImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "dethi")
public class DeThiEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maDeThi;

    @Column(name = "tendethi")
    private String tenDeThi;

    @Column(name = "thoigian")
    private Integer thoiGian;

    @Column(name = "diemtoida")
    private Integer diemToiDa;
    
    @Column(name = "slcauhoi")
    private Integer slCauHoi;

    @Column(name = "slcauhoide")
    private Integer slCauHoiDe;

    @Column(name = "slcauhoitb")
    private Integer slCauHoiTb;

    @Column(name = "slcauhoikho")
    private Integer slCauHoiKho;
    
    @ManyToOne
    @JoinColumn(name = "tacgia")
    private NguoiDungEntity nguoiDungEntity1;
    
    @ManyToOne
    @JoinColumn(name = "mamonhoc")
    private MonHocEntity monHocEntity;
    
    @ManyToOne
    @JoinColumn(name = "makythi")
    private KyThiEntity kyThiEntity;
    
    @OneToMany(mappedBy = "cauHoiEntity", fetch = FetchType.LAZY)
    private List<ChiTietDeThiEntity> ctdtEntityList;

    @OneToMany(mappedBy = "deThi", fetch = FetchType.LAZY)
    private List<KetQuaEntity> listKetQua;
    
    @OneToMany(mappedBy = "deThiEntity",fetch = FetchType.LAZY)
    private List<PhongThiEntity> phongThiList;

    public List<PhongThiEntity> getPhongThiList() {
        return phongThiList;
    }

    public void setPhongThiList(List<PhongThiEntity> phongThiList) {
        this.phongThiList = phongThiList;
    }
    
    
    
    public List<KetQuaEntity> getListKetQua() {
        return listKetQua;
    }

    public void setListKetQua(List<KetQuaEntity> listKetQua) {
        this.listKetQua = listKetQua;
    }

    public List<ChiTietDeThiEntity> getCtdtEntityList() {
        return ctdtEntityList;
    }

    public void setCtdtEntityList(List<ChiTietDeThiEntity> ctdtEntityList) {
        this.ctdtEntityList = ctdtEntityList;
    }

    public Integer getMaDeThi() {
        return maDeThi;
    }

    public void setMaDeThi(Integer maDeThi) {
        this.maDeThi = maDeThi;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public Integer getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Integer thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Integer getDiemToiDa() {
        return diemToiDa;
    }

    public void setDiemToiDa(Integer diemToiDa) {
        this.diemToiDa = diemToiDa;
    }

    public Integer getSlCauHoi() {
        return slCauHoi;
    }

    public void setSlCauHoi(Integer slCauHoi) {
        this.slCauHoi = slCauHoi;
    }

    public Integer getSlCauHoiDe() {
        return slCauHoiDe;
    }

    public void setSlCauHoiDe(Integer slCauHoiDe) {
        this.slCauHoiDe = slCauHoiDe;
    }

    public Integer getSlCauHoiTb() {
        return slCauHoiTb;
    }

    public void setSlCauHoiTb(Integer slCauHoiTb) {
        this.slCauHoiTb = slCauHoiTb;
    }

    public Integer getSlCauHoiKho() {
        return slCauHoiKho;
    }

    public void setSlCauHoiKho(Integer slCauHoiKho) {
        this.slCauHoiKho = slCauHoiKho;
    }

    public NguoiDungEntity getNguoiDungEntity1() {
        return nguoiDungEntity1;
    }

    public void setNguoiDungEntity1(NguoiDungEntity nguoiDungEntity1) {
        this.nguoiDungEntity1 = nguoiDungEntity1;
    }

    public MonHocEntity getMonHocEntity() {
        return monHocEntity;
    }

    public void setMonHocEntity(MonHocEntity monHocEntity) {
        this.monHocEntity = monHocEntity;
    }

    

    public KyThiEntity getKyThiEntity() {
        return kyThiEntity;
    }

    public void setKyThiEntity(KyThiEntity kyThiEntity) {
        this.kyThiEntity = kyThiEntity;
    }

    
    
    

    
     
    
}
