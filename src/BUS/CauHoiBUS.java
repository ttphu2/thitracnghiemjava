package BUS;



import DTO.CauHoiDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import Entity.CauHoiEntity;
import java.util.List;
import java.util.Map;

public interface CauHoiBUS {
 Object[] findByProperty(Map<String,Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause);
 CauHoiDTO findById(Integer maCauHoi);  
 Integer saveCauHoi(CauHoiDTO cauHoiDTO);
 Integer deleteCauHois(List<Integer> ids);
 void saveCauHoiImport(List<CauHoiDTO> cauHoiDTOS);  
 List<CauHoiDTO> findEqualUnique(String property,Object value);
   
}
