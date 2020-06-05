/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.MonHocDAO;
import DAOImpl.MonHocDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author hocgioinhatlop
 */
@Entity
@Table(name = "chuongmonhoc")
public class ChuongMonHocEntity {
    
     @Id
    @Column(name="machuong")
    private Integer maChuong;
    @Column(name="tenchuong")
    private String tenChuong;
    @Column(name="sotiet")
    private Integer soTiet;
    
    
    @ManyToOne
    @JoinColumn(name = "mamonhoc")
    private MonHocEntity monHocEntity;
    
     @OneToMany(mappedBy = "chuongMonHocEntity",fetch = FetchType.LAZY)
    private List<CauHoiEntity> cauHoiEntitys;
     
     @OneToMany(mappedBy = "chuongMonHocEntity1",fetch = FetchType.LAZY)
    private List<DeThiEntity> deThiEntitys;

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

    public MonHocEntity getMonHocEntity() {
        return monHocEntity;
    }

    public void setMonHocEntity(MonHocEntity monHocEntity) {
        this.monHocEntity = monHocEntity;
    }

    public List<CauHoiEntity> getCauHoiEntitys() {
        return cauHoiEntitys;
    }

    public void setCauHoiEntitys(List<CauHoiEntity> cauHoiEntitys) {
        this.cauHoiEntitys = cauHoiEntitys;
    }

    public List<DeThiEntity> getDeThiEntitys() {
        return deThiEntitys;
    }

    public void setDeThiEntitys(List<DeThiEntity> deThiEntitys) {
        this.deThiEntitys = deThiEntitys;
    }
    
}
