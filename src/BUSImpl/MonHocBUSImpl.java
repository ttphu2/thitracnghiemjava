/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSImpl;


import BUS.MonHocBUS;
import DAO.SingletonDaoUtil;
import DTO.MonHocDTO;
import Entity.MonHocEntity;
import Util.MonHocBeanUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hocgioinhatlop
 */
public class MonHocBUSImpl implements MonHocBUS{

    @Override
    public Integer saveMonHoc(MonHocDTO monhocDTO) throws ConstraintViolationException {
         MonHocEntity entity=null;
        
       entity=  SingletonDaoUtil.getMonHocDAOInstance().save(MonHocBeanUtil.dto2Entity(monhocDTO));
         
      return entity.getMaMonHoc();
    }

    @Override
    public Integer deleteMonHoc(Integer ID) 
    {
            List<Integer> ids= new ArrayList<Integer>();
            ids.add(ID);
      return SingletonDaoUtil.getMonHocDAOInstance().delete(ids);
    }

    @Override
    public List<MonHocDTO> findAll() {
        ArrayList <MonHocDTO> listSubjectName=new ArrayList<MonHocDTO>();      
        List<MonHocEntity> list=SingletonDaoUtil.getMonHocDAOInstance().findAll();           
        for(MonHocEntity item:list){
           MonHocDTO dto1=MonHocBeanUtil.entity2Dto(item);
           listSubjectName.add(dto1);
       }
        return listSubjectName;
    }
    
}
