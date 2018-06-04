package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.OnlineCourses;

public class OnlineCoursesBus {
	    @SuppressWarnings({ "unchecked", "deprecation" })
		public List<OnlineCourses> listar() {
		        return (List<OnlineCourses>) HibernateUtil.getSessionFactory()
		                .openSession()
		                .createQuery("from OnlineCourses")
		                .list();
		   }
}
