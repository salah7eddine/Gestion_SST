package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class Entreprise_st implements Serializable {
    @Id @GeneratedValue
    private Long id_entrep;
    private String nom;
    private Double tel;
    private String email;
    private String adresse;

    @OneToMany(mappedBy = "entrepriseSt",fetch = FetchType.LAZY)
    private List<Chantier> chantiers;

    public Entreprise_st() {
    }

    public Entreprise_st(String nom, Double tel, String email, String adresse) {

        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
    }

    public String getAdresse() {

        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getId_entrep() {

        return id_entrep;
    }

    public void setId_entrep(Long id_entrep) {
        this.id_entrep = id_entrep;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getTel() {
        return tel;
    }

    public void setTel(Double tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
