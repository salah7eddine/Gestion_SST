package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.dao.chantier.BalisageSignalisationRepository;
import com.lydex.gestion_sst.entities.chantier.Balisage_signalisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class BalisageSignalisationRestService {
    @Autowired
    private BalisageSignalisationRepository balisageSignalisationRepository;

    @RequestMapping(value = "/balisageSignalisations",method = RequestMethod.GET)
    public List<Balisage_signalisation> getbalisageSignalisations(){return balisageSignalisationRepository.findAll(); }

    @RequestMapping(value = "/balisageSignalisation/{id}",method = RequestMethod.GET)
    public Optional<Balisage_signalisation> getbalisageSignalisation(@PathVariable Long id){return balisageSignalisationRepository.findById(id);}

    @RequestMapping(value = "/balisageSignalisation",method = RequestMethod.POST)
    public Balisage_signalisation SaveBalisageSignalisation(@RequestBody  Balisage_signalisation balisageSignalisation){return balisageSignalisationRepository.save(balisageSignalisation);}

    @RequestMapping(value="/balisageSignalisation/{id}",method = RequestMethod.DELETE)
    private boolean supprimer(@PathVariable Long id){ balisageSignalisationRepository.deleteById(id); return true;}

    @RequestMapping(value="/balisageSignalisation/{id}",method = RequestMethod.PUT)
    private Balisage_signalisation update(@PathVariable Long id,@RequestBody Balisage_signalisation balisageSignalisation){ balisageSignalisation.setId_bal_sign(id); return balisageSignalisationRepository.save(balisageSignalisation);}

}
