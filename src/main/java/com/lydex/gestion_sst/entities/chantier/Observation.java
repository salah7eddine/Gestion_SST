package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Observation implements Serializable {
    @Id @GeneratedValue
    private Long id_observation;
    private String 	desc_observation;

    @ManyToOne
    @JoinColumn(name = "Code_viste")
    private Visite_hs visiteHs;

    @OneToOne
    @JoinColumn(name = "Code_type_observation")
    private Type_observation typeObservation;


    public Observation() {
    }

    public Observation(String desc_observation) {

        this.desc_observation = desc_observation;
    }

    public Long getId_observation() {

        return id_observation;
    }

    public void setId_observation(Long id_observation) {
        this.id_observation = id_observation;
    }

    public String getDesc_observation() {
        return desc_observation;
    }

    public void setDesc_observation(String desc_observation) {
        this.desc_observation = desc_observation;
    }

    public Visite_hs getVisiteHs() {
        return visiteHs;
    }

    public void setVisiteHs(Visite_hs visiteHs) {
        this.visiteHs = visiteHs;
    }

    public Type_observation getTypeObservation() {
        return typeObservation;
    }

    public void setTypeObservation(Type_observation typeObservation) {
        this.typeObservation = typeObservation;
    }
}

