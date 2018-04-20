package com.lydex.gestion_sst.entities.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lydex.gestion_sst.entities.chantier.Visite_hs;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id_user;
    private String pseudoName;
    private String email ;
    private long num;
    // -----------------------
    @OneToOne
    @JoinColumn(name = "id_fct",referencedColumnName = "id")
    private Fonction fct;
    // -----------------------

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Visite_hs> visiteHs;

    public User() {
    }

    public User(String pseudoName, String email, long num, Fonction fct) {

        this.pseudoName = pseudoName;
        this.email = email;
        this.num = num;
        this.fct = fct;
    }

    public Long getId_user() {

        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getPseudoName() {
        return pseudoName;
    }

    public void setPseudoName(String pseudoName) {
        this.pseudoName = pseudoName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public Fonction getFct() {
        return fct;
    }

    public void setFct(Fonction fct) {
        this.fct = fct;
    }

    @JsonIgnore
    @XmlTransient
    public List<Visite_hs> getVisiteHs() {
        return visiteHs;
    }

    public void setVisiteHs(List<Visite_hs> visiteHs) {
        this.visiteHs = visiteHs;
    }
}
