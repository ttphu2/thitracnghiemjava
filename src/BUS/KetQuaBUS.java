package BUS;



import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import java.util.List;


public interface KetQuaBUS {
	KetQuaDTO saveResult(Integer maNguoiDung, Integer maBaiThi, List<CauHoiDTO> listCauHoi);

}
