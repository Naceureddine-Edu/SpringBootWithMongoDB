package com.amigoscode.springwithmongodb.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data @AllArgsConstructor @ToString
@Document
public class Utilisateur {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private Genre  genre;
    private Adresse adresse;
    private List<String> favouriteSubjects;
    private Double totalDepenseLivre;
    private LocalDateTime creer;
}
