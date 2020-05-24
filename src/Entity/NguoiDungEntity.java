package Entity;

import DAO.NguoiDungDAO;

import DAOImpl.NguoiDungDAOImpl;
import java.sql.Date;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/6/2017.
 */
@Entity
@Table(name = "nguoidung")
public class NguoiDungEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNguoiDung;

    @Column(name = "tendangnhap")
    private String tenDangNhap;

    @Column(name = "matkhau")
    private String matKhau;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ho")
    private String ho;
    
    @Column(name = "tendaydu")
    private String tenDayDu;
    
    @Column(name = "ngaysinh")
    private Date ngaySinh;
    
    @Column(name = "ngaytao")
    private Timestamp ngayTao;
    
    @ManyToOne
    @JoinColumn(name = "mavaitro")
    private VaiTroEntity vaiTroEntity;
    
    @OneToMany(mappedBy = "nguoiDungEntity",fetch = FetchType.LAZY)
    private List<CauHoiEntity> cauHoiEntitys;

    public VaiTroEntity getVaiTroEntity() {
        return vaiTroEntity;
    }

    public void setVaiTroEntity(VaiTroEntity vaiTroEntity) {
        this.vaiTroEntity = vaiTroEntity;
    }

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
    
    public static void main(String[] args){
        
        List<NguoiDungEntity> entity= new ArrayList<NguoiDungEntity>();
        NguoiDungDAO vaitro=new NguoiDungDAOImpl();
       entity= vaitro.findAll();
       
           System.out.println(entity.get(0).getVaiTroEntity().getTenVaiTro());
       
    }
    

}
