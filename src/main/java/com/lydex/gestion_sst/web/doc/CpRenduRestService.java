package com.lydex.gestion_sst.web.doc;



import com.lydex.gestion_sst.dao.doc.CompteRenduRepository;
import com.lydex.gestion_sst.entities.doc.Compte_rendu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
public class CpRenduRestService {
    @Autowired
    private CompteRenduRepository compteRenduRepository;


    @RequestMapping(value = "/compteRendus",method = RequestMethod.GET)
    public List<Compte_rendu> getCompteRendus(){return compteRenduRepository.findAll();}

    @RequestMapping(value = "/compteRendu/{id}",method = RequestMethod.GET)
    public Optional<Compte_rendu> getCompteRendu(@PathVariable Long id){return compteRenduRepository.findById(id);}

    @RequestMapping(value = "/compteRendu",method = RequestMethod.POST)
    private Compte_rendu save(@RequestBody Compte_rendu compteRendu){return compteRenduRepository.save(compteRendu);}


}
