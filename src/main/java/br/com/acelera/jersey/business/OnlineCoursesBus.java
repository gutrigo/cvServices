package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.OnlineCourses;

public class OnlineCoursesBus {
	    @SuppressWarnings({ "unchecked", "deprecation" })
		public List<OnlineCourses> listar() {
		        /*return (List<OnlineCourses>) HibernateUtil.getSessionFactory()
		                .openSession()
		                .createQuery("from OnlineCourses")
		                .list();
		                */
	    		List<OnlineCourses> ocourses = new ArrayList<OnlineCourses>();
	    		OnlineCourses online = new OnlineCourses();
	    		online.setName("Udacity");
	    		online.setMajor("Desenvolvimento Web Front-End");
	    		online.setUrl("https://br.udacity.com/course/front-end-web-developer-nanodegree--nd001");
	    		online.setGraduationyear("2017");
	    		ocourses.add(online);
	    		
	    		OnlineCourses online2 = new OnlineCourses();
	    		online2.setName("Alura");
	    		online2.setMajor("HTTP: Etendendo a web por baixo dos panos");
	    		online2.setUrl("https://cursos.alura.com.br/user/gtrigao/course/http-fundamentos/formalCertificate");
	    		online2.setGraduationyear("2017");
	    		ocourses.add(online2);
	    		
	    		OnlineCourses online1 = new OnlineCourses();
	    		online1.setName("Alura");
	    		online1.setMajor("Marketing Digital: O primeiro passo antes de criar um site");
	    		online1.setUrl("https://cursos.alura.com.br/user/gtrigao/course/primeiros-passos-antes-de-criar-um-site/formalCertificate");
	    		online1.setGraduationyear("2017");
	    		ocourses.add(online1);
	    		
	    		
	    		return ocourses;
		   }
}
