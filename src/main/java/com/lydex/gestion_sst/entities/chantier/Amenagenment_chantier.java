package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Amenagenment_chantier implements Serializable {
    @Id @GeneratedValue
    private Long id_amenag_chantier;
    private String installation_chantier;
    private String base_vie;
    private String aire_stockage;
    private String 	plan_circulation;
    private String 	distance_securite;
    private String 	bassin_retention;



    public Amenagenment_chantier() {
    }

    public Amenagenment_chantier(String installation_chantier, String base_vie, String aire_stockage, String plan_circulation, String distance_securite, String bassin_retention) {

        this.installation_chantier = installation_chantier;
        this.base_vie = base_vie;
        this.aire_stockage = aire_stockage;
        this.plan_circulation = plan_circulation;
        this.distance_securite = distance_securite;
        this.bassin_retention = bassin_retention;
    }

    public Long getId_amenag_chantier() {

        return id_amenag_chantier;
    }

    public void setId_amenag_chantier(Long id_amenag_chantier) {
        this.id_amenag_chantier = id_amenag_chantier;
    }

    public String getInstallation_chantier() {
        return installation_chantier;
    }

    public void setInstallation_chantier(String installation_chantier) {
        this.installation_chantier = installation_chantier;
    }

    public String getBase_vie() {
        return base_vie;
    }

    public void setBase_vie(String base_vie) {
        this.base_vie = base_vie;
    }

    public String getAire_stockage() {
        return aire_stockage;
    }

    public void setAire_stockage(String aire_stockage) {
        this.aire_stockage = aire_stockage;
    }

    public String getPlan_circulation() {
        return plan_circulation;
    }

    public void setPlan_circulation(String plan_circulation) {
        this.plan_circulation = plan_circulation;
    }

    public String getDistance_securite() {
        return distance_securite;
    }

    public void setDistance_securite(String distance_securite) {
        this.distance_securite = distance_securite;
    }

    public String getBassin_retention() {
        return bassin_retention;
    }

    public void setBassin_retention(String bassin_retention) {
        this.bassin_retention = bassin_retention;
    }


}
