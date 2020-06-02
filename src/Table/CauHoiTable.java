/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import BUS.SingletonBusUtil;
import Constant.Constant;
import DTO.CauHoiDTO;
import DTO.NguoiDungDTO;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class CauHoiTable {
   
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Câu hỏi","Đáp Án 1","Đáp án 2","Đáp án 3","Đáp án 4","Đáp án đúng","Độ khó","Loại câu hỏi","Mã tác giả"};
   

    public void showTable(ArrayList<CauHoiDTO> cauHoiDTOS,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
       listObj=new ArrayList();
        for(CauHoiDTO item:cauHoiDTOS){
       listObj.add(new Object[]{
                    
                    item.getMaCauHoi(),
                    item.getCauHoi(),
                    item.getDapAn1(),
                    item.getDapAn2(),
                    item.getDapAn3(),
                    item.getDapAn4(),
                    item.getDapAnDung(),
                    item.getDoKho(),
                    item.getLoaiCauHoi(),
                    item.getNguoiDungDTO().getMaNguoiDung()
                    
                    });
            }    
        ModelTable model = new ModelTable(listObj, TenCot);
       
        initModel(model,table);
       
    }

    public void remove(int[] rows,JTable table) {
      
        ModelTable model = new ModelTable(listObj, TenCot);
        for(int i=0;i<rows.length;i++){
             model.removeRow(rows[i]);
             table.setModel((TableModel) model);
             initModel(model, table);
        }
       
        
        

    }
    public void showResult(JTable table) {
                      
        ModelTable model = new ModelTable(listObj, TenCot);
         initModel(model, table);
        
     
    }
    public void initModel(ModelTable model,JTable table)
    {
         table.setModel((TableModel) model);
         //table.getColumnModel().getColumn(0).setCellRenderer(new ControlPerson.ImageRenderer());
        //table.getColumnModel().getColumn(1).setWidth(10);
         table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
        table.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
       // CheckBoxRenderer checkBoxRenderer = new CheckBoxRenderer();
        //table.getColumnModel().getColumn(5).setCellRenderer(checkBoxRenderer);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
     
}
