package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class Service implements Serializable {
    @Id @GeneratedValue
    private Long id_service;
    private String libelle;

    @ManyToOne
    @JoinColumn(name = "id_entite")
    private Entite entite;

    @OneToMany(mappedBy = "service",fetch = FetchType.LAZY)
    private List<Chantier> chantiers;

    public Service() {
    }

    public Service(Long id_service, String libelle, Entite entite) {

        this.id_service = id_service;
        this.libelle = libelle;
        this.entite = entite;
    }

    public Long getId_service() {

        return id_service;
    }

    public void setId_service(Long id_service) {
        this.id_service = id_service;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Entite getEntite() {
        return entite;
    }

    public void setEntite(Entite entite) {
        this.entite = entite;
    }

    @JsonIgnore
    @XmlTransient
    public List<Chantier> getChantiers() {
        return chantiers;
    }

    public void setChantiers(List<Chantier> chantiers) {
        this.chantiers = chantiers;
    }


}
