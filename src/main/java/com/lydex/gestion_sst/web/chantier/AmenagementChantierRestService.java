package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.AmenagementChantierRepository;
import com.lydex.gestion_sst.entities.chantier.Amenagenment_chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class AmenagementChantierRestService {
    @Autowired
    private AmenagementChantierRepository amenagementChantierRepository;

    @RequestMapping(value = "/amenagementChantier",method = RequestMethod.GET)
    public List<Amenagenment_chantier> getAmenagementsChantier(){return amenagementChantierRepository.findAll(); }

    @RequestMapping(value = "/amenagementChantier/{id}",method = RequestMethod.GET)
    public Optional<Amenagenment_chantier> getAmenagementChantier(@PathVariable Long id){return amenagementChantierRepository.findById(id);}
}
