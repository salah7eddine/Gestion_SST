package com.lydex.gestion_sst.dao.chantier;

import com.lydex.gestion_sst.entities.chantier.Observation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservationRepository extends JpaRepository<Observation,Long> {
}
