package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entities.Advisor;
import com.wellsfargo.counselor.repositories.AdvisorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }

    // Simple test runner to verify JPA + H2 setup works
    @Bean
    public CommandLineRunner demo(AdvisorRepository advisorRepo) {
        return args -> {
            // Create and save an advisor
            Advisor adv = new Advisor(
                    "Jane",
                    "Doe",
                    "123 Main St",
                    "555-1234",
                    "jane@wf.com",
                    null
            );
            advisorRepo.save(adv);

            // Print all advisors from DB
            advisorRepo.findAll().forEach(a ->
                    System.out.println("Advisor in DB: " + a.getFirstName() + " " + a.getLastName())
            );
        };
    }
}
