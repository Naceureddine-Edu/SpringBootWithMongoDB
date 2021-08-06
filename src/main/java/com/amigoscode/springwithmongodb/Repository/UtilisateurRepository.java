package com.amigoscode.springwithmongodb.Repository;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UtilisateurRepository extends MongoRepository<Utilisateur, String>
{

}
