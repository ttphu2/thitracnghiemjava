/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import BUS.SingletonBusUtil;
import Constant.Constant;
import DTO.KetQuaDTO;
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
public class KetQuaTable {
   
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"Mã KQ","MSSV","Họ Tên","Tên Đăng Nhập","Mã Đề","Môn Thi","Điểm Thi"};
   

    public void showTable(ArrayList<KetQuaDTO> ketQuaDTOS,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
       listObj=new ArrayList();
        for(KetQuaDTO item:ketQuaDTOS){
       listObj.add(new Object[]{
                    
                    item.getMaKetQua(),
                    item.getNguoiDung().getMaNguoiDung(),
                    item.getNguoiDung().getTenDayDu(),
                    item.getNguoiDung().getTenDangNhap(),
                    item.getDeThi().getMaDeThi(),
                    item.getDeThi().getMonHocDTO().getTenMonHoc(),
                    item.getDiemBaiThi()
                    
                    
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
        table.getColumnModel().getColumn(1).setMaxWidth(50);
        table.getColumnModel().getColumn(1).setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
        table.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
       // CheckBoxRenderer checkBoxRenderer = new CheckBoxRenderer();
        //table.getColumnModel().getColumn(5).setCellRenderer(checkBoxRenderer);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    class ImageRenderer implements TableCellRenderer {

        public JLabel lbl = new JLabel();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            try {
                Object text = table.getValueAt(row, 1);
                File image = new File("C:\\photos\\person." + text + ".1.jpg");
                String path = image.getAbsolutePath();
                ImageIcon i = new ImageIcon(new ImageIcon(String.valueOf(path)).getImage().getScaledInstance(lbl.getWidth() + 50, lbl.getHeight() + 50, Image.SCALE_SMOOTH));
                lbl.setIcon(i);
                //lbl.setHorizontalTextPosition(CENTER);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lbl;
        }
    }

   
    
}
