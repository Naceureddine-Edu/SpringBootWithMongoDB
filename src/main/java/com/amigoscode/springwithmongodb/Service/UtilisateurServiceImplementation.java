package com.amigoscode.springwithmongodb.Service;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import com.amigoscode.springwithmongodb.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


public class UtilisateurServiceImplementation implements UtilisateurService
{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.insert(utilisateur);
        System.out.println("User Added");
    }

    @Override
    public Utilisateur chercherUtilisateurParId(String id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public List<Utilisateur> listDesUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public String modifierUtilisateur(String id, Utilisateur utilisateur) {
        Utilisateur newUser = utilisateurRepository.findById(id).get();
        return null;
    }

    @Override
    public void supprimerUtilisateurParId(String id) {
         utilisateurRepository.deleteById(id);
         System.out.println("User Deleted");
    }

    @Override
    public void supprimerUtilisateur(Utilisateur utilisateur) {
         utilisateurRepository.delete(utilisateur);
        System.out.println("User Deleted");
    }
}
