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

    @RequestMapping(value = "/amenagementChantier",method = RequestMethod.POST)
    public Amenagenment_chantier SaveAmenagementChantier(@RequestBody  Amenagenment_chantier amenagenmentChantier){return amenagementChantierRepository.save(amenagenmentChantier);}

    @RequestMapping(value="/amenagementChantier/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ amenagementChantierRepository.deleteById(id); return true;}

    @RequestMapping(value="/amenagementChantier/{id}",method = RequestMethod.PUT)
    private Amenagenment_chantier update(@PathVariable Long id,@RequestBody Amenagenment_chantier amenagenmentChantier){ amenagenmentChantier.setId_amenag_chantier(id); return amenagementChantierRepository.save(amenagenmentChantier);}

}
