package BUS;

import BUS.*;
import BUSImpl.ChuongMonHocBUSImpl;
import BUSImpl.KetQuaBUSImpl;
import BUSImpl.KyThiBUSImpl;
import BUSImpl.MonHocBUSImpl;
import BUSImpl.NguoiDungBUSImpl;
import BUSImpl.VaiTroBUSImpl;




public class SingletonBusUtil {
    private static NguoiDungBUSImpl nguoiDungBUSImpl=null;
    private static VaiTroBUSImpl vaiTroBUSImpl=null;
    private static ChuongMonHocBUSImpl chuongMonHocBUSImpl=null;
    private static MonHocBUSImpl monHocBUSImpl=null;
 //   private static DeThiBUSImpl deThiBUSImpl=null;
 //   private static CauHoiBUSImpl cauHoiBUSImpl=null;
    private static KetQuaBUSImpl ketQuaBUSImpl=null;
    private static KyThiBUSImpl kyThiBUSImpl=null;

    public static NguoiDungBUSImpl getNguoiDungBUSInstance(){
        if(nguoiDungBUSImpl==null){
            nguoiDungBUSImpl=new NguoiDungBUSImpl();
        }
        return nguoiDungBUSImpl;
    }
    public static VaiTroBUSImpl getVaiTroBUSInstance(){
        if(vaiTroBUSImpl==null){
            vaiTroBUSImpl=new VaiTroBUSImpl();
        }
        return vaiTroBUSImpl;
    }
    public static ChuongMonHocBUSImpl getChuongMonHocBUSInstance(){
        if(chuongMonHocBUSImpl==null){
            chuongMonHocBUSImpl=new ChuongMonHocBUSImpl();
       }
        return chuongMonHocBUSImpl;
    }
    public static MonHocBUSImpl getMonHocBUSInstance(){
        if(monHocBUSImpl==null){
            monHocBUSImpl=new MonHocBUSImpl();
        }        return monHocBUSImpl;
    }
//    public static DeThiBUSImpl getDeThiBUSInstance(){
//        if(deThiBUSImpl==null){
//            deThiBUSImpl=new DeThiBUSImpl();
//        }
//        return deThiBUSImpl;
//    }
//    public static CauHoiBUSImpl getCauHoiBUSInstance(){
//       if(cauHoiBUSImpl==null){
//            cauHoiBUSImpl=new CauHoiBUSImpl();
//       }
//        return cauHoiBUSImpl;
//   }
    public static KetQuaBUSImpl getKetQuaBUSInstance(){
      if(ketQuaBUSImpl==null){
           ketQuaBUSImpl=new KetQuaBUSImpl();
        }
        return ketQuaBUSImpl;
    }
   public static KyThiBUSImpl getKyThiBUSImplInstance(){
       if(kyThiBUSImpl==null){
           kyThiBUSImpl=new KyThiBUSImpl();
       }
        return kyThiBUSImpl;
   }
}
