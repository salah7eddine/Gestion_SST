package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Attitude_urgence implements Serializable {
    @Id @GeneratedValue
    private Long id_att;
    private String numero_utile;
    private String consigne_evacuation;
    private String list_sauv_sec;
    private String connaissance_att_urg;
    private String 	boite_pharmacie;
    private String 	moyen_extinction_feu;



    public Attitude_urgence() {
    }

    public Attitude_urgence(String numero_utile, String consigne_evacuation, String list_sauv_sec, String connaissance_att_urg, String boite_pharmacie, String moyen_extinction_feu) {

        this.numero_utile = numero_utile;
        this.consigne_evacuation = consigne_evacuation;
        this.list_sauv_sec = list_sauv_sec;
        this.connaissance_att_urg = connaissance_att_urg;
        this.boite_pharmacie = boite_pharmacie;
        this.moyen_extinction_feu = moyen_extinction_feu;
    }

    public Long getId_att() {

        return id_att;
    }

    public void setId_att(Long id_att) {
        this.id_att = id_att;
    }

    public String getNumero_utile() {
        return numero_utile;
    }

    public void setNumero_utile(String numero_utile) {
        this.numero_utile = numero_utile;
    }

    public String getConsigne_evacuation() {
        return consigne_evacuation;
    }

    public void setConsigne_evacuation(String consigne_evacuation) {
        this.consigne_evacuation = consigne_evacuation;
    }

    public String getList_sauv_sec() {
        return list_sauv_sec;
    }

    public void setList_sauv_sec(String list_sauv_sec) {
        this.list_sauv_sec = list_sauv_sec;
    }

    public String getConnaissance_att_urg() {
        return connaissance_att_urg;
    }

    public void setConnaissance_att_urg(String connaissance_att_urg) {
        this.connaissance_att_urg = connaissance_att_urg;
    }

    public String getBoite_pharmacie() {
        return boite_pharmacie;
    }

    public void setBoite_pharmacie(String boite_pharmacie) {
        this.boite_pharmacie = boite_pharmacie;
    }

    public String getMoyen_extinction_feu() {
        return moyen_extinction_feu;
    }

    public void setMoyen_extinction_feu(String moyen_extinction_feu) {
        this.moyen_extinction_feu = moyen_extinction_feu;
    }


}
