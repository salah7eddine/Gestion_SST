package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.ServiceRepository;
import com.lydex.gestion_sst.entities.chantier.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ServicesRestService {

    @Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping(value = "/services",method = RequestMethod.GET)
    public List<Service> getServices(){return serviceRepository.findAll();}

    @RequestMapping(value = "/service/{id}",method = RequestMethod.GET)
    public Optional<Service> getVisiteHs(@PathVariable Long id){return serviceRepository.findById(id);}
}
