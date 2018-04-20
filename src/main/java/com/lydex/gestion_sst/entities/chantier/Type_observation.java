package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class Type_observation implements Serializable {
    @Id @GeneratedValue
    private Long id_type_observation;
    private String 	type;

    @OneToMany(mappedBy = "typeObservation",fetch = FetchType.LAZY)
    private List<Observation> observations;

    public Type_observation() {
    }

    public Type_observation(String type) {

        this.type = type;
    }

    public Long getId_type_observation() {

        return id_type_observation;
    }

    public void setId_type_observation(Long id_type_observation) {
        this.id_type_observation = id_type_observation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnore
    @XmlTransient
    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }


}
