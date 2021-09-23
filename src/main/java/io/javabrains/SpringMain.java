package io.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMain implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringMain.class, args);
        ctx.close();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hi");

        //int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
        //System.exit(exitCode);
    }
}
