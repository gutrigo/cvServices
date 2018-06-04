package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Bio;

public class BioBus {
	
	    @SuppressWarnings({ "unchecked", "deprecation" })
		public List<Bio> listar() {
		        return (List<Bio>) HibernateUtil.getSessionFactory()
		                .openSession()
		                .createQuery("from Bio")
		                .list();
		   }
}

