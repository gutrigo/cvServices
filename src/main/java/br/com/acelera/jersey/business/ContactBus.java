package br.com.acelera.jersey.business;

import java.util.List;

import br.com.acelera.jersey.infra.HibernateUtil;
import br.com.acelera.jersey.models.Contact;

public class ContactBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Contact> listar() {
	        return (List<Contact>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Contact")
	                .list();
	   }
}
