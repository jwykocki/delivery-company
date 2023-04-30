package application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            Customer customer1 = new Customer("John", "john@domain.com", "New York");
            Customer customer2 = new Customer("Julie", "julie@domain.com", "Tokio");
            CustomerRepository.save(customer1);
            CustomerRepository.save(customer2);
            CustomerRepository.findAll().forEach(System.out::println);
        };
    }
}
