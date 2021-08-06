package com.amigoscode.springwithmongodb.Service;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService
{
    public void ajouterUtilisateur(Utilisateur utilisateur);

    public Utilisateur chercherUtilisateurParId(String id);

    public List<Utilisateur> listDesUtilisateurs();

    public Utilisateur modifierUtilisateur(Utilisateur utilisateur);

    public void supprimerUtilisateurParId(String id);

    public void supprimerUtilisateur(Utilisateur utilisateur);
}