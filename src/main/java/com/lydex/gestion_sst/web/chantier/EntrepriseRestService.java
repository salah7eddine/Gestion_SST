package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.EntrepriseStRepository;
import com.lydex.gestion_sst.entities.chantier.Entreprise_st;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EntrepriseRestService {
    @Autowired
    private EntrepriseStRepository entrepriseStRepository;

    @RequestMapping(value = "/entrepriseSst",method = RequestMethod.GET)
    public List<Entreprise_st> getEntreprise(){return entrepriseStRepository.findAll();}

    @RequestMapping(value = "/entrepriseSst/{id}",method = RequestMethod.GET)
    public Optional<Entreprise_st> getVisiteHs(@PathVariable Long id){return entrepriseStRepository.findById(id);}
}
