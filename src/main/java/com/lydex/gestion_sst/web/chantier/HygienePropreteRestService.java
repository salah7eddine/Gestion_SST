package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.HygienePropreteRepository;
import com.lydex.gestion_sst.entities.chantier.Hygiene_proprete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class HygienePropreteRestService {
    @Autowired
    private HygienePropreteRepository hygienePropreteRepository;

    @RequestMapping(value = "/hygienePropretes",method = RequestMethod.GET)
    public List<Hygiene_proprete> getHygienePropretes(){return hygienePropreteRepository.findAll(); }

    @RequestMapping(value = "/hygieneProprete/{id}",method = RequestMethod.GET)
    public Optional<Hygiene_proprete> getHygieneProprete(@PathVariable Long id){return hygienePropreteRepository.findById(id);}
}
