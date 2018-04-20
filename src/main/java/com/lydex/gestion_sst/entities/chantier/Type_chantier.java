package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class Type_chantier implements Serializable {
    @Id @GeneratedValue
    private Long id_type;
    private String libelle_type;

    @OneToMany(mappedBy = "typeChantier",fetch = FetchType.LAZY)
    private List<Chantier> chantiers;

    public Type_chantier() {
    }

    public Type_chantier(String libelle_type) {

        this.libelle_type = libelle_type;
    }

    public Long getId_type() {

        return id_type;
    }

    public void setId_type(Long id_type) {
        this.id_type = id_type;
    }

    public String getLibelle_type() {
        return libelle_type;
    }

    public void setLibelle_type(String libelle_type) {
        this.libelle_type = libelle_type;
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
