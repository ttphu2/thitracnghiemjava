/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DAO.CauHoiDAO;
import DAOImpl.CauHoiDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cauhoi")
public class CauHoiEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maCauHoi;

    @Column(name = "hinhanh")
    private String hinhAnh;

    @Column(name = "nghe")
    private String nghe;

    @Column(name = "cauhoi")
    private String cauHoi;
    
    @Column(name = "doanvan")
    private String doanVan;

    @Column(name = "dapan1")
    private String dapAn1;

    @Column(name = "dapan2")
    private String dapAn2;

    @Column(name = "dapan3")
    private String dapAn3;

    @Column(name = "dapan4")
    private String dapAn4;

    @Column(name = "dapandung")
    private String dapAnDung;
    
    @Column(name = "dokho")
    private String doKho;
    
    @Column(name = "loaicauhoi")
    private String loaicauhoi;

    @ManyToOne
    @JoinColumn(name = "tacgia")
    private NguoiDungEntity nguoiDungEntity;
    
    @ManyToOne
    @JoinColumn(name = "machuong")
    private ChuongMonHocEntity chuongMonHocEntity;

    public Integer getMaCauHoi() {
        return maCauHoi;
    }

    public void setMaCauHoi(Integer maCauHoi) {
        this.maCauHoi = maCauHoi;
    }

   

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getDoanVan() {
        return doanVan;
    }

    public void setDoanVan(String doanVan) {
        this.doanVan = doanVan;
    }

    public String getDapAn1() {
        return dapAn1;
    }

    public void setDapAn1(String dapAn1) {
        this.dapAn1 = dapAn1;
    }

    public String getDapAn2() {
        return dapAn2;
    }

    public void setDapAn2(String dapAn2) {
        this.dapAn2 = dapAn2;
    }

    public String getDapAn3() {
        return dapAn3;
    }

    public void setDapAn3(String dapAn3) {
        this.dapAn3 = dapAn3;
    }

    public String getDapAn4() {
        return dapAn4;
    }

    public void setDapAn4(String dapAn4) {
        this.dapAn4 = dapAn4;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    public String getLoaicauhoi() {
        return loaicauhoi;
    }

    public void setLoaicauhoi(String loaicauhoi) {
        this.loaicauhoi = loaicauhoi;
    }

    public NguoiDungEntity getNguoiDungEntity() {
        return nguoiDungEntity;
    }

    public void setNguoiDungEntity(NguoiDungEntity nguoiDungEntity) {
        this.nguoiDungEntity = nguoiDungEntity;
    }

    public ChuongMonHocEntity getChuongMonHocEntity() {
        return chuongMonHocEntity;
    }

    public void setChuongMonHocEntity(ChuongMonHocEntity chuongMonHocEntity) {
        this.chuongMonHocEntity = chuongMonHocEntity;
    }
     public static void main(String[] args){
        
        List<CauHoiEntity> entity= new ArrayList<CauHoiEntity>();
        CauHoiDAO vaitro=new CauHoiDAOImpl();
       entity= vaitro.findAll();
       
           System.out.println(entity.get(0).getNguoiDungEntity().getTenDayDu());
       
    }
    
}
