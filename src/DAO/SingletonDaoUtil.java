package DAO;

import DAOImpl.ChuongMonHocDAOImpl;
import DAOImpl.MonHocDAOImpl;
import DAOImpl.NguoiDungDAOImpl;
import DAOImpl.VaiTroDAOImpl;



public class SingletonDaoUtil {
    private static NguoiDungDAOImpl nguoiDungDAOImpl=null;
    private static VaiTroDAOImpl vaiTroDAOImpl=null;
    private static ChuongMonHocDAOImpl chuongMonHocDAOImpl=null;
    private static MonHocDAOImpl monHocDAOImpl=null;
//    private static ExaminationDaoImpl examinationDaoImpl=null;
//    private static ExaminationQuestionDaoImpl examinationQuestionDaoImpl=null;
//    private static ExerciseDaoImpl exerciseDaoImpl=null;
//    private static ExerciseQuestionDaoImpl exerciseQuestionDaoImpl=null;
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
