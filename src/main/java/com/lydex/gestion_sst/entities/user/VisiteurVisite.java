package com.lydex.gestion_sst.entities.user;

import com.lydex.gestion_sst.entities.chantier.Visite_hs;
import com.lydex.gestion_sst.entities.user.User;
import com.lydex.gestion_sst.entities.user.Visiteurs;

import javax.persistence.*;

@Entity
public class VisiteurVisite {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Code_visiteur")
    private Visiteurs visiteurs;
    @ManyToOne
    @JoinColumn(name = "Code_user")
    private Visite_hs visiteHs;


    public VisiteurVisite(Visiteurs visiteurs, Visite_hs visiteHs) {
        this.visiteurs = visiteurs;
        this.visiteHs = visiteHs;
    }

    public VisiteurVisite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Visiteurs getVisiteurs() {

        return visiteurs;
    }

    public void setVisiteurs(Visiteurs visiteurs) {
        this.visiteurs = visiteurs;
    }

    public Visite_hs getVisiteHs() {
        return visiteHs;
    }

    public void setVisiteHs(Visite_hs visiteHs) {
        this.visiteHs = visiteHs;
    }
}
