package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.AttitudeUrgenceRepository;
import com.lydex.gestion_sst.entities.chantier.Amenagenment_chantier;
import com.lydex.gestion_sst.entities.chantier.Attitude_urgence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class AttitudeUrgenceRestService {
    @Autowired
    private AttitudeUrgenceRepository attitudeUrgenceRepository;

    @RequestMapping(value = "/attitudeUrgences",method = RequestMethod.GET)
    public List<Attitude_urgence> getAttitudeUrgences(){return attitudeUrgenceRepository.findAll(); }

    @RequestMapping(value = "/attitudeUrgence/{id}",method = RequestMethod.GET)
    public Optional<Attitude_urgence> getAttitudeUrgence(@PathVariable Long id){return attitudeUrgenceRepository.findById(id);}
}
