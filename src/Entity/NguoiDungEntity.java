package Entity;

import DAO.NguoiDungDAO;

import DAOImpl.NguoiDungDAOImpl;
import java.sql.Date;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


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
    @Column(name = "sodienthoai")
     private String soDienThoai;
    @Column(name = "gioitinh")
    private String gioiTinh;
    @Column(name = "email")
    private String email;
    @ManyToOne
    @JoinColumn(name = "mavaitro")
    private VaiTroEntity vaiTroEntity;
    
    @OneToMany(mappedBy = "nguoiDungEntity",fetch = FetchType.LAZY) // tac gia cau hoi
    private List<CauHoiEntity> cauHoiEntitys;
    
    @OneToMany(mappedBy = "nguoiDungEntity1",fetch = FetchType.LAZY) // tac gia de thi
    private List<DeThiEntity> deThiEntitys;
    
    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY)
    private List<KetQuaEntity> ketQuaEntitys;
    
     @OneToMany(mappedBy = "nguoiDungEntity",fetch = FetchType.EAGER)
    private List<PhongThiEntity> phongThiList;

    public List<PhongThiEntity> getPhongThiList() {
        return phongThiList;
    }

    public void setPhongThiList(List<PhongThiEntity> phongThiList) {
        this.phongThiList = phongThiList;
    }

     
    public List<KetQuaEntity> getKetQuaEntitys() {
        return ketQuaEntitys;
    }

    public void setKetQuaEntitys(List<KetQuaEntity> ketQuaEntitys) {
        this.ketQuaEntitys = ketQuaEntitys;
    }
    

    public List<DeThiEntity> getDeThiEntitys() {
        return deThiEntitys;
    }

    public void setDeThiEntitys(List<DeThiEntity> deThiEntitys) {
        this.deThiEntitys = deThiEntitys;
    }

    
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

    public List<CauHoiEntity> getCauHoiEntitys() {
        return cauHoiEntitys;
    }

    public void setCauHoiEntitys(List<CauHoiEntity> cauHoiEntitys) {
        this.cauHoiEntitys = cauHoiEntitys;
    }
    
    
    

}
