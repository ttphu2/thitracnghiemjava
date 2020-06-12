package Entity;

import javax.persistence.*;

@Entity
@Table(name = "chitietdethi")
public class ChiTietDeThiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "macauhoi")
    private CauHoiEntity cauHoiEntity;

    @ManyToOne
    @JoinColumn(name = "madethi")
    private DeThiEntity deThiEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CauHoiEntity getCauHoiEntity() {
        return cauHoiEntity;
    }

    public void setCauHoiEntity(CauHoiEntity cauHoiEntity) {
        this.cauHoiEntity = cauHoiEntity;
    }

    public DeThiEntity getDeThiEntity() {
        return deThiEntity;
    }

    public void setDeThiEntity(DeThiEntity deThiEntity) {
        this.deThiEntity = deThiEntity;
    }

   
}
