package Entity;

import javax.persistence.*;

@Entity
@Table(name = "phongthi")
public class PhongThiEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    
    @Column(name = "maphong")
    private Integer maPhong;
    
     @Column(name = "trangthai")
    private Integer trangThai;
     
    @ManyToOne
    @JoinColumn(name = "manguoidung")
    private NguoiDungEntity nguoiDungEntity;

    @ManyToOne
    @JoinColumn(name = "madethi")
    private DeThiEntity deThiEntity;

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
    
   

    public Integer getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Integer maPhong) {
        this.maPhong = maPhong;
    }

    public NguoiDungEntity getNguoiDungEntity() {
        return nguoiDungEntity;
    }

    public void setNguoiDungEntity(NguoiDungEntity nguoiDungEntity) {
        this.nguoiDungEntity = nguoiDungEntity;
    }

    public DeThiEntity getDeThiEntity() {
        return deThiEntity;
    }

    public void setDeThiEntity(DeThiEntity deThiEntity) {
        this.deThiEntity = deThiEntity;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    
   
   
}
