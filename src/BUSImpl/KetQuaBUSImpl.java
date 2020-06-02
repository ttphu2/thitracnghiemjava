package BUSImpl;



import BUS.KetQuaBUS;
import DAO.SingletonDaoUtil;
import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import Entity.DeThiEntity;
import Entity.KetQuaEntity;
import Entity.NguoiDungEntity;
import Util.KetQuaBeanUtil;
import java.sql.Timestamp;
import java.util.List;


public class KetQuaBUSImpl implements KetQuaBUS {
	public KetQuaDTO saveResult(String userName, Integer maBaiThi, List<CauHoiDTO> listCauHoi) {
		KetQuaDTO result = new KetQuaDTO();
		if (userName != null && maBaiThi != null && listCauHoi != null) {
			List<NguoiDungEntity> list = SingletonDaoUtil.getNguoiDungDAOInstance().findEqualUnique("name", userName);
			NguoiDungEntity user=list.get(0);                                            
                        DeThiEntity examination = SingletonDaoUtil.getDeThiDAOInstance().findbyID(maBaiThi);
			KetQuaEntity resultEntity = new KetQuaEntity();
			calculateListenAndReadScore(resultEntity, listCauHoi,examination);// tinh toan diem thi
			initDataToResultEntity(resultEntity, user, examination);
			resultEntity = SingletonDaoUtil.getKetQuaDAOInstance().save(resultEntity);
			result = KetQuaBeanUtil.entity2Dto(resultEntity);
                        
		}
		return result;
	}

	private void initDataToResultEntity(KetQuaEntity resultEntity, NguoiDungEntity user, DeThiEntity examination) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		resultEntity.setDeThi(examination);
		resultEntity.setNguoiDung(user);
		resultEntity.setNgayTao(timestamp);
	}

	private void calculateListenAndReadScore(KetQuaEntity resultEntity, List<CauHoiDTO> examinationQuestions,DeThiEntity deThi) {
		
		int diemThi = 0;
                double diem1Cau=deThi.getDiemToiDa()/deThi.getSlCauHoi();
		for (CauHoiDTO item: examinationQuestions) {
			if (item.getDapAnDung()!= null) {
				if (item.getDapAnNguoiDung().equals(item.getDapAnDung())) {
					diemThi=(int) (diemThi+diem1Cau);
				}
			}
		}
		resultEntity.setDiemBaiThi(diemThi);
		
	}
}
