package com.amigoscode.springwithmongodb.Repository;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public interface UtilisateurRepository extends MongoRepository<Utilisateur, String>
{
    //Optional<Utilisateur> findUtilisateursByEmail(String email);
    @Query(value = "{email: ?0}")
    Optional<Utilisateur> findUtilisateursByEmail(String id);

    /*
    @Query(value = "{id: ?0}")
    Utilisateur trouverUser(String id);  on peut meme mettre un autre nom pour le methode sans soucis
     */

    //List<Utilisateur> findUtilisateursByNomContains(String nom);
    @Query("{nom: {$regex: ?0}}")
    Stream<Utilisateur> findUtilisateursByNomContains(String nom);

    //List<Utilisateur> findUtilisateursByPrenomOrNom(String prenom, String nom);
    @Query("{$or: [{prenom: ?0},{nom: ?1}]}")
    List<Utilisateur> findUtilisateursByPrenomOrNom(String prenom, String nom);



}
