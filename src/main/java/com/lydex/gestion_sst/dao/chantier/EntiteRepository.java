package com.lydex.gestion_sst.dao.chantier;

import com.lydex.gestion_sst.entities.chantier.Entite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntiteRepository extends JpaRepository<Entite,Long> {
}
