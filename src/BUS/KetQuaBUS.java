package BUS;



import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import java.util.List;
import java.util.Map;


public interface KetQuaBUS {
	KetQuaDTO saveResult(Integer maNguoiDung, Integer maBaiThi, List<CauHoiDTO> listCauHoi);
        Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause);
        List<CauHoiDTO> xemBaiThi(Integer maKQ);
}
