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
    
    @ManyToOne
    @JoinColumn(name = "mamonhoc")
    private MonHocEntity monHocEntity;
    
     @OneToMany(mappedBy = "chuongMonHocEntity",fetch = FetchType.LAZY)
    private List<CauHoiEntity> cauHoiEntitys;

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
    public static void main(String[] args){
        List<MonHocEntity> entity= new ArrayList<MonHocEntity>();
        MonHocDAO vaitro=new  MonHocDAOImpl();
       entity= vaitro.findAll();
       
           System.out.println(entity.get(0).getTenMonHoc());
       
    }
}
