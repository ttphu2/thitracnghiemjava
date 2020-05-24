package Entity;

import DAO.VaiTroDAO;
import DAOImpl.VaiTroDAOImpl;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vaitro")
public class VaiTroEntity {
    @Id
    @Column(name="mavaitro")
    private Integer maVaiTro;
    @Column(name="tenvaitro")
    private String tenVaiTro;
    
    @OneToMany(mappedBy = "vaiTroEntity",fetch = FetchType.LAZY)
    private List<NguoiDungEntity> nguoiDungEntityList;

    public Integer getMaVaiTro() {
        return maVaiTro;
    }

    public void setMaVaiTro(Integer maVaiTro) {
        this.maVaiTro = maVaiTro;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }

    public List<NguoiDungEntity> getNguoiDungEntityList() {
        return nguoiDungEntityList;
    }

    public void setNguoiDungEntityList(List<NguoiDungEntity> nguoiDungEntityList) {
        this.nguoiDungEntityList = nguoiDungEntityList;
    }
public static void main(String[] args){
        List<VaiTroEntity> entity= new ArrayList<VaiTroEntity>();
        VaiTroDAO vaitro=new VaiTroDAOImpl();
       entity= vaitro.findAll();
       for(VaiTroEntity item:entity){
           System.out.println(item.getTenVaiTro());
       }
    }
    
}
