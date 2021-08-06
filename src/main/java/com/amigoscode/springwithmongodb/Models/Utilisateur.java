package com.amigoscode.springwithmongodb.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.List;

@Data
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
    private ZonedDateTime creer;
}
