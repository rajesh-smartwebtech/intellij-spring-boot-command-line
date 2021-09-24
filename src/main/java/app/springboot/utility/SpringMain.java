package app.springboot.utility;


import app.springboot.utility.MysqlDb.*;
import app.springboot.utility.MysqlDb.Schema.*;
import app.springboot.utility.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


import javax.swing.*;
import java.util.List;

@SpringBootApplication
public class SpringMain implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Autowired
    Service s;

    @Autowired
    AllSchema us;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringMain.class, args);
        //ctx.close();
    }

    @Override
    public void run(String... args) throws Exception {

        List<UserNotification> list = us.UserNotification.findAll();

        for ( UserNotification vv : list ) {
            System.out.println("Row " + vv.toString() );
        }

        this.CloseSpringApp();
    }

    private void CloseSpringApp(){
        int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
        System.exit(exitCode);
    }

}