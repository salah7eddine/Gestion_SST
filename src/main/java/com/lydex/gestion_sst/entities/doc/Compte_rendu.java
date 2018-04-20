package com.lydex.gestion_sst.entities.doc;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Compte_rendu implements Serializable {
    @Id @GeneratedValue
    private Long id_compte_rendu;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "code_etat")
    private Etat_compte_rendu etatCompteRendu;




    public Compte_rendu() {
    }

    public Compte_rendu(Date dateCreation) {

        this.dateCreation = dateCreation;
    }

    public Long getId_compte_rendu() {

        return id_compte_rendu;
    }

    public void setId_compte_rendu(Long id_compte_rendu) {
        this.id_compte_rendu = id_compte_rendu;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Etat_compte_rendu getEtatCompteRendu() {
        return etatCompteRendu;
    }

    public void setEtatCompteRendu(Etat_compte_rendu etatCompteRendu) {
        this.etatCompteRendu = etatCompteRendu;
    }


}
