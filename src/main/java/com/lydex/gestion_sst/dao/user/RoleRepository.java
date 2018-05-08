package com.lydex.gestion_sst.dao.user;

import com.lydex.gestion_sst.entities.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
