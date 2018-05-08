package com.lydex.gestion_sst.entities.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {
    @Id @GeneratedValue
    private Long id_user;
    private String pseudoName;
    private String password;
    private String email ;
    private long num;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Lob
    private byte[] photo;
    // -----------------------
    @OneToOne
    @JoinColumn(name = "id_fct",referencedColumnName = "id")
    private Fonction fct;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();
    // -----------------------


    public User() {
    }

    public User(String pseudoName, String password, String email, long num, Date dateCreation, byte[] photo, Fonction fct) {
        this.pseudoName = pseudoName;
        this.password = password;
        this.email = email;
        this.num = num;
        this.dateCreation = dateCreation;
        this.photo = photo;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Fonction getFct() {
        return fct;
    }

    public void setFct(Fonction fct) {
        this.fct = fct;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
