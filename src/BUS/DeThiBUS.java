package BUS;



import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import Entity.DeThiEntity;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DeThiBUS {
 List<DeThiDTO> findAll();
 Integer saveDeThi(DeThiDTO deThiDTO); 
 void saveNoiDungDeThi (Set<CauHoiDTO> cauHoiDTOS,Integer maBaiThi);
  void deleteDeThi (Integer maBaiThi);
// List<DeThiEntity> findEqualUnique(String property,Object value) ;

   
    
   
}
