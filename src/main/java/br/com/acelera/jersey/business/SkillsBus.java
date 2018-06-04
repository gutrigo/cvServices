package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Skills;

public class SkillsBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Skills> listar() {
	        return (List<Skills>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Skills")
	                .list();
	   }

}
