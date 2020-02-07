package open.ciro.shift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class Main extends SpringServletContainerInitializer {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }


}
