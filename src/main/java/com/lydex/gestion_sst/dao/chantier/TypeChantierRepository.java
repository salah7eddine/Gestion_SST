package com.lydex.gestion_sst.dao.chantier;

import com.lydex.gestion_sst.entities.chantier.Type_chantier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeChantierRepository extends JpaRepository<Type_chantier,Long> {
}
