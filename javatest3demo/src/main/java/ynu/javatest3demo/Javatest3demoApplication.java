package ynu.javatest3demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Javatest3demoApplication {

    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Javatest3demoApplication.class);
        ApplicationContext ctx=SpringApplication.run(Javatest3demoApplication.class, args);
        logger.info("system start");
    }

}
