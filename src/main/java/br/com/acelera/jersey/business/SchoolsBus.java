package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Schools;

public class SchoolsBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Schools> listar() {
	       /* return (List<Schools>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Schools")
	                .list();*/
	        List<Schools> schools = new ArrayList<Schools>();
	        
	        Schools s = new Schools();
	        s.setCity("Rua Chui - Sp - São Paulo");
	        s.setDegree("Técnico");
	        s.setGraduationYear("2018");
	        s.setMajor("Carreira Full Stack Angular + Java");
	        s.setName("AgilizeWare");
	        s.setUrl("http://www.programar.com.vc");
	        schools.add(s);
	        
	        Schools s1 = new Schools();
	        s1.setCity("Rua Vergueiro, 3185 - Vila Mariana, São Paulo - SP");
	        s1.setDegree("Técnico");
	        s1.setGraduationYear("2016");
	        s1.setMajor("Java, Desenvolvimento Web");
	        s1.setName("Caelum");
	        s1.setUrl("https://www.caelum.com.br/curso-java-web");
	        schools.add(s1);
	        
	        Schools s2 = new Schools();
	        s2.setCity("Rua Vergueiro, 3185 - Vila Mariana, São Paulo - SP");
	        s2.setDegree("Técnico");
	        s2.setGraduationYear("2016");
	        s2.setMajor("Orientação a Objetos");
	        s2.setName("Caelum");
	        s2.setUrl("https://www.caelum.com.br/curso-java-orientacao-objetos");
	        schools.add(s2);
	        
	        Schools s3 = new Schools();
	        s3.setCity("Praça da República, 128 - República, São Paulo - SP");
	        s3.setDegree("Técnico");
	        s3.setGraduationYear("2008");
	        s3.setMajor("Cobol, CICS, DB2, Modelagem de Dados, JCL, Z/OS");
	        s3.setName("GPTI");
	        s3.setUrl("");
	        schools.add(s3);
	        
	        return schools;
	   }
}
