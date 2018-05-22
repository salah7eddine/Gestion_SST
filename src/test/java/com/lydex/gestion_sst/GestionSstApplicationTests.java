package com.lydex.gestion_sst;

import com.lydex.gestion_sst.entities.user.Fonction;
import com.lydex.gestion_sst.entities.user.Role;
import com.lydex.gestion_sst.entities.user.User;
import com.lydex.gestion_sst.meties.AccountService;
import com.lydex.gestion_sst.web.chantier.VisiteHSService;
import com.lydex.gestion_sst.web.chantier.VisiteHsRestService;
import com.lydex.gestion_sst.web.user.UserRestService;
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
    VisiteHsRestService visiteHsRestService;

    @Autowired
    UserRestService userRestService;
    @Test
    public void contextLoads() {
        /*Fonction fonction = new Fonction();
        fonction.setId(1L);
        User salah  = new User("Salah","salah","salah@gmail.com",1L,new Date(),new byte[1],fonction);
        accountService.addUser(salah);
        User user = new User("Douaa","123","Douaa@gmail.com",1L,new Date(),new byte[1],fonction);
        accountService.addUser(user);
        accountService.addRoleToUser("Douaa","ADMIN");
        User user1 = new User("meryem","123","meryem@gmail.com",1L,new Date(),new byte[1],fonction);
        accountService.addUser(user1);
        accountService.addRoleToUser("meryem","ADMIN");
        User user2 = new User("Omaima","123","Omaima@gmail.com",1L,new Date(),new byte[1],fonction);
        accountService.addUser(user2);
        accountService.addRoleToUser("Omaima","APS");

        User pers=null;
        pers= userRestService.getUserName("Salah");
        System.out.println(pers.getPseudoName());
        System.out.println(pers.getEmail());*/

        visiteHsRestService.getMyVisiteHs(Long.valueOf(361)).forEach(my->{
            System.out.println("------------------------------");
            System.out.println(my.getId_viste());
            System.out.println("------------------------------");
        });

    }
    }

