
package com.devteam.school.app;

import javax.swing.table.DefaultTableModel;


public class TableModelSchool extends DefaultTableModel{
    
    public TableModelSchool(){
        super();
    }
    
    
    public TableModelSchool(Object[][] data, Object[] columnNames){
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
       return false;
    }


}
