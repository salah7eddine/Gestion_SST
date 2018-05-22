package com.lydex.gestion_sst.meties.impl;

import com.lydex.gestion_sst.meties.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service("UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        com.lydex.gestion_sst.entities.user.User appUser = accountService.findByUserName(userName);
        if (appUser == null) throw new UsernameNotFoundException(userName);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        appUser.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        return new User(appUser.getPseudoName(), appUser.getPassword(), authorities);
    }

    //TODO
      /* il faut ajouter
      @Transactional
    public void save(ObjetGlobal x){
        da1.save(x.g1),

    };*/
}
