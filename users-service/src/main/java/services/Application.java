package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

    @RequestMapping("/getuser")
    public String getUser() {
        return "TestUser";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
