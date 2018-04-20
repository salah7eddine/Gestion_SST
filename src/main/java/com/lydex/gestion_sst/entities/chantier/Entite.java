package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;


@Entity
public class Entite implements Serializable {
    @Id @GeneratedValue
    private Long id_entite;
    private String libelle;

    @OneToMany(mappedBy = "entite",fetch = FetchType.LAZY)
    private List<Service> services;

    public Entite() {
    }

    public Entite(String libelle) {

        this.libelle = libelle;
    }

    public Long getId_entite() {

        return id_entite;
    }

    public void setId_entite(Long id_entite) {
        this.id_entite = id_entite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @JsonIgnore
    @XmlTransient
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }


}
