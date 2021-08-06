package com.amigoscode.springwithmongodb.Service;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import java.util.List;


public interface UtilisateurService
{
    public void ajouterUtilisateur(Utilisateur utilisateur);

    public Utilisateur chercherUtilisateurParId(String id);

    public List<Utilisateur> listDesUtilisateurs();

    public String modifierUtilisateur(String id, Utilisateur utilisateur);

    public void supprimerUtilisateurParId(String id);

    public void supprimerUtilisateur(Utilisateur utilisateur);
}