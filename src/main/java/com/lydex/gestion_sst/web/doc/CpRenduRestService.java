package com.lydex.gestion_sst.web.doc;

import com.lydex.gestion_sst.dao.doc.EtatCpRenduRepository;
import com.lydex.gestion_sst.entities.doc.Etat_compte_rendu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CpRenduRestService {
    @Autowired
    private EtatCpRenduRepository etatCpRenduRepository;

    @RequestMapping(value = "/etatCompteRendus",method = RequestMethod.GET)
    public List<Etat_compte_rendu> etatCompteRendus(){return etatCpRenduRepository.findAll();}

}
