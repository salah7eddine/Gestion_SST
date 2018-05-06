package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.ActionRepository;
import com.lydex.gestion_sst.entities.chantier.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ActionRestService {
    @Autowired
    private ActionRepository actionRepository;

    @RequestMapping(value = "/actions",method = RequestMethod.GET)
    public List<Action> getActions(){return actionRepository.findAll(); }

    @RequestMapping(value = "/action/{id}",method = RequestMethod.GET)
    public Optional<Action> getAction(@PathVariable Long id){return actionRepository.findById(id);}

    @RequestMapping(value = "/action",method = RequestMethod.POST)
    public Action SaveAction(@RequestBody  Action action){return actionRepository.save(action);}

    @RequestMapping(value="/action/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ actionRepository.deleteById(id); return true;}

    @RequestMapping(value="/action/{id}",method = RequestMethod.PUT)
    private Action update(@PathVariable Long id,@RequestBody Action action){ action.setId_action(id); return actionRepository.save(action);}

}
