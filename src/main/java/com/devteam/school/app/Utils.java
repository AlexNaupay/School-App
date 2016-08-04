package com.devteam.school.app;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Utils {
    
    public static void showErrorMessage(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean emailValidate(String email){
        if(email.isEmpty()) return false;
        
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        return email.matches(EMAIL_REGEX);
    }
    
}
