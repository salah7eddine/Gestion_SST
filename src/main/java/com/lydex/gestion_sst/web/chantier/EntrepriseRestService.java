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
    public Optional<Entreprise_st> getEntreprises(@PathVariable Long id){return entrepriseStRepository.findById(id);}

    @RequestMapping(value = "/entrepriseSst",method = RequestMethod.POST)
    public Entreprise_st SaveEntrepriseSst(@RequestBody Entreprise_st entrepriseSt){return entrepriseStRepository.save(entrepriseSt);}

    @RequestMapping(value="/entrepriseSst/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ entrepriseStRepository.deleteById(id); return true;}

    @RequestMapping(value="/entrepriseSst/{id}",method = RequestMethod.PUT)
    private Entreprise_st update(@PathVariable Long id,@RequestBody Entreprise_st entrepriseSt){ entrepriseSt.setId_entrep(id); return entrepriseStRepository.save(entrepriseSt);}

}
