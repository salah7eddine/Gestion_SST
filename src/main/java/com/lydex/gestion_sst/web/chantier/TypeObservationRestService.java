package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.TypeObservationRepository;
import com.lydex.gestion_sst.entities.chantier.Type_observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class TypeObservationRestService {
    @Autowired
    private TypeObservationRepository typeObservationRepository;


    @RequestMapping(value = "/typeObseravtions",method = RequestMethod.GET)
    public List<Type_observation> getTypeObseravtions(){return typeObservationRepository.findAll();}

    @RequestMapping(value = "/typeObseravtion/{id}",method = RequestMethod.GET)
    public Optional<Type_observation> getTypeObseravtion(@PathVariable Long id){return typeObservationRepository.findById(id);}

    @RequestMapping(value = "/typeObservation",method = RequestMethod.POST)
    public Type_observation SaveTypeObservation(@RequestBody Type_observation typeObservation){return typeObservationRepository.save(typeObservation);}

    @RequestMapping(value="/typeObservation/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ typeObservationRepository.deleteById(id); return true;}

    @RequestMapping(value="/typeObservation/{id}",method = RequestMethod.PUT)
    private Type_observation update(@PathVariable Long id,@RequestBody Type_observation typeObservation){ typeObservation.setId_type_observation(id); return typeObservationRepository.save(typeObservation);}


}
