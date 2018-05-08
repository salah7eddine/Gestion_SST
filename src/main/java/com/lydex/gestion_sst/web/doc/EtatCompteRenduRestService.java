package com.lydex.gestion_sst.web.doc;

import com.lydex.gestion_sst.dao.doc.EtatCpRenduRepository;
import com.lydex.gestion_sst.entities.doc.Document_chantier;
import com.lydex.gestion_sst.entities.doc.Etat_compte_rendu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EtatCompteRenduRestService {
    @Autowired
    private EtatCpRenduRepository etatCpRenduRepository;

    @RequestMapping(value = "/etatCpRendu",method = RequestMethod.GET)
    public List<Etat_compte_rendu> getCompteRendus(){return etatCpRenduRepository.findAll();}

    @RequestMapping(value = "/etatCpRendu/{id}",method = RequestMethod.GET)
    public Optional<Etat_compte_rendu> getEtatCpRendu(@PathVariable Long id){return etatCpRenduRepository.findById(id);}

    @RequestMapping(value = "/etatCpRendu",method = RequestMethod.POST)
    private Etat_compte_rendu save(@RequestBody Etat_compte_rendu etatCompteRendu){return etatCpRenduRepository.save(etatCompteRendu);}


}
