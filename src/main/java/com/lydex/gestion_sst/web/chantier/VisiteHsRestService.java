package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.VisiteHsRepository;
import com.lydex.gestion_sst.entities.chantier.Visite_hs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class VisiteHsRestService {
    @Autowired
    private VisiteHsRepository visiteHsRepository;

    @RequestMapping(value = "/visiteHs",method = RequestMethod.GET)
    public List<Visite_hs> getVisiteHss(){return visiteHsRepository.findAll();}

    @RequestMapping(value = "/visiteHsByEtat",method = RequestMethod.GET)
    public List<Visite_hs> getVisiteHssByEtat(){return visiteHsRepository.getVisiteHsByEtat();}



    @RequestMapping(value = "/visiteHs/{id}",method = RequestMethod.GET)
    public Optional<Visite_hs> getVisiteHs(@PathVariable Long id){return visiteHsRepository.findById(id);}

    @RequestMapping(value = "/myVisiteHs/{id}",method = RequestMethod.GET)
    public List<Visite_hs> getMyVisiteHs(@PathVariable Long id)
    { System.out.println(id);return visiteHsRepository.getMyVisiteHs(id);}

    @RequestMapping(value = "/chercherVisite",method = RequestMethod.GET)
    private Page<Visite_hs> chercher(@RequestParam(name = "mc",defaultValue ="") String mc,
                                     @RequestParam(name = "page",defaultValue = "0") int page,
                                     @RequestParam(name = "size",defaultValue = "10")int size)
    {return visiteHsRepository.chercher("%"+mc+"%",new PageRequest(page,size));}

    @RequestMapping(value = "/visiteHs",method = RequestMethod.POST)
    private Visite_hs save(@RequestBody Visite_hs visiteHs){return visiteHsRepository.save(visiteHs);}


    @RequestMapping(value="/visiteHs/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ visiteHsRepository.deleteById(id); return true;}

    @RequestMapping(value="/visiteHs/{id}",method = RequestMethod.PUT)
    private Visite_hs update(@PathVariable Long id,@RequestBody Visite_hs visiteHs){ visiteHs.setId_viste(id); return visiteHsRepository.save(visiteHs);}



}
