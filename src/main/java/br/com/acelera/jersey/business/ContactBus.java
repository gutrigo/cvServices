package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Contact;

public class ContactBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Contact> listar() {
	        /*return (List<Contact>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Contact")
	                .list();*/
    	List<Contact> contacts = new ArrayList<Contact>();
    	Contact c = new Contact();
    	c.setCell("11 98136-5796");
    	c.setEmail("gtrigao@gmail.com");
    	c.setGithubuser("gutrigo");
    	c.setLocation("Barueri - SP");
    	contacts.add(c);
    	return contacts;
	   }
}
