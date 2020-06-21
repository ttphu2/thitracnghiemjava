package BUSImpl;



import BUS.KetQuaBUS;
import DAO.SingletonDaoUtil;
import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import Entity.BaiThiEntity;
import Entity.DeThiEntity;
import Entity.KetQuaEntity;
import Entity.NguoiDungEntity;
import Util.KetQuaBeanUtil;
import com.google.gson.Gson;
import java.sql.Timestamp;
import java.util.List;


public class KetQuaBUSImpl implements KetQuaBUS {
	public KetQuaDTO saveResult(Integer maNguoiDung, Integer maBaiThi, List<CauHoiDTO> listCauHoi) {
		KetQuaDTO result = new KetQuaDTO();
		if (maNguoiDung != null && maBaiThi != null && listCauHoi != null) {
			List<NguoiDungEntity> list = SingletonDaoUtil.getNguoiDungDAOInstance().findEqualUnique("maNguoiDung", maNguoiDung);
			NguoiDungEntity user=list.get(0);                                            
                        DeThiEntity deThi = SingletonDaoUtil.getDeThiDAOInstance().findbyID(maBaiThi);
			KetQuaEntity resultEntity = new KetQuaEntity();
			//tinh diem bai kiem tra
                        double diemSo = 0;
                        int soCauDung = 0;
                        int diemToiDa = deThi.getDiemToiDa();
                        double diem1Cau = (double) deThi.getDiemToiDa() / deThi.getSlCauHoi();
                        //   System.out.print(diem1Cau);
                        for (CauHoiDTO item : listCauHoi) {
                            if (item.getDapAnNguoiDung().equals(item.getDapAnDung())) {
                                diemSo += diem1Cau;
                                soCauDung++;
                            }
                        }
                        //ket thuc tinh diem bai kiem tra
                        
                        //luu bai thi vao csdl
                        Gson gson = new Gson();
                        String json = gson.toJson(listCauHoi);
                        BaiThiEntity baithi=new BaiThiEntity();
                        baithi.setNoiDung(json);
                         BaiThiEntity temp=SingletonDaoUtil.getBaiThiDAOInstance().save(baithi);
                         
			//ket thuc luu bai thi
                        
                        //add data vao ketqua de luu vao csdl
                        resultEntity.setBaiThiEntity(temp);
                        resultEntity.setNguoiDung(user);
                        resultEntity.setDeThi(deThi);
                        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                        resultEntity.setNgayTao(timestamp);
                        resultEntity.setDiemBaiThi((double)Math.round(diemSo * 10) / 10);
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

	
}
