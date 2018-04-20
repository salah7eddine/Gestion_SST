package com.lydex.gestion_sst.entities.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Fonction implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String fontion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFontion() {
        return fontion;
    }

    public void setFontion(String fontion) {
        this.fontion = fontion;
    }


    public Fonction() {

    }

    public Fonction(String fontion) {

        this.fontion = fontion;
    }
}
