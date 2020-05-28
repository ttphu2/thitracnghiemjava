package BUS;

import BUS.*;
import BUSImpl.ChuongMonHocBUSImpl;
import BUSImpl.MonHocBUSImpl;
import BUSImpl.NguoiDungBUSImpl;
import BUSImpl.VaiTroBUSImpl;



public class SingletonBusUtil {
    private static NguoiDungBUSImpl nguoiDungBUSImpl=null;
    private static VaiTroBUSImpl vaiTroBUSImpl=null;
    private static ChuongMonHocBUSImpl chuongMonHocBUSImpl=null;
    private static MonHocBUSImpl monHocBUSImpl=null;
//    private static ExaminationDaoImpl examinationDaoImpl=null;
//    private static ExaminationQuestionDaoImpl examinationQuestionDaoImpl=null;
//    private static ExerciseDaoImpl exerciseDaoImpl=null;
//    private static ExerciseQuestionDaoImpl exerciseQuestionDaoImpl=null;
//    private static ResultDaoImpl resultDaoImpl = null;

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
//    public static ExaminationDaoImpl getExaminationDaoInstance(){
//        if(examinationDaoImpl==null){
//            examinationDaoImpl=new ExaminationDaoImpl();
//        }
//        return examinationDaoImpl;
//    }
//    public static ExaminationQuestionDaoImpl getExaminationQuestionDaoInstance(){
//        if(examinationQuestionDaoImpl==null){
//            examinationQuestionDaoImpl=new ExaminationQuestionDaoImpl();
//        }
//        return examinationQuestionDaoImpl;
//    }
//    public static ExerciseDaoImpl getExerciseDaoInstance(){
//        if(exerciseDaoImpl==null){
//            exerciseDaoImpl=new ExerciseDaoImpl();
//        }
//        return exerciseDaoImpl;
//    }
//    public static ExerciseQuestionDaoImpl getExerciseQuestionDaoInstance(){
//        if(exerciseQuestionDaoImpl==null){
//            exerciseQuestionDaoImpl=new ExerciseQuestionDaoImpl();
//        }
//        return exerciseQuestionDaoImpl;
//    }
//    public static ResultDaoImpl getResultDaoInstance() {
//        if (resultDaoImpl == null) {
//            resultDaoImpl = new ResultDaoImpl();
//        }
//        return resultDaoImpl;
//    }
}
