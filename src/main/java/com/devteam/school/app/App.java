
package com.devteam.school.app;

import com.devteam.school.model.dao.ProfesorDao;
import com.devteam.school.views.AppFrame;
import com.devteam.school.views.LoginFrame;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;


public class App {

    @Autowired
    ProfesorDao teacherDao;

    private App(){
        ApplicationContext context = AppContext.getAppContext();

        AutowireCapableBeanFactory capableBeanFactory = context.getAutowireCapableBeanFactory();
        capableBeanFactory.autowireBean(this);
    }

    public void test(){
        
        AppFrame app = new AppFrame();
        AppFrame.setDefaultLookAndFeelDecorated(true);
//        LoginFrame app = new LoginFrame();
//        AppFrame.setDefaultLookAndFeelDecorated(true);
        
//        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenSkin");
//        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceRavenTheme");
        
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.SaharaSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
        
        
        app.setLocationRelativeTo(null);
        app.setVisible(true);

    }

    public static void main(String args[]) {        
        new App().test();

    }

}
