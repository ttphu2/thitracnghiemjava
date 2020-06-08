package BUS;



import DTO.CheckLogin;
import DTO.NguoiDungDTO;
import java.util.List;
import java.util.Map;
import org.hibernate.exception.ConstraintViolationException;

public interface NguoiDungBUS {

    Object[] findByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause);
    NguoiDungDTO findById(Integer userId);
    Integer saveUser(NguoiDungDTO userDTO) throws ConstraintViolationException;
    NguoiDungDTO updateUser(NguoiDungDTO userDTO);
    List<NguoiDungDTO> findSinhVien();
    Integer deleteUsers(List<Integer> ids);
    public CheckLogin checkLogin(String name, String password);
   // CheckLogin checkLogin(String name, String password);
   // void ValidateImportUser(List<UserImportDTO> userImportDTOS);
   // void saveUserImport(List<UserImportDTO> userImportDTOS);
}
