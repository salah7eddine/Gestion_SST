package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.EpcEpiRepository;
import com.lydex.gestion_sst.entities.chantier.Epc_epi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EpcEpiRestService {
    @Autowired
    private EpcEpiRepository epcEpiRepository;

    @RequestMapping(value = "/epcEpis",method = RequestMethod.GET)
    public List<Epc_epi> getEpcEpis(){return epcEpiRepository.findAll();}

    @RequestMapping(value = "/epcEpi/{id}",method = RequestMethod.GET)
    public Optional<Epc_epi> getEpcEpi(@PathVariable Long id){return epcEpiRepository.findById(id);}

}
