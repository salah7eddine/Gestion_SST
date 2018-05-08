package com.lydex.gestion_sst.entities.chantier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lydex.gestion_sst.entities.doc.Compte_rendu;
import com.lydex.gestion_sst.entities.doc.Document_chantier;
import com.lydex.gestion_sst.entities.user.Agent;
import com.lydex.gestion_sst.entities.user.User;
import com.lydex.gestion_sst.entities.user.Visiteurs;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Visite_hs implements Serializable{
    @Id @GeneratedValue
    private Long id_viste;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date_visite;
    @Temporal(TemporalType.DATE)
    private Date ordre_viste;
    //private Collection<String> visiteurs;
    //private Collection<String> Agents_Visités;


    @OneToMany(mappedBy ="visiteHs",fetch = FetchType.LAZY )
    private List<Observation> observations;


    @OneToOne
    @JoinColumn(name = "Code_compte_rendu",referencedColumnName  = "id_compte_rendu")
    private Compte_rendu compteRendu;


    @ManyToOne
    @JoinColumn(name = "Code_chantier")
    private Chantier chantier;


    @OneToOne
    @JoinColumn(name = "Code_bal_sign",referencedColumnName = "id_bal_sign" )
    private Balisage_signalisation balisageSignalisation;

    @OneToOne
    @JoinColumn(name = "Code_att",referencedColumnName = "id_att")
    private Attitude_urgence attitudeUrgence;

    @OneToOne
    @JoinColumn(name = "Code_doc_chantier",referencedColumnName = "id_doc_chantier")
    private Document_chantier documentChantier;

    @OneToOne
    @JoinColumn(name = "Code_rqs",referencedColumnName = "id_rqs")
    private Rqs rqs;

    @OneToOne
    @JoinColumn(name = "Code_epc_epi",referencedColumnName = "id_epc_epi")
    private Epc_epi epcEpi;

    @OneToOne
    @JoinColumn(name = "Code_amenag_chantier",referencedColumnName = "id_amenag_chantier")
    private Amenagenment_chantier amenagenmentChantier;

    @OneToOne
    @JoinColumn(name = "Code_hyg_prp",referencedColumnName = "id_hyg_prp")
    private Hygiene_proprete hygieneProprete;


    public Visite_hs() {
    }

    public Visite_hs(String description, Date date_visite, Date ordre_viste) {
        this.description = description;
        this.date_visite = date_visite;
        this.ordre_viste = ordre_viste;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId_viste() {
        return id_viste;
    }

    public void setId_viste(Long id_viste) {
        this.id_viste = id_viste;
    }

    public Date getDate_visite() {
        return date_visite;
    }

    public void setDate_visite(Date date_visite) {
        this.date_visite = date_visite;
    }

    public Date getOrdre_viste() {
        return ordre_viste;
    }

    public void setOrdre_viste(Date ordre_viste) {
        this.ordre_viste = ordre_viste;
    }



    @JsonIgnore
    @XmlTransient
    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }


    public Compte_rendu getCompteRendu() {
        return compteRendu;
    }

    public void setCompteRendu(Compte_rendu compteRendu) {
        this.compteRendu = compteRendu;
    }


    public Chantier getChantier() {
        return chantier;
    }

    public void setChantier(Chantier chantier) {
        this.chantier = chantier;
    }


    public Balisage_signalisation getBalisageSignalisation() {
        return balisageSignalisation;
    }

    public void setBalisageSignalisation(Balisage_signalisation balisageSignalisation) {
        this.balisageSignalisation = balisageSignalisation;
    }


    public Attitude_urgence getAttitudeUrgence() {
        return attitudeUrgence;
    }

    public void setAttitudeUrgence(Attitude_urgence attitudeUrgence) {
        this.attitudeUrgence = attitudeUrgence;
    }


    public Document_chantier getDocumentChantier() {
        return documentChantier;
    }

    public void setDocumentChantier(Document_chantier documentChantier) {
        this.documentChantier = documentChantier;
    }


    public Rqs getRqs() {
        return rqs;
    }

    public void setRqs(Rqs rqs) {
        this.rqs = rqs;
    }


    public Epc_epi getEpcEpi() {
        return epcEpi;
    }

    public void setEpcEpi(Epc_epi epcEpi) {
        this.epcEpi = epcEpi;
    }


    public Amenagenment_chantier getAmenagenmentChantier() {
        return amenagenmentChantier;
    }

    public void setAmenagenmentChantier(Amenagenment_chantier amenagenmentChantier) {
        this.amenagenmentChantier = amenagenmentChantier;
    }


    public Hygiene_proprete getHygieneProprete() {
        return hygieneProprete;
    }

    public void setHygieneProprete(Hygiene_proprete hygieneProprete) {
        this.hygieneProprete = hygieneProprete;
    }



}
