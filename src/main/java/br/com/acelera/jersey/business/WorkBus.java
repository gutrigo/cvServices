package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Work;

public class WorkBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Work> listar() {
	        return (List<Work>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Work")
	                .list();
	   }

}
