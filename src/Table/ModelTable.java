/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import DTO.NguoiDungDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class ModelTable extends AbstractTableModel{
    private String path;

    private ArrayList list = null;
    private String[] columns = null;
    public ModelTable(ArrayList list, String[] columns) {
        setList(list);
        setColumns(columns);
    }

    public ModelTable() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    

    @Override
    public int getRowCount() {
         return list.size();
    }

    @Override
    public int getColumnCount() {
         return columns.length;
    }

    @Override
     public String getColumnName(int numCol) {
        return columns[numCol];
    }
    @Override
    public Object getValueAt(int numLi, int numCol) {
       Object[] objects = (Object[]) getList().get(numLi);
        return objects[numCol];
    }
    public void removeRow(int Row){
        list.remove(Row);
    }
    
}
