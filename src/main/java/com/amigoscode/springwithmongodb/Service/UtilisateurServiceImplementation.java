package com.amigoscode.springwithmongodb.Service; //NOSONAR


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import com.amigoscode.springwithmongodb.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UtilisateurServiceImplementation implements UtilisateurService
{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.insert(utilisateur);
    }

    @Override
    public Utilisateur chercherUtilisateurParId(String id) {
        return utilisateurRepository.findById(id).get(); //NOSONAR
    }

    @Override
    public List<Utilisateur> listDesUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void supprimerUtilisateurParId(String id) {
         utilisateurRepository.deleteById(id);
    }

    @Override
    public void supprimerUtilisateur(Utilisateur utilisateur) {
         utilisateurRepository.delete(utilisateur);
    }
}