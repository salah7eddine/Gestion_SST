package com.lydex.gestion_sst.web.doc;

import com.lydex.gestion_sst.dao.doc.ReponseRepository;
import com.lydex.gestion_sst.entities.doc.Reponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ReponseRestService {

    @Autowired
    private ReponseRepository reponseRepository;

    @RequestMapping(value = "/reponses",method = RequestMethod.GET)
    private List<Reponse> getReponses(){return reponseRepository.findAll(); }

    @RequestMapping(value = "/reponse/{id}",method = RequestMethod.GET)
    private Optional<Reponse> getReponse(@PathVariable Long id){ return reponseRepository.findById(id);}
}
