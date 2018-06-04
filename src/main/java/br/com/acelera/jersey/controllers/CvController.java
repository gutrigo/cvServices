package br.com.acelera.jersey.controllers;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.acelera.jersey.business.BioBus;
import br.com.acelera.jersey.business.ContactBus;
import br.com.acelera.jersey.business.OnlineCoursesBus;
import br.com.acelera.jersey.business.ProjectBus;
import br.com.acelera.jersey.business.SchoolsBus;
import br.com.acelera.jersey.business.SkillsBus;
import br.com.acelera.jersey.business.WorkBus;
import br.com.acelera.jersey.dao.BioDAO;
import br.com.acelera.jersey.models.Bio;
import br.com.acelera.jersey.models.Contact;
import br.com.acelera.jersey.models.OnlineCourses;
import br.com.acelera.jersey.models.Project;
import br.com.acelera.jersey.models.Schools;
import br.com.acelera.jersey.models.Skills;
import br.com.acelera.jersey.models.Work;

@Path("cv/")
public class CvController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bio> listBio() {
		
		try {
			BioBus bioBus = new BioBus();
			
			return bioBus.listar();

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("contact")
	public List<Contact> listContact() {
		
		try {
			ContactBus contactBus = new ContactBus();
			
			return contactBus.listar();

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("skills")
	public List<Skills> listSkills() {
		
		try {
			SkillsBus skillsBus = new SkillsBus();

			return skillsBus.listar();

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("works")
	public List<Work> listWorks() {
		
		try {
			WorkBus workBus = new WorkBus();
			
			return workBus.listar();
	

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("schools")
	public List<Schools> listSchools() {
		
		try {
			SchoolsBus schoolsBus = new SchoolsBus();
			return schoolsBus.listar();
	

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("ocourse")
	public List<OnlineCourses> listOcourse() {
		
		try {
			OnlineCoursesBus ocourses = new OnlineCoursesBus();
		    return ocourses.listar();
	

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("projects")
	public List<Project> listProjects() {
		
		try {
			ProjectBus projectBus = new ProjectBus();
			return projectBus.listar();

		} catch (Exception e) {
			Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, e);
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
	};	
}
