package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.RqsRepository;
import com.lydex.gestion_sst.entities.chantier.Rqs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class RqsRestService {
    @Autowired
    private RqsRepository rqsRepository;

    @RequestMapping(value = "/rqs",method = RequestMethod.GET)
    public List<Rqs> getrsqs(){return rqsRepository.findAll(); }

    @RequestMapping(value = "/rqs/{id}",method = RequestMethod.GET)
    public Optional<Rqs> getrsq(@PathVariable Long id){return rqsRepository.findById(id);}
}
