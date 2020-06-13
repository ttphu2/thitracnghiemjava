package BUS;



import DTO.KyThiDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import DTO.PhongThiDTO;
import java.util.List;
import java.util.Map;

public interface PhongThiBUS {
//    KyThiDTO findById(Integer kyThiId);
//    Integer saveKyThi(KyThiDTO kyThiDTO);
    
//    List<KyThiDTO> findAll();
    List<PhongThiDTO> findAll();
    List<PhongThiDTO> findByProperties(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause);
    List<NguoiDungDTO> findSinhVienByEqualUnique(String property,Object value);
    List<PhongThiDTO> findListIdPhongThi();
    Integer deleteDeThi(Integer ID);
   
}
