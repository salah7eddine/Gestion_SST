package com.lydex.gestion_sst.dao.user;

import com.lydex.gestion_sst.entities.user.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent,Long> {
}
