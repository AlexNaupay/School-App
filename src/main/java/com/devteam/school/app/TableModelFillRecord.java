
package com.devteam.school.app;

import javax.swing.table.DefaultTableModel;


public class TableModelFillRecord extends DefaultTableModel{
    
    public TableModelFillRecord(){
        super();
    }
    
    
    public TableModelFillRecord(Object[][] data, Object[] columnNames){
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
       return !(column == 0 || column == 1 || column == 5);
    }
    
    @Override
    public Class getColumnClass(int column) {
        if (column == 0 || column == 1)       //second column accepts only Integer values
            return String.class;
        else return Integer.class;  //other columns accept String values
    }


}
