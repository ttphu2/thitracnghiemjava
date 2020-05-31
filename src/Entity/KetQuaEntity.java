package Entity;

import Entity.DeThiEntity;
import Entity.NguoiDungEntity;
import javax.persistence.*;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "ketqua")
public class KetQuaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKetQua;

    @Column(name = "diembaithi")
    private Integer diemBaiThi;
   
    @Column(name = "ngaytao")
    private Timestamp ngayTao;

    @ManyToOne
    @JoinColumn(name = "madethi")
    private DeThiEntity deThi;

    @ManyToOne
    @JoinColumn(name = "manguoidung")
    private NguoiDungEntity nguoiDung;

    public Integer getMaKetQua() {
        return maKetQua;
    }

    public void setMaKetQua(Integer maKetQua) {
        this.maKetQua = maKetQua;
    }

    

    public Integer getDiemBaiThi() {
        return diemBaiThi;
    }

    public void setDiemBaiThi(Integer diemBaiThi) {
        this.diemBaiThi = diemBaiThi;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public DeThiEntity getDeThi() {
        return deThi;
    }

    public void setDeThi(DeThiEntity deThi) {
        this.deThi = deThi;
    }

    public NguoiDungEntity getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDungEntity nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    
}
