package BUSImpl;



import BUS.KetQuaBUS;
import DAO.SingletonDaoUtil;
import DTO.CauHoiDTO;
import DTO.KetQuaDTO;
import Entity.BaiThiEntity;
import Entity.CauHoiEntity;
import Entity.DeThiEntity;
import Entity.KetQuaEntity;
import Entity.NguoiDungEntity;
import Util.CauHoiBeanUtil;
import Util.KetQuaBeanUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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

	public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause) {
        Object[] objects = SingletonDaoUtil.getKetQuaDAOInstance().findByProperty(property, sortExpression, sortDirection, offset, limit,whereClause);
        List<KetQuaDTO> ketQuaDTOS = new ArrayList<KetQuaDTO>();
        for (KetQuaEntity item : (List<KetQuaEntity>) objects[1]) {
            KetQuaDTO ketQuaDTO = KetQuaBeanUtil.entity2Dto(item);
            ketQuaDTOS.add(ketQuaDTO);
        }
        objects[1] = ketQuaDTOS;
        return objects;
    }
      public List<CauHoiDTO> xemBaiThi(Integer maKQ)
      {
          List<CauHoiDTO> cauHoiDTOS=new ArrayList<CauHoiDTO>();
          KetQuaEntity kqEntity=SingletonDaoUtil.getKetQuaDAOInstance().findbyID(maKQ);
        String json= kqEntity.getBaiThiEntity().getNoiDung();
        Gson gson = new Gson();
        cauHoiDTOS=gson.fromJson(json, new TypeToken<List<CauHoiDTO>>(){}.getType());
         return cauHoiDTOS;
      }

	
}
