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
}
