package com.lydex.gestion_sst;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.lydex.gestion_sst.dao.chantier.ChantierRepository;
import com.lydex.gestion_sst.entities.chantier.Chantier;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class GestionSstApplication implements CommandLineRunner{
	@Autowired
	private ChantierRepository chantierRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionSstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");

		/*chantierRepository.save(new Chantier("libelle test1","desc test1",df.parse("12/2/2018"),df.parse("12/6/2018")));
		chantierRepository.save(new Chantier("libelle test2","desc test2",df.parse("12/3/2018"),df.parse("12/7/2018")));
		chantierRepository.save(new Chantier("libelle test3","desc test3",df.parse("12/4/2018"),df.parse("12/8/2018")));

		chantierRepository.findAll().forEach(c->{
			System.out.println(c.getLibelle_chantier());
			System.out.println(c.getDesc_chantier());
		});*/
	}
}
