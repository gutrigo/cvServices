package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Project;

public class ProjectBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Project> listar() {
	        /*return (List<Project>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Project")
	                .list();*/
    		List<Project> projects = new ArrayList<Project>();
    		Project p = new Project();
    		
            p.setTitle("Descontos Happy");
            p.setDates("jan 2018 - mar de 2018");
            p.setDescription("Somos uma plataforma de soluções para o varejo físico, que possui sistemas interativos e gamificados de mobile marketing, IoT (internet das coisas) e CRM, direcionados para o relacionamento e fidelização de clientes, engajamento de marcas, aumento de...");
            p.setImagesUrl("../../assets/descontosHappy.jpg");
            p.setUrlSite("http://www.descontoshappy.com.br/");
            projects.add(p);
    		Project p2 = new Project();
    		
            p2.setTitle("App Passaregua");
            p2.setDates("fev de 2018 – mai de 2018.");
            p2.setDescription("Simplificar a vida de pequenos comércios como bares, restaurantes, food trucks e salões facilitando o fechamento das contas e dando informações para aumentar as vendas: é para isso que o nosso APP existe! Por meio dele, é possível fechar cada conta e o caixa no final da noite sem ter aquela dor de cabeça para contar comanda por comanda, conferir se as vendas no cartão foram pagas corretamente pelas empresas de cartão e visualizar os números do negócio da forma mais simples.");
            p2.setImagesUrl("../../assets/passaregua.png");
            p2.setUrlSite("http://www.passaregua.com.br/");
            projects.add(p2);
            
    		Project p1 = new Project();
    		
            p1.setTitle("Noix! Skateboard");
            p1.setDates("dez 2017");
            p1.setDescription(" Nós amamos tecnologia, arte, fotografia, musica, e muito Skateboard ! Criado para compartilhamento de picos e pistas pelo brasil e também para fortalecer a cena do skate com eventos, premiações e muita diversão !!!");
            p1.setImagesUrl("../../assets/noix-app.png");
            p1.setUrlSite("https://appfirebase-e17bc.firebaseapp.com/");
            projects.add(p1);
            
            return projects;
            
	   }

}
