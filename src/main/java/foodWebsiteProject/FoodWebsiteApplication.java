package foodWebsiteProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FoodWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodWebsiteApplication.class, args);
    }

}
