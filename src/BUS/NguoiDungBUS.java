package BUS;



import DTO.NguoiDungDTO;
import java.util.List;
import java.util.Map;

public interface NguoiDungBUS {

    Object[] findByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    NguoiDungDTO findById(Integer userId);
    Integer saveUser(NguoiDungDTO userDTO);
    NguoiDungDTO updateUser(NguoiDungDTO userDTO);
    List<NguoiDungDTO> findSinhVien();
    
   // CheckLogin checkLogin(String name, String password);
   // void ValidateImportUser(List<UserImportDTO> userImportDTOS);
   // void saveUserImport(List<UserImportDTO> userImportDTOS);
}
