package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Action implements Serializable {
    @Id @GeneratedValue
    private Long id_action;
    private String object;
    private String statut;
    private Date echeance;
    @ManyToOne
    @JoinColumn(name = "Code_chantier")
    private Chantier chantier;

    public Action() {
    }

    public Action(String object, String statut, Date echeance) {

        this.object = object;
        this.statut = statut;
        this.echeance = echeance;
    }

    public Long getId_action() {

        return id_action;
    }

    public void setId_action(Long id_action) {
        this.id_action = id_action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public Chantier getChantier() {
        return chantier;
    }

    public void setChantier(Chantier chantier) {
        this.chantier = chantier;
    }

}
