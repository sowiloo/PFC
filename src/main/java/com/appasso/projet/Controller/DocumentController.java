package com.appasso.projet.Controller;


import com.appasso.projet.Document;

import com.appasso.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocumentController {
    @Autowired
    private DocumentRepository documentRepository;
    @GetMapping("/documents")
    public List<Document> getDocument(){
        return documentRepository.findAll();
    }

    @GetMapping("/documents/{id}")
    public ResponseEntity<Document> getDocument(@PathVariable Integer id){
        Optional<Document> document = documentRepository.findById(id);
        return ResponseEntity.ok().body(document.get());
    }

    @DeleteMapping("/documents/{id}")
    public void deleteDocument(@PathVariable Integer id){
        documentRepository.deleteById(id);
    }

    @PostMapping("/documents")
    public ResponseEntity<Document> createDocument(@Valid @RequestBody Document document) throws URISyntaxException {
        if(document.getIdDoc() != null) {
            throw new RuntimeException("un Document ne peux pas avoir le meme ID");
        }
        Document result = documentRepository.save(document);
        return ResponseEntity.created(new URI("/api/documents)"+result.getIdDoc())).body(result);
    }

    @PutMapping("/documents")
        public ResponseEntity<Document> updateDocument(@Valid @RequestBody Document document) throws URISyntaxException{
        if(document.getIdDoc() == null) {
            throw new RuntimeException("ID invalide");
        }
        Document result = documentRepository.save(document);
        return ResponseEntity.ok().body(result);
    }

}
