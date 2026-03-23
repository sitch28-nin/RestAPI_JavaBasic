package com.sitch;

import com.sitch.entity.Product;
import com.sitch.repository.APIProduct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRestApiBasicApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootRestApiBasicApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(APIProduct apiProduct){
        return runner->{
            apiProduct.save(new Product(500.5 ,"Keyboard")) ;
            apiProduct.save(new Product(5224.2,"Computer")) ;
            System.out.println("Save complete");
        };
    }
}
