package BUSImpl;



import BUS.VaiTroBUS;
import DAO.SingletonDaoUtil;
import DTO.VaiTroDTO;
import Entity.VaiTroEntity;
import Util.VaiTroBeanUtil;
import java.util.ArrayList;
import java.util.List;

public class VaiTroBUSImpl implements VaiTroBUS {

    public List<VaiTroDTO> findAll() {
        List<VaiTroEntity> entities= SingletonDaoUtil.getVaiTroDAOInstance().findAll();
        List<VaiTroDTO> dtos= new ArrayList<VaiTroDTO>();
        for(VaiTroEntity item:entities){
            VaiTroDTO dto= VaiTroBeanUtil.entity2Dto(item);
            dtos.add(dto);
        }
        return dtos;
    }
}
