package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.ObservationRepository;
import com.lydex.gestion_sst.entities.chantier.Observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ObservationRestService {
    @Autowired
    private ObservationRepository observationRepository;

    @RequestMapping(value = "/observations",method = RequestMethod.GET)
    public List<Observation> getObservations(){return observationRepository.findAll(); }

    @RequestMapping(value = "/observation/{id}",method = RequestMethod.GET)
    public Optional<Observation> getObservation(@PathVariable Long id){return observationRepository.findById(id);}

    @RequestMapping(value = "/observation",method = RequestMethod.POST)
    public Observation SaveObservation(@RequestBody Observation observation){return observationRepository.save(observation);}

    @RequestMapping(value="/observation/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ observationRepository.deleteById(id); return true;}

    @RequestMapping(value="/observation/{id}",method = RequestMethod.PUT)
    private Observation update(@PathVariable Long id,@RequestBody Observation observation){ observation.setId_observation(id); return observationRepository.save(observation);}

}
