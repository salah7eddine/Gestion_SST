package com.lydex.gestion_sst.meties.impl;

import com.lydex.gestion_sst.dao.user.RoleRepository;
import com.lydex.gestion_sst.dao.user.UserRepository;
import com.lydex.gestion_sst.entities.user.Role;
import com.lydex.gestion_sst.entities.user.User;
import com.lydex.gestion_sst.meties.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("AccountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User addUser(User appUser) {
        String encryptedPassword = passwordEncoder.encode(appUser.getPassword());
        appUser.setPassword(encryptedPassword);
        return userRepository.save(appUser);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User appUser = userRepository.findByPseudoName(userName);
        Role role = roleRepository.findByName(roleName);
        appUser.getRoles().add(role);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByPseudoName(userName);
    }
}
