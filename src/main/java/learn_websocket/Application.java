package learn_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


//springboot启动类

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String [] args){
		SpringApplication.run(Application.class);
	}
	
	
}
