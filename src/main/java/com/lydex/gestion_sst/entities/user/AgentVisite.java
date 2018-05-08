package com.lydex.gestion_sst.entities.user;

import com.lydex.gestion_sst.entities.chantier.Visite_hs;

import javax.persistence.*;

@Entity
public class AgentVisite {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Code_agent")
    private Agent agent;
    @ManyToOne
    @JoinColumn(name = "Code_user")
    private Visite_hs visiteHs;

    public AgentVisite(Agent agent, Visite_hs visiteHs) {
        this.agent = agent;
        this.visiteHs = visiteHs;
    }

    public Agent getAgent() {

        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Visite_hs getVisiteHs() {
        return visiteHs;
    }

    public void setVisiteHs(Visite_hs visiteHs) {
        this.visiteHs = visiteHs;
    }

    public AgentVisite() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
