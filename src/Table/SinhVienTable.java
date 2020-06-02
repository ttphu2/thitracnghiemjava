/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import BUS.SingletonBusUtil;
import Constant.Constant;
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
public class SinhVienTable {
   
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Tên", "Họ", "Tên đầy đủ","Tên đăng nhập","Ngày Sinh","Giới tính","Số điện thoại","Email","Role"};
   

    public void showTable(ArrayList<NguoiDungDTO> userDTOS,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
       listObj=new ArrayList();
        for(NguoiDungDTO item:userDTOS){
       listObj.add(new Object[]{
                    
                    item.getMaNguoiDung(),
                    item.getTen(),
                    item.getHo(),
                    item.getTenDayDu(),
                    item.getTenDangNhap(),
                    item.getNgaySinh(),
                    item.getGioiTinh(),
                    item.getSoDienThoai(),
                    item.getEmail(),
                   "SINH VIÊN"
                    
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

    public class CheckBoxRenderer extends JCheckBox implements TableCellRenderer {

        CheckBoxRenderer() {
            setHorizontalAlignment(JLabel.CENTER);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                //super.setBackground(table.getSelectionBackground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(table.getBackground());
            }
            setSelected((value != null && ((Boolean) value).booleanValue()));
            return this;
        }
    }
    
}
