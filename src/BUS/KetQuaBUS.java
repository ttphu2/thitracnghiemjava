package BUS;



import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import java.util.List;


public interface KetQuaBUS {
	KetQuaDTO saveResult(String userName, Integer maBaiThi, List<CauHoiDTO> listCauHoi);

}
