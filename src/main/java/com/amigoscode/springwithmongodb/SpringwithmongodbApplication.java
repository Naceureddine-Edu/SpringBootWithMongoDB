package com.amigoscode.springwithmongodb;

import com.amigoscode.springwithmongodb.Models.Adresse;
import com.amigoscode.springwithmongodb.Models.Genre;
import com.amigoscode.springwithmongodb.Models.Utilisateur;
import com.amigoscode.springwithmongodb.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringwithmongodbApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringwithmongodbApplication.class, args);
    }

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Bean
    CommandLineRunner runner()
    {
        return args -> {

            Adresse adresse = new Adresse("Maroc","casablanca","27001");
            List<String> fSujets = new ArrayList<>();
            fSujets.add("politique");
            fSujets.add("economie");
            fSujets.add("technologie");

            Utilisateur utilisateur = new Utilisateur(
                    null,"Hammouti",
                    "hamza",
                    "hamza@gmail.com",
                    Genre.HOMME,
                    adresse,
                    fSujets,
                    77.50,
                    LocalDateTime.now());

            utilisateurRepository.insert(utilisateur);
        };
    }
}
