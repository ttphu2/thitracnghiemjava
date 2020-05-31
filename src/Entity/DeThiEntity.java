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
    @JoinColumn(name = "machuong")
    private ChuongMonHocEntity chuongMonHocEntity1;
    
    @ManyToOne
    @JoinColumn(name = "makythi")
    private KyThiEntity kyThiEntity;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "chitietdethi", 
    joinColumns = { @JoinColumn(name = "madethi") }, 
    inverseJoinColumns = {@JoinColumn(name = "macauhoi") })
  private Set<CauHoiEntity> listCauHoi = new HashSet<>();

    @OneToMany(mappedBy = "deThi", fetch = FetchType.LAZY)
    private List<KetQuaEntity> listKetQua;

    public List<KetQuaEntity> getListKetQua() {
        return listKetQua;
    }

    public void setListKetQua(List<KetQuaEntity> listKetQua) {
        this.listKetQua = listKetQua;
    }
    
    
    public Set<CauHoiEntity> getListCauHoi() {
        return listCauHoi;
    }

    public void setListCauHoi(Set<CauHoiEntity> listCauHoi) {
        this.listCauHoi = listCauHoi;
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

    public ChuongMonHocEntity getChuongMonHocEntity1() {
        return chuongMonHocEntity1;
    }

    public void setChuongMonHocEntity1(ChuongMonHocEntity chuongMonHocEntity1) {
        this.chuongMonHocEntity1 = chuongMonHocEntity1;
    }

    public KyThiEntity getKyThiEntity() {
        return kyThiEntity;
    }

    public void setKyThiEntity(KyThiEntity kyThiEntity) {
        this.kyThiEntity = kyThiEntity;
    }

    public void addCauHoi(CauHoiEntity entity) {
        this.listCauHoi.add(entity);
        entity.getListDeThi().add(this);
    }
  
    public void removeCauHoi(CauHoiEntity entity) {
        this.listCauHoi.remove(entity);
        entity.getListDeThi().remove(this);
    }
    
    

    
     
    
}
