package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.ChantierRepository;
import com.lydex.gestion_sst.dao.chantier.TypeChantierRepository;
import com.lydex.gestion_sst.entities.chantier.Chantier;
import com.lydex.gestion_sst.entities.chantier.Type_chantier;
import com.lydex.gestion_sst.entities.chantier.Visite_hs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")

public class ChantierRestService {
    @Autowired
    private ChantierRepository chantierRepository;


    @RequestMapping(value = "/chantiers",method = RequestMethod.GET)
    public List<Chantier> getChantier(){
        return chantierRepository.findAll();
    }

    @RequestMapping(value = "/chantier/{id}",method = RequestMethod.GET)
    public Optional<Chantier> getVisiteHs(@PathVariable Long id){return chantierRepository.findById(id);}

    @RequestMapping(value = "/chercherChantier",method = RequestMethod.GET)
    private Page<Chantier> chercher(@RequestParam(name = "mc",defaultValue ="") String mc,
                                     @RequestParam(name = "page",defaultValue = "0") int page,
                                     @RequestParam(name = "size",defaultValue = "10")int size)
    {return chantierRepository.chercher("%"+mc+"%",new PageRequest(page,size));}

    @RequestMapping(value = "/chantier",method = RequestMethod.POST)
    private Chantier save(@RequestBody Chantier chantier){return chantierRepository.save(chantier);}

    @RequestMapping(value="/chantier/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ chantierRepository.deleteById(id); return true;}

    @RequestMapping(value="/chantier/{id}",method = RequestMethod.PUT)
    private Chantier update(@PathVariable Long id,@RequestBody Chantier chantier){ chantier.setId_chantier(id); return chantierRepository.save(chantier);}








}
