package com.amigoscode.springwithmongodb.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data @AllArgsConstructor @ToString
public class Adresse {

    private String pays;
    private String ville;
    private String codePostal;
}
