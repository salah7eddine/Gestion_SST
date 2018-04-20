package com.lydex.gestion_sst.dao.user;

import com.lydex.gestion_sst.entities.user.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FonctionRepository extends JpaRepository<Fonction,Long> {
}
