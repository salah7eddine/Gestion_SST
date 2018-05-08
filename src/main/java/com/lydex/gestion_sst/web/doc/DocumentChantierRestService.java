package com.lydex.gestion_sst.web.doc;

import com.lydex.gestion_sst.dao.doc.DocumentChantierRepository;
import com.lydex.gestion_sst.entities.doc.Document_chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class DocumentChantierRestService {
    @Autowired
    private DocumentChantierRepository documentChantierRepository;

    @RequestMapping(value = "/documentChantiers",method = RequestMethod.GET)
    public List<Document_chantier> getdocumentChantiers(){return documentChantierRepository.findAll();}

    @RequestMapping(value = "/documentChantier/{id}",method = RequestMethod.GET)
    public Optional<Document_chantier> getdocumentChantier(@PathVariable Long id){return documentChantierRepository.findById(id);}

    @RequestMapping(value = "/documentChantier",method = RequestMethod.POST)
    private Document_chantier save(@RequestBody Document_chantier documentChantier){return documentChantierRepository.save(documentChantier);}



}
