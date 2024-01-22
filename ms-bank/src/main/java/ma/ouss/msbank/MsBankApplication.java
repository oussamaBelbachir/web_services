package ma.ouss.msbank;

import ma.ouss.msbank.entities.Compte;
import ma.ouss.msbank.entities.TypeCompte;
import ma.ouss.msbank.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class MsBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBankApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {

            Stream.of("oussama","anass","yassine").forEach(name -> {
                compteRepository.save(new Compte(null,Math.random()*80000,new Date(), TypeCompte.EPARGNE));
            });

            compteRepository.findAll().forEach(cmp -> {
                System.out.println(cmp.toString());
            });
            System.out.println("hellooo");
        };
    }

}
