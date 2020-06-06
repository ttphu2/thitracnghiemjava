/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
@Table(name = "monhoc")
public class MonHocEntity {
    @Id
    @Column(name = "mamonhoc")
    private Integer maMonHoc;
      @Column(name = "tenmonhoc")
    private String tenMonHoc;
      
     @Column(name = "sotinchi")
    private Integer soTinChi;
     
    @OneToMany(mappedBy = "monHocEntity",fetch = FetchType.LAZY)
    private List<ChuongMonHocEntity> chuongMonHocList;

    public Integer getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(Integer soTinChi) {
        this.soTinChi = soTinChi;
    }

    
    
    public Integer getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(Integer maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public List<ChuongMonHocEntity> getChuongMonHocList() {
        return chuongMonHocList;
    }

    public void setChuongMonHocList(List<ChuongMonHocEntity> chuongMonHocList) {
        this.chuongMonHocList = chuongMonHocList;
    }
    
    
}
