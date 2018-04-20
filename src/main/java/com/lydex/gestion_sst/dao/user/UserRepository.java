package com.lydex.gestion_sst.dao.user;

import com.lydex.gestion_sst.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
