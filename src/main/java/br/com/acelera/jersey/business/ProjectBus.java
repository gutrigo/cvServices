package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Project;

public class ProjectBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Project> listar() {
	        return (List<Project>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Project")
	                .list();
	   }

}
