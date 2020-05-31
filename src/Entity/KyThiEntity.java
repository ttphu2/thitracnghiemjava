/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.MonHocDAO;
import DAOImpl.MonHocDAOImpl;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "kythi")
public class KyThiEntity {
    
     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKyThi;
     
    @Column(name="tenkythi")
    private String tenKyThi;
    
    @Column(name="ngaythi")
    private Date ngayThi;
    
    @Column(name="ngayketthuc")
    private Date ngayKetThuc;
    
     @Column(name="diadiem")
    private String diaDiem;
     
    @OneToMany(mappedBy = "kyThiEntity",fetch = FetchType.LAZY)
    private List<DeThiEntity> deThiEntitys;

    public List<DeThiEntity> getDeThiEntitys() {
        return deThiEntitys;
    }

    public void setDeThiEntitys(List<DeThiEntity> deThiEntitys) {
        this.deThiEntitys = deThiEntitys;
    }
    
    
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
