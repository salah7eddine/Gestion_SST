package com.lydex.gestion_sst.entities.doc;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class Etat_compte_rendu implements Serializable {
    @Id @GeneratedValue
    private Long id_etat;
    private String libelle;

    @OneToMany(mappedBy = "etatCompteRendu",fetch = FetchType.LAZY)
    private List<Compte_rendu> compteRendus;

    public Etat_compte_rendu() {
    }

    public Etat_compte_rendu(String libelle) {

        this.libelle = libelle;
    }

    public Long getId_etat() {

        return id_etat;
    }

    public void setId_etat(Long id_etat) {
        this.id_etat = id_etat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @JsonIgnore
    @XmlTransient
    public List<Compte_rendu> getCompteRendus() {
        return compteRendus;
    }

    public void setCompteRendus(List<Compte_rendu> compteRendus) {
        this.compteRendus = compteRendus;
    }


}
