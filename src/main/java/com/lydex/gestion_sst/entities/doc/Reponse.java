package com.lydex.gestion_sst.entities.doc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reponse {
    @Id @GeneratedValue
    private Long idReponse;
    private String lib;

    public Reponse() {
    }

    public Reponse(String lib) {

        this.lib = lib;
    }

    public Long getIdReponse() {

        return idReponse;
    }

    public void setIdReponse(Long idReponse) {
        this.idReponse = idReponse;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
