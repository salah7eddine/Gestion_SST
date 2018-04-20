package com.lydex.gestion_sst.web.chantier;

import com.lydex.gestion_sst.entities.chantier.Visite_hs;
import org.springframework.data.domain.Page;

import java.awt.*;
import java.util.ArrayList;

public interface VisiteHSService {
    ArrayList<Visite_hs> getVisiteHss();
    Visite_hs getVisiteHs();
    Page<Visite_hs> chercher(String tiitre,int page ,int size);
    Visite_hs save(Visite_hs visiteHs);
    boolean supprimer(int id);
    Visite_hs update(int id,Visite_hs visiteHs);
}
