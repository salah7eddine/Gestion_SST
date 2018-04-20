package com.lydex.gestion_sst.dao.chantier;

import com.lydex.gestion_sst.entities.chantier.Chantier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChantierRepository extends JpaRepository<Chantier,Long> {
    @Query("select c from Chantier c where c.libelle_chantier like:x and c.desc_chantier like:x")
    public Page<Chantier> chercher(@Param("x") String mc, Pageable pageable);
}
