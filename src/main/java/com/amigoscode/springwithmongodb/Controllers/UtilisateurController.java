package com.amigoscode.springwithmongodb.Controllers;


import com.amigoscode.springwithmongodb.Models.Utilisateur;
import com.amigoscode.springwithmongodb.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController
{
    @Autowired
    UtilisateurService utilisateurService;


    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurParId(@PathVariable String id)
    {
        return new ResponseEntity<>(utilisateurService.chercherUtilisateurParId(id), HttpStatus.FOUND);
    }

    @GetMapping()
    public ResponseEntity<List<Utilisateur>> getAllUtilisateur()
    {
        return new ResponseEntity<>(utilisateurService.listDesUtilisateurs(),HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity<Utilisateur>  ajouterUtilisateur(@RequestBody Utilisateur utilisateur)
    {
        utilisateurService.ajouterUtilisateur(utilisateur);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Utilisateur> modifierUtilisateur(@RequestBody Utilisateur utilisateur)
    {
        Utilisateur updatedUser = utilisateurService.modifierUtilisateur(utilisateur);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Utilisateur> supprimerUtilisateur(@RequestBody Utilisateur utilisateur)
    {
         utilisateurService.supprimerUtilisateur(utilisateur);
         return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Utilisateur>  supprimerUtilisateurParId(@PathVariable String id)
    {
        utilisateurService.supprimerUtilisateurParId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
