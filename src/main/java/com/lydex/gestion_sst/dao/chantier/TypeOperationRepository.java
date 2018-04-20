package com.lydex.gestion_sst.dao.chantier;

import com.lydex.gestion_sst.entities.chantier.Type_observation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOperationRepository extends JpaRepository<Type_observation,Long> {
}
