package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.EntiteRepository;
import com.lydex.gestion_sst.entities.chantier.Entite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EntiteRestService {
    @Autowired
    private EntiteRepository entiteRepository;

    @RequestMapping(value = "/entites",method = RequestMethod.GET)
    public List<Entite> getEntites(){return entiteRepository.findAll(); }

    @RequestMapping(value = "/entite/{id}",method = RequestMethod.GET)
    public Optional<Entite> getEntite(@PathVariable Long id){return entiteRepository.findById(id);}


    @RequestMapping(value = "/entite",method = RequestMethod.POST)
    public Entite SaveEntite(@RequestBody Entite entite){return entiteRepository.save(entite);}

    @RequestMapping(value="/entite/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ entiteRepository.deleteById(id); return true;}

    @RequestMapping(value="/entite/{id}",method = RequestMethod.PUT)
    private Entite update(@PathVariable Long id,@RequestBody Entite entite){ entite.setId_entite(id); return entiteRepository.save(entite);}

}
