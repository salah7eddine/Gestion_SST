package com.lydex.gestion_sst.entities.doc;

import com.lydex.gestion_sst.entities.chantier.Visite_hs;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Document_chantier implements Serializable {
    @Id @GeneratedValue
    private Long id_doc_chantier;
    private String ordre_travail;
    private String 	permis_travail;
    private String 	attestation_consignation;
    private String 	titre_habilitation;
    private String 	dict;
    private String 	plan_prevention;



    public Document_chantier() {
    }

    public Document_chantier(Long id_doc_chantier, String ordre_travail, String permis_travail, String attestation_consignation, String titre_habilitation, String dict, String plan_prevention) {

        this.id_doc_chantier = id_doc_chantier;
        this.ordre_travail = ordre_travail;
        this.permis_travail = permis_travail;
        this.attestation_consignation = attestation_consignation;
        this.titre_habilitation = titre_habilitation;
        this.dict = dict;
        this.plan_prevention = plan_prevention;
    }

    public Long getId_doc_chantier() {

        return id_doc_chantier;
    }

    public void setId_doc_chantier(Long id_doc_chantier) {
        this.id_doc_chantier = id_doc_chantier;
    }

    public String getOrdre_travail() {
        return ordre_travail;
    }

    public void setOrdre_travail(String ordre_travail) {
        this.ordre_travail = ordre_travail;
    }

    public String getPermis_travail() {
        return permis_travail;
    }

    public void setPermis_travail(String permis_travail) {
        this.permis_travail = permis_travail;
    }

    public String getAttestation_consignation() {
        return attestation_consignation;
    }

    public void setAttestation_consignation(String attestation_consignation) {
        this.attestation_consignation = attestation_consignation;
    }

    public String getTitre_habilitation() {
        return titre_habilitation;
    }

    public void setTitre_habilitation(String titre_habilitation) {
        this.titre_habilitation = titre_habilitation;
    }

    public String getDict() {
        return dict;
    }

    public void setDict(String dict) {
        this.dict = dict;
    }

    public String getPlan_prevention() {
        return plan_prevention;
    }

    public void setPlan_prevention(String plan_prevention) {
        this.plan_prevention = plan_prevention;
    }




}
