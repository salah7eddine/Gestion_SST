package com.lydex.gestion_sst.dao.user;

import com.lydex.gestion_sst.entities.user.Visiteurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisiteurRepository extends JpaRepository<Visiteurs,Long> {
}
