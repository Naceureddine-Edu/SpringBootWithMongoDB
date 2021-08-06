package com.amigoscode.springwithmongodb.Models;


import lombok.Data;


@Data
public class Adresse {

    private String pays;
    private String ville;
    private String codePostal;
}
