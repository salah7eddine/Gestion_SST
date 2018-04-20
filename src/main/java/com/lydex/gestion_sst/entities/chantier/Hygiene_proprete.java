package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Hygiene_proprete implements Serializable {
    @Id @GeneratedValue
    private Long id_hyg_prp;
    private String moyens_proprete;
    private String 	nuisances;
    private String 	evacuation_deblais;
    private String 	proprete_vehicule;
    private String 	registre_incident;
    private String 	respect_environnement;



    public Hygiene_proprete() {
    }

    public Hygiene_proprete(String moyens_proprete, String nuisances, String evacuation_deblais, String proprete_vehicule, String registre_incident, String respect_environnement) {

        this.moyens_proprete = moyens_proprete;
        this.nuisances = nuisances;
        this.evacuation_deblais = evacuation_deblais;
        this.proprete_vehicule = proprete_vehicule;
        this.registre_incident = registre_incident;
        this.respect_environnement = respect_environnement;
    }

    public Long getId_hyg_prp() {

        return id_hyg_prp;
    }

    public void setId_hyg_prp(Long id_hyg_prp) {
        this.id_hyg_prp = id_hyg_prp;
    }

    public String getMoyens_proprete() {
        return moyens_proprete;
    }

    public void setMoyens_proprete(String moyens_proprete) {
        this.moyens_proprete = moyens_proprete;
    }

    public String getNuisances() {
        return nuisances;
    }

    public void setNuisances(String nuisances) {
        this.nuisances = nuisances;
    }

    public String getEvacuation_deblais() {
        return evacuation_deblais;
    }

    public void setEvacuation_deblais(String evacuation_deblais) {
        this.evacuation_deblais = evacuation_deblais;
    }

    public String getProprete_vehicule() {
        return proprete_vehicule;
    }

    public void setProprete_vehicule(String proprete_vehicule) {
        this.proprete_vehicule = proprete_vehicule;
    }

    public String getRegistre_incident() {
        return registre_incident;
    }

    public void setRegistre_incident(String registre_incident) {
        this.registre_incident = registre_incident;
    }

    public String getRespect_environnement() {
        return respect_environnement;
    }

    public void setRespect_environnement(String respect_environnement) {
        this.respect_environnement = respect_environnement;
    }




}
