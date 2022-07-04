package com.appasso.projet.Controller;


import com.appasso.projet.Document;
import com.appasso.projet.Projet;
import com.appasso.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProjetController {

    @Autowired
    private ProjetRepository projetRepository;


    @GetMapping("/projets")
    public List<Projet> getAllProjet(){
        return projetRepository.findAll();
    }

    @GetMapping("projets/{projetId}")
    public ResponseEntity<Projet> getProjet(@PathVariable Integer projetId){
        Optional<Projet> projet = projetRepository.findById(projetId);
        return ResponseEntity.ok().body(projet.get());
    }


}
