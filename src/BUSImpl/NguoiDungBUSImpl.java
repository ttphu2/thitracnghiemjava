package BUSImpl;



import BUS.NguoiDungBUS;
import DAO.SingletonDaoUtil;
import DTO.CheckLogin;
import DTO.NguoiDungDTO;
import Entity.NguoiDungEntity;
import Util.NguoiDungBeanUtil;
import java.sql.Timestamp;
import java.util.*;
import javax.swing.JTable;
import org.hibernate.exception.ConstraintViolationException;

public class NguoiDungBUSImpl implements NguoiDungBUS {


    public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit,String whereClause) {
        Object[] objects = SingletonDaoUtil.getNguoiDungDAOInstance().findByProperty(property, sortExpression, sortDirection, offset, limit,whereClause);
        List<NguoiDungDTO> userDTOS = new ArrayList<NguoiDungDTO>();
        for (NguoiDungEntity item : (List<NguoiDungEntity>) objects[1]) {
            NguoiDungDTO userDTO = NguoiDungBeanUtil.entity2Dto(item);
            userDTOS.add(userDTO);
        }
        objects[1] = userDTOS;
        return objects;
    }

    public NguoiDungDTO findById(Integer userId) {
        NguoiDungEntity entity = SingletonDaoUtil.getNguoiDungDAOInstance().findbyID(userId);
        NguoiDungDTO dto = NguoiDungBeanUtil.entity2Dto(entity);
        return dto;

    }

    public Integer saveUser(NguoiDungDTO userDTO) throws ConstraintViolationException {
        Timestamp createdDate = new Timestamp(System.currentTimeMillis());
        userDTO.setNgayTao(createdDate);
        NguoiDungEntity entity = NguoiDungBeanUtil.dto2Entity(userDTO);
        entity=SingletonDaoUtil.getNguoiDungDAOInstance().save(entity);
        return entity.getMaNguoiDung();
    }

    public NguoiDungDTO updateUser(NguoiDungDTO userDTO) {
        NguoiDungEntity entity = NguoiDungBeanUtil.dto2Entity(userDTO);
        entity = SingletonDaoUtil.getNguoiDungDAOInstance().update(entity);
        userDTO = NguoiDungBeanUtil.entity2Dto(entity);
        return userDTO;
    }
    
    
    public List<NguoiDungDTO> findSinhVien() {
        Map<String,Object> property= new HashMap<String, Object>();
        property.put("maVaiTro", "1");     
        Object[] objects =  this.findByProperty(property, null, null, null, null,"");
        // List<NguoiDungDTO> list= (List<NguoiDungDTO>) objects[1];
       return (List<NguoiDungDTO>) objects[1];
      
    }

    public CheckLogin checkLogin(String name, String password) {
        CheckLogin checkLogin = new CheckLogin();
        if (name != null && password != null) {
            Object[] objects = SingletonDaoUtil.getNguoiDungDAOInstance().checkLogin(name, password);
            checkLogin.setUserExist((Boolean) objects[0]);
            if (checkLogin.isUserExist()) {
                checkLogin.setRoleName(objects[1].toString());
            }
        }
      return checkLogin;
   }
//
//    public void ValidateImportUser(List<UserImportDTO> userImportDTOS) {
//        List<String> names = new ArrayList<String>();
//        List<String> roles = new ArrayList<String>();
//        for (UserImportDTO item : userImportDTOS) {
//            if (item.isValid()) {
//                names.add(item.getUserName());
//                if (!roles.contains(item.getRoleName())) {
//                    roles.add(item.getRoleName());
//                }
//            }
//        }
//        Map<String, UserEntity> userEntityMap = new HashMap<String, UserEntity>();
//        Map<String, RoleEntity> roleEntityMap = new HashMap<String, RoleEntity>();
//        if (names.size() > 0) {
//            List<UserEntity> userEntities = SingletonDaoUtil.getUserDaoInstance().findByUsers(names);
//            for (UserEntity item : userEntities) {
//                userEntityMap.put(item.getName().toUpperCase(), item);
//
//            }
//        }
//        if (roles.size() > 0) {
//            List<RoleEntity> roleEntities = SingletonDaoUtil.getRoleDaoInstance().findByRoles(roles);
//            for (RoleEntity item : roleEntities) {
//                roleEntityMap.put(item.getName().toUpperCase(), item);
//            }
//        }
//        for (UserImportDTO item : userImportDTOS) {
//            String message = item.getError();
//            if (item.isValid()) {
//                UserEntity userEntity = userEntityMap.get(item.getUserName().toUpperCase());
//                if (userEntity != null) {
//                    message += "<br/>";
//                    message += "Tên đăng nhập tồn tại";
//                }
//                RoleEntity roleEntity = roleEntityMap.get(item.getRoleName().toUpperCase());
//                if (roleEntity == null) {
//                    message += "<br/>";
//                    message += "Vai trò không tồn tại";
//                }
//                if (StringUtils.isNotBlank(message)) {
//                    item.setValid(false);
//                    item.setError(message.substring(5));
//                }
//            }
//        }
//    }
//
//    public void saveUserImport(List<UserImportDTO> userImportDTOS) {
//        for (UserImportDTO item : userImportDTOS) {
//            if(item.isValid()){
//            UserEntity userEntity=new UserEntity();
//            userEntity.setName(item.getUserName());
//            userEntity.setFullName(item.getFullName());
//            userEntity.setPassword(item.getPassword());
//            Timestamp timestamp= new Timestamp(System.currentTimeMillis());
//            userEntity.setCreatedDate(timestamp);
//            RoleEntity roleEntity = SingletonDaoUtil.getRoleDaoInstance().findEqualUnique("name",item.getRoleName().toUpperCase());
//            userEntity.setRoleEntity(roleEntity);
//            SingletonDaoUtil.getUserDaoInstance().save(userEntity);
//            }
//        }
//
//    }

    @Override
    public Integer deleteUsers(List<Integer> ids) {
        Integer result = SingletonDaoUtil.getNguoiDungDAOInstance().delete(ids);
        return result;
    }

    

    
}
