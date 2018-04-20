package com.lydex.gestion_sst.dao.doc;

import com.lydex.gestion_sst.entities.doc.Etat_compte_rendu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatCpRenduRepository extends JpaRepository<Etat_compte_rendu,Long> {
}
