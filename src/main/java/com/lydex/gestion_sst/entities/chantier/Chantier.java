package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Chantier implements Serializable {
    @Id @GeneratedValue
    private Long id_chantier;
    private String 	libelle_chantier;
    private String 	desc_chantier;
    @Temporal(TemporalType.DATE)
    private Date 	date_ordre;
    @Temporal(TemporalType.DATE)
    private Date 	date_fin;

    @OneToMany(mappedBy = "chantier",fetch = FetchType.LAZY)
    private List<Visite_hs> visiteHs;

    @OneToMany(mappedBy = "chantier",fetch = FetchType.LAZY)
    private List<Action> actions;

    @ManyToOne
    @JoinColumn(name = "Code_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "Code_entrep")
    private Entreprise_st entrepriseSt;

    @ManyToOne
    @JoinColumn(name = "Code_type")
    private Type_chantier typeChantier;



    public Chantier() {
    }

    public Chantier(String libelle_chantier, String desc_chantier, Date date_ordre, Date date_fin) {

        this.libelle_chantier = libelle_chantier;
        this.desc_chantier = desc_chantier;
        this.date_ordre = date_ordre;
        this.date_fin = date_fin;
    }

    public Long getId_chantier() {

        return id_chantier;
    }

    public void setId_chantier(Long id_chantier) {
        this.id_chantier = id_chantier;
    }

    public String getLibelle_chantier() {
        return libelle_chantier;
    }

    public void setLibelle_chantier(String libelle_chantier) {
        this.libelle_chantier = libelle_chantier;
    }

    public String getDesc_chantier() {
        return desc_chantier;
    }

    public void setDesc_chantier(String desc_chantier) {
        this.desc_chantier = desc_chantier;
    }

    public Date getDate_ordre() {
        return date_ordre;
    }

    public void setDate_ordre(Date date_ordre) {
        this.date_ordre = date_ordre;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @JsonIgnore
    @XmlTransient
    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @JsonIgnore
    @XmlTransient
    public List<Visite_hs> getVisiteHs() {
        return visiteHs;
    }

    public void setVisiteHs(List<Visite_hs> visiteHs) {
        this.visiteHs = visiteHs;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Entreprise_st getEntrepriseSt() {
        return entrepriseSt;
    }

    public void setEntrepriseSt(Entreprise_st entrepriseSt) {
        this.entrepriseSt = entrepriseSt;
    }

    public Type_chantier getTypeChantier() {
        return typeChantier;
    }

    public void setTypeChantier(Type_chantier typeChantier) {
        this.typeChantier = typeChantier;
    }


}
