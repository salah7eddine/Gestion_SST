package com.lydex.gestion_sst.web.user;

import com.lydex.gestion_sst.dao.chantier.FonctionRepository;
import com.lydex.gestion_sst.entities.user.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FonctionRestService {

   /* @Autowired
    private FonctionRepository fonctionRepository;*/

    /*@RequestMapping(value = "/fonctions",method = RequestMethod.GET)
    public List<Fonction> fonctions(){return fonctionRepository.findAll();}*/


}
