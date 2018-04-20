package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Balisage_signalisation implements Serializable {
    @Id @GeneratedValue
    private Long id_bal_sign;
    private String signalisation_jour;
    private String signalisation_nuit;
    private String etat_panneaux;
    private String ordre_panneaux;
    private String chantier_cloture;
    private String chantier_balise_en_dur;




    public Balisage_signalisation() {
    }

    public Balisage_signalisation(String signalisation_jour, String signalisation_nuit, String etat_panneaux, String ordre_panneaux, String chantier_cloture, String chantier_balise_en_dur) {

        this.signalisation_jour = signalisation_jour;
        this.signalisation_nuit = signalisation_nuit;
        this.etat_panneaux = etat_panneaux;
        this.ordre_panneaux = ordre_panneaux;
        this.chantier_cloture = chantier_cloture;
        this.chantier_balise_en_dur = chantier_balise_en_dur;
    }

    public Long getId_bal_sign() {

        return id_bal_sign;
    }

    public void setId_bal_sign(Long id_bal_sign) {
        this.id_bal_sign = id_bal_sign;
    }

    public String getSignalisation_jour() {
        return signalisation_jour;
    }

    public void setSignalisation_jour(String signalisation_jour) {
        this.signalisation_jour = signalisation_jour;
    }

    public String getSignalisation_nuit() {
        return signalisation_nuit;
    }

    public void setSignalisation_nuit(String signalisation_nuit) {
        this.signalisation_nuit = signalisation_nuit;
    }

    public String getEtat_panneaux() {
        return etat_panneaux;
    }

    public void setEtat_panneaux(String etat_panneaux) {
        this.etat_panneaux = etat_panneaux;
    }

    public String getOrdre_panneaux() {
        return ordre_panneaux;
    }

    public void setOrdre_panneaux(String ordre_panneaux) {
        this.ordre_panneaux = ordre_panneaux;
    }

    public String getChantier_cloture() {
        return chantier_cloture;
    }

    public void setChantier_cloture(String chantier_cloture) {
        this.chantier_cloture = chantier_cloture;
    }

    public String getChantier_balise_en_dur() {
        return chantier_balise_en_dur;
    }

    public void setChantier_balise_en_dur(String chantier_balise_en_dur) {
        this.chantier_balise_en_dur = chantier_balise_en_dur;
    }


}
