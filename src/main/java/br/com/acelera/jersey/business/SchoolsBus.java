package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Schools;

public class SchoolsBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Schools> listar() {
	        return (List<Schools>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Schools")
	                .list();
	   }

}
