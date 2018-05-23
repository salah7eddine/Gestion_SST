package com.lydex.gestion_sst.web.doc;



import com.lydex.gestion_sst.dao.doc.CompteRenduRepository;
import com.lydex.gestion_sst.dao.doc.EtatCpRenduRepository;
import com.lydex.gestion_sst.entities.doc.Compte_rendu;
import com.lydex.gestion_sst.entities.doc.Etat_compte_rendu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
public class CpRenduRestService {
    @Autowired
    private CompteRenduRepository compteRenduRepository;

    @Autowired
    private EtatCpRenduRepository etatCpRenduRepository;


    @RequestMapping(value = "/compteRendus",method = RequestMethod.GET)
    public List<Compte_rendu> getCompteRendus(){return compteRenduRepository.findAll();}

    @RequestMapping(value = "/compteRendu/{id}",method = RequestMethod.GET)
    public Optional<Compte_rendu> getCompteRendu(@PathVariable Long id){return compteRenduRepository.findById(id);}

    @RequestMapping(value = "/compteRendu",method = RequestMethod.POST)
    private Compte_rendu save(@RequestBody Compte_rendu compteRendu){return compteRenduRepository.save(compteRendu);}

    @RequestMapping(value = "/compteRenduByEtat/{id}",method = RequestMethod.PUT)
    private Compte_rendu update(@PathVariable Long id,@RequestBody Compte_rendu compteRendu){
        compteRendu.setId_compte_rendu(id);
        Etat_compte_rendu etatCompteRendu= etatCpRenduRepository.getOne(compteRendu.getEtatCompteRendu().getId_etat()+1);
        compteRendu.setEtatCompteRendu(etatCompteRendu);
    return compteRenduRepository.save(compteRendu);}




}
