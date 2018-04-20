package com.lydex.gestion_sst.dao.doc;

import com.lydex.gestion_sst.entities.doc.Compte_rendu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRenduRepository extends JpaRepository<Compte_rendu,Long> {
}
