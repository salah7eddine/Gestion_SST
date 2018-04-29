package com.lydex.gestion_sst.web.user;

import com.lydex.gestion_sst.dao.user.FonctionRepository;
import com.lydex.gestion_sst.entities.user.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class FonctionRestService {
    @Autowired
    private FonctionRepository fonctionRepository;

    @RequestMapping(value = "/fonctions",method = RequestMethod.GET)
    public List<Fonction> getFonctions(){return fonctionRepository.findAll(); }

    @RequestMapping(value = "/fonction/{id}",method = RequestMethod.GET)
    public Optional<Fonction> getFonction(@PathVariable Long id){return fonctionRepository.findById(id);}
}
