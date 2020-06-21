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
@Table(name = "baithi")
public class BaiThiEntity {
    
     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maBaiThi;
     
    @Column(name="noidung")
    private String noiDung;

    public Integer getMaBaiThi() {
        return maBaiThi;
    }

    public void setMaBaiThi(Integer maBaiThi) {
        this.maBaiThi = maBaiThi;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    
    

   
}
