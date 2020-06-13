package DAO;

import DAOImpl.CauHoiDAOImpl;
import DAOImpl.ChiTietDeThiDAOImpl;
import DAOImpl.ChuongMonHocDAOImpl;
import DAOImpl.DeThiDAOImpl;
import DAOImpl.KetQuaDAOImpl;
import DAOImpl.KyThiDAOImpl;
import DAOImpl.MonHocDAOImpl;
import DAOImpl.NguoiDungDAOImpl;
import DAOImpl.PhongThiDAOImpl;
import DAOImpl.VaiTroDAOImpl;



public class SingletonDaoUtil {
    private static NguoiDungDAOImpl nguoiDungDAOImpl=null;
    private static VaiTroDAOImpl vaiTroDAOImpl=null;
    private static ChuongMonHocDAOImpl chuongMonHocDAOImpl=null;
    private static MonHocDAOImpl monHocDAOImpl=null;
    private static DeThiDAOImpl deThiDAOImpl=null;
    private static CauHoiDAOImpl cauHoiDAOImpl=null;
    private static KetQuaDAOImpl ketQuaDAOImpl=null;
    private static KyThiDAOImpl kyThiDAOImpl=null;
    private static ChiTietDeThiDAOImpl ctdtDAOImpl=null;
    private static PhongThiDAOImpl phongThiDAOImpl=null;
//    private static ResultDaoImpl resultDaoImpl = null;

    public static NguoiDungDAOImpl getNguoiDungDAOInstance(){
        if(nguoiDungDAOImpl==null){
            nguoiDungDAOImpl=new NguoiDungDAOImpl();
        }
        return nguoiDungDAOImpl;
    }
    public static VaiTroDAOImpl getVaiTroDAOInstance(){
        if(vaiTroDAOImpl==null){
            vaiTroDAOImpl=new VaiTroDAOImpl();
        }
        return vaiTroDAOImpl;
    }
    public static ChuongMonHocDAOImpl getChuongMonHocDAOInstance(){
        if(chuongMonHocDAOImpl==null){
            chuongMonHocDAOImpl=new ChuongMonHocDAOImpl();
       }
        return chuongMonHocDAOImpl;
    }
    public static MonHocDAOImpl getMonHocDAOInstance(){
        if(monHocDAOImpl==null){
            monHocDAOImpl=new MonHocDAOImpl();
        }        return monHocDAOImpl;
    }
    public static DeThiDAOImpl getDeThiDAOInstance(){
        if(deThiDAOImpl==null){
            deThiDAOImpl=new DeThiDAOImpl();
        }
        return deThiDAOImpl;
    }
    public static CauHoiDAOImpl getCauHoiDAOInstance(){
       if(cauHoiDAOImpl==null){
            cauHoiDAOImpl=new CauHoiDAOImpl();
       }
        return cauHoiDAOImpl;
   }
    public static KetQuaDAOImpl getKetQuaDAOInstance(){
      if(ketQuaDAOImpl==null){
           ketQuaDAOImpl=new KetQuaDAOImpl();
        }
        return ketQuaDAOImpl;
    }
   public static KyThiDAOImpl getKyThiDAOImplInstance(){
       if(kyThiDAOImpl==null){
           kyThiDAOImpl=new KyThiDAOImpl();
       }
        return kyThiDAOImpl;
   }
   public static ChiTietDeThiDAOImpl getCTDTDAOImplInstance(){
       if(ctdtDAOImpl==null){
           ctdtDAOImpl=new ChiTietDeThiDAOImpl();
       }
        return ctdtDAOImpl;
   }
   public static PhongThiDAOImpl getPhongThiDAOInstance(){
       if(phongThiDAOImpl==null){
           phongThiDAOImpl=new PhongThiDAOImpl();
       }
        return phongThiDAOImpl;
   }
//    public static ResultDaoImpl getResultDaoInstance() {
//        if (resultDaoImpl == null) {
//            resultDaoImpl = new ResultDaoImpl();
//        }
//        return resultDaoImpl;
//    }
}
