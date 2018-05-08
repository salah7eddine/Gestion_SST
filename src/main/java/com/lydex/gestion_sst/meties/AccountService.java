package com.lydex.gestion_sst.meties;

import com.lydex.gestion_sst.entities.user.Role;
import com.lydex.gestion_sst.entities.user.User;

public interface AccountService {
    User addUser(User appUser);
    Role addRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User findByUserName(String userName);
}
