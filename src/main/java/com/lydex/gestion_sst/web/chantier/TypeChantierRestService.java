package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.TypeChantierRepository;
import com.lydex.gestion_sst.entities.chantier.Type_chantier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class TypeChantierRestService {
    @Autowired
    private TypeChantierRepository typeChantierRepository;

   @RequestMapping(value = "/typeChantier",method = RequestMethod.GET)
    public List<Type_chantier> getTypeChantiers(){return typeChantierRepository.findAll();}

    @RequestMapping(value = "/typeChantier/{id}",method = RequestMethod.GET)
    public Optional<Type_chantier> getTypeChantier(@PathVariable Long id){return typeChantierRepository.findById(id);}

    @RequestMapping(value = "/typeChantier",method = RequestMethod.POST)
    public Type_chantier SaveTypeChantier(@RequestBody Type_chantier typeChantier){return typeChantierRepository.save(typeChantier);}

    @RequestMapping(value="/typeChantier/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ typeChantierRepository.deleteById(id); return true;}

    @RequestMapping(value="/typeChantier/{id}",method = RequestMethod.PUT)
    private Type_chantier update(@PathVariable Long id,@RequestBody Type_chantier typeChantier){ typeChantier.setId_type(id); return typeChantierRepository.save(typeChantier);}

}
