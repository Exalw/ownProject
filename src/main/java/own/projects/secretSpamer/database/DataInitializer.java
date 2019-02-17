package own.projects.secretSpamer.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;
import own.projects.secretSpamer.model.Message;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Component
public class DataInitializer implements ServletContextInitializer {

    @Autowired
    MessageRepository messageRepo;

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        /*
        Message m = new Message();
        m.setMName("");
        m.setMText();
        messageRepo.save(m);
        */



    }
}
