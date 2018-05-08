package com.lydex.gestion_sst;

import com.lydex.gestion_sst.entities.user.Fonction;
import com.lydex.gestion_sst.entities.user.User;
import com.lydex.gestion_sst.meties.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GestionSstApplicationTests {
    @Autowired
    AccountService accountService;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    @Test
    public void contextLoads() {
        Fonction fonction = new Fonction();
        fonction.setId(1L);
        User salah = new User("salah",passwordEncoder.encode("salah"),"",1L,new Date(),new byte[1],fonction);
        accountService.addUser(salah);
    }

}
