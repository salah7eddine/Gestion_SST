package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.TypeOperationRepository;
import com.lydex.gestion_sst.entities.chantier.Type_observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class TypeOperationRestService {
    @Autowired
    private TypeOperationRepository typeOperationRepository;


}
