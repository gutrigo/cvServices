package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Bio;

public class BioBus {
	
	    @SuppressWarnings({ "unchecked", "deprecation" })
		public List<Bio> listar() {
		        /*return (List<Bio>) HibernateUtil.getSessionFactory()
		                .openSession()
		                .createQuery("from Bio")
		                .list();*/
	    		List<Bio> bio = new ArrayList<Bio>();
	    		Bio b = new Bio();
	    		b.setName("Gustavo Trigo");
	    		b.setPicture("../../assets/eu.jpg");
	    		b.setRole("Desenvolvedor Web");
	    		b.setWelcomeMessage("Fácil Aprendizado foco nos resultados e qualidade na entrega dos serviços.");
	    		bio.add(b);
	    		return bio;
		   }
}

