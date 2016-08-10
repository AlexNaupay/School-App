package com.devteam.school.app;

import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class Utils {
    
    public static void showErrorMessage(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void showInfoMessage(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Notificación", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean emailValidate(String email){
        if(email.isEmpty()) return false;
        
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

        return email.matches(EMAIL_REGEX);
    }

    public static boolean isDateInRange(Date date){
        LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("America/Lima"));
        LocalDate localDate = ldt.toLocalDate();

        LocalDate dateMin = LocalDate.of(1950, Month.JANUARY, 1);

        return localDate.isAfter(dateMin) && localDate.isBefore(LocalDate.now());
    }

    public static int currentYear(){
        return  LocalDate.now().getYear();
    }
    
}
