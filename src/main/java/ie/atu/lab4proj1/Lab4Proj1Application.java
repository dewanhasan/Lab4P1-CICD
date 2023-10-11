package ie.atu.lab4proj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab4Proj1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Proj1Application.class, args);
    }

}
