package com.edubay;
//
//import com.edubay.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.edubay.controller","com.edubay.dao"})
public class ParcelApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(ParcelApplication.class, args);
    }

//    //run this only on profile 'demo', avoid run this in test
//    @Profile("demo")
//    @Bean
//    CommandLineRunner initDatabase(UserRepository repository) {
//        return args ->
//        {
//            repository.save(new User(1234L, "deva", "deva@asd.com", "admin", LocalDateTime.now(), LocalDate.now()));
//        };
//    }
}