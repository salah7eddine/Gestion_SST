package com.lydex.gestion_sst.web.user;


import com.lydex.gestion_sst.dao.chantier.VisiteHsRepository;
import com.lydex.gestion_sst.dao.user.*;
import com.lydex.gestion_sst.entities.chantier.Visite_hs;
import com.lydex.gestion_sst.entities.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserRestService
{
    @Autowired
    private VisiteHsRepository visiteHsRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private VisiteurRepository visiteurRepository;
    @Autowired
    private AgentVisiteRepository agentVisiteRepository;
    @Autowired
    private VisiteurVisiteRepository visiteurVisiteRepository;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUser(){ return userRepository.findAll();}
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable Long id){return userRepository.findById(id);}

    @RequestMapping(value = "/userName/{name}",method = RequestMethod.GET)
    public User getUserName(@PathVariable String name){
        System.out.println(userRepository.findByPseudoName(name));
        return userRepository.findByPseudoName(name);}


    @RequestMapping(value = "/chercherUser",method = RequestMethod.GET)
    private Page<User> chercher(@RequestParam(name = "mc",defaultValue ="") String mc,
                                @RequestParam(name = "page",defaultValue = "0") int page,
                                @RequestParam(name = "size",defaultValue = "5")int size)
    {return userRepository.chercher("%"+mc+"%",new PageRequest(page,size));}

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User saveUser(@RequestBody User user){return userRepository.save(user);}




    @RequestMapping(value = "/visiteurs",method = RequestMethod.GET)
    public List<Visiteurs> getVisiteurs(){ return visiteurRepository.findAll();}

    @RequestMapping(value = "/agents",method = RequestMethod.GET)
    public List<Agent> getAgents(){return agentRepository.findAll();}

    @RequestMapping(value = "/visiteur",method = RequestMethod.POST)
    public Visiteurs saveVisiteur(@RequestBody Visiteurs visiteurs){return visiteurRepository.save(visiteurs);}

    @RequestMapping(value = "/agent",method = RequestMethod.POST)
    public Agent saveAgent(@RequestBody Agent agent){return agentRepository.save(agent);}

    @RequestMapping("/visiteursvisite/{id_viste}")
    public List<VisiteurVisite> SaveVisiteursVisite(@RequestBody List<Visiteurs> visiteurs,@PathVariable Long id_viste){
        List<VisiteurVisite> visiteurVisites=new ArrayList<>();
        Visite_hs visiteHs=visiteHsRepository.getOne(id_viste);
        for (Visiteurs visiteur:visiteurs){
            visiteurVisites.add(new VisiteurVisite(visiteur,visiteHs));
        }
        return visiteurVisiteRepository.saveAll(visiteurVisites);
    }

    @RequestMapping("/agentsvisite/{id_viste}")
    public List<AgentVisite> SaveAgentsVisite(@RequestBody List<Agent> agents, @PathVariable Long id_viste){
        List<AgentVisite> agentVisites=new ArrayList<>();
        Visite_hs visiteHs=visiteHsRepository.getOne(id_viste);
        for (Agent agent:agents){
            agentVisites.add(new AgentVisite(agent,visiteHs));
        }
        return agentVisiteRepository.saveAll(agentVisites);
    }
}
