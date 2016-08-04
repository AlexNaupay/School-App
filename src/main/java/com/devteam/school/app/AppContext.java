package com.devteam.school.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private static ApplicationContext applicationContext;
    
    private AppContext(){
        
    }
    
    
    public static ApplicationContext getAppContext(){
        if (applicationContext == null)
            applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        return applicationContext;
    }

}
