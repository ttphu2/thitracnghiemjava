package BUS;



import DTO.KyThiDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import java.util.List;
import java.util.Map;

public interface KyThiBUS {
    KyThiDTO findById(Integer kyThiId);
    Integer saveKyThi(KyThiDTO kyThiDTO);
    Integer deleteKyThi(Integer ID);
    List<KyThiDTO> findAll();
   
    
   
}
