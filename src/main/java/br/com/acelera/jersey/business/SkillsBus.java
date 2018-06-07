package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Skills;

public class SkillsBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Skills> listar() {
	        /*return (List<Skills>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Skills")
	                .list();*/
    		
    		List<Skills> skills = new ArrayList<Skills>();
    		
    		Skills s = new Skills();
    		s.setId(0);
    		s.setSkill("HTML5");
    		skills.add(s);
    		
    		Skills s1 = new Skills();
    		s1.setId(1);
    		s1.setSkill("CSS3");
    		skills.add(s1);    		
    		
    		Skills s2 = new Skills();
    		s2.setId(2);
    		s2.setSkill("JavaScript");
    		skills.add(s2);    		
    		
    		Skills s3 = new Skills();
    		s3.setId(3);
    		s3.setSkill("GruntJs");
    		skills.add(s3);
    		
    		Skills s4 = new Skills();
    		s4.setId(4);
    		s4.setSkill("Bootstrap");
    		skills.add(s4);
    		
    		Skills s5 = new Skills();
    		s5.setId(5);
    		s5.setSkill("Jquery");
    		skills.add(s5);
    		
    		Skills s6 = new Skills();
    		s6.setId(6);
    		s6.setSkill("Java");
    		skills.add(s6);
    		
    		Skills s7 = new Skills();
    		s7.setId(7);
    		s7.setSkill("AngularJs");
    		skills.add(s7);
    		
    		Skills s8 = new Skills();
    		s8.setId(8);
    		s8.setSkill("Angular");
    		skills.add(s8);
    		
    		return skills;
	   }

}
