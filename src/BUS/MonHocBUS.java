package BUS;



import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import java.util.List;
import java.util.Map;

public interface MonHocBUS {

   // Object[] findByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    Integer saveMonHoc(MonHocDTO monhocDTO);
    Integer deleteMonHoc(Integer ID);
    List<MonHocDTO> findAll();
    
   // NguoiDungDTO updateUser(NguoiDungDTO userDTO);
   // List<NguoiDungDTO> findSinhVien();
    
   
}
