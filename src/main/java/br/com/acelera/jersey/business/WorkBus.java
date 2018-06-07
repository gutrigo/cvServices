package br.com.acelera.jersey.business;

import java.util.ArrayList;
import java.util.List;

import br.com.acelera.jersey.models.Work;

public class WorkBus {
    @SuppressWarnings({ "unchecked", "deprecation" })
	public List<Work> listar() {
	        /*return (List<Work>) HibernateUtil.getSessionFactory()
	                .openSession()
	                .createQuery("from Work")
	                .list();*/
    		
    		List<Work> works = new ArrayList<Work>();
    		Work w = new Work();
    		w.setId(0);
    		w.setDates("dez de 2016 - até o momento.");
    		w.setDescription("Principais Atividades: Modelagem de dados, criação e manutenção de JCL e estrutura no CONTROL-M, desenvolvimento em COBOL, IMS, CICS, DB2, Java, Javascript, HTML5, CSS3 e proccedures em sql. Controle de evolução e gestão de projetos.");
    		w.setEmployer("Wipro");
    		w.setTitle("Analista de Sistemas Sr");
    		w.setLocation("Av. Andrômeda, 5700 - Alphaville Empresarial, Barueri - SP");
    		works.add(w);
    		
    		Work w1 = new Work();
    		w1.setId(1);
    		w1.setDates("jan de 2018 - mar de 2018.");
    		w1.setDescription("Desenvolvimento de aplicação mobile utilizando Angular4 e IONIC, integração com backend NodeJs.");
    		w1.setEmployer("Agência de Tecnologia Agilizeware do Brasil");
    		w1.setTitle("Desenvolvedor Web Freelancer");
    		w1.setLocation("Rua Chui - Sp - São Paulo");
    		works.add(w1);

    		Work w2 = new Work();
    		w2.setId(2);
    		w2.setDates("fev de 2018 – mai de 2018.");
    		w2.setDescription("App PassaRegua AgilizeWare. Atuação Freelancer no desenvolvimento frontend de funcionalidades do aplicativo");
    		w2.setEmployer("Agência de Tecnologia Agilizeware do Brasil");
    		w2.setTitle("Desenvolvedor Web Freelancer");
    		w2.setLocation("Rua Chui - Sp - São Paulo");
    		works.add(w2);
    		
    		Work w3 = new Work();
    		w3.setId(3);
    		w3.setDates("jul de 2014 - dez de 2016.");
    		w3.setDescription("Modelagem de dados, carga e manutenção em tabelas DB2, criação e execução de BACKUPS, REORGS, RUNSTATS, COPYS e LOADS, criação e manutenção de JCL e estrutura no CONTROL-M, desenvolvimento em COBOL, IMS, CICS e DB2, JAVA, Javascript, HTML5, CSS3 Integration service e proccedures em sql.");
    		w3.setEmployer("TODO!");
    		w3.setTitle("Analista de Sistemas Sr");
    		w3.setLocation("Av. Andrômeda, 5700 - Alphaville Empresarial, Barueri - SP");
    		works.add(w3);
    		
    		Work w4 = new Work();
    		w4.setId(4);
    		w4.setDates("nov de 2012 - jul de 2014.");
    		w4.setDescription("Principais Atividades: Desenvolvimento em COBOL, CICS e DB2, levantamento das regras de negocio e dos requisitos necessários para o desenvolvimento do sistema, resolução de incidentes, criação e execução de roteiros de teste batch, evidencias de teste, fluxo de processamento das rotinas, controle de evolução, preparação de ambiente desde cargas iniciais e manutenção em tabelas DB2 à criação dos Jobs e estrutura no CONTROL-M,  acompanhamento e suporte na execução das rotinas diárias nos ambientes de TI e TH (Teste integrado e Homologação).");
    		w4.setEmployer("Capgemini");
    		w4.setTitle("Analista de Sistemas Mainframe");
    		w4.setLocation("Alameda Araguaia - Barueri-Sp");
    		works.add(w4);
    		
    		Work w5 = new Work();
    		w5.setId(5);
    		w5.setDates("abr de 2012 - nov de 2012.");
    		w5.setDescription("Desenvolvimento em COBOL, CICS e DB2, levantamento das regras de negocio e dos requisitos necessários para o desenvolvimento do sistema, resolução de incidentes, criação e execução de roteiros de teste batch, evidencias de teste, fluxo de processamento das rotinas, controle de evolução, preparação de ambiente desde cargas iniciais e manutenção em tabelas DB2 à criação dos Jobs e estrutura no CONTROL-M, acompanhamento e suporte na execução das rotinas diárias nos ambientes de Teste integrado e Homologação.");
    		w5.setEmployer("Capgemini");
    		w5.setTitle("Programador PL");
    		w5.setLocation("Alameda Araguaia - Barueri-Sp");
    		works.add(w5);
    		
    		Work w6 = new Work();
    		w6.setId(6);
    		w6.setDates("fev de 2011 - abr de 2012.");
    		w6.setDescription("Atuação em fabrica de software, desenvolvimento em Cobol, CICS, DB2 e criação de JCL.");
    		w6.setEmployer("Capgemini");
    		w6.setTitle("Programador Jr");
    		w6.setLocation("Alameda Araguaia, Barueri - SP");
    		works.add(w6);
    		
    		Work w7 = new Work();
    		w7.setId(7);
    		w7.setDates("set de 2010 - fev de 2011.");
    		w7.setDescription("Documentação, criação e implementação de querys, análise de tabelas para modelagem de dados, levantamento das regras de negócio do cliente. Criação, alteração, atualização e carga em tabelas SQL-SERVER com informações extraídas das bases mainframe(DB2) utilizando linguagem TSQL.");
    		w7.setEmployer("Carriers Interconnect");
    		w7.setTitle("Analista BI");
    		w7.setLocation("Rua Hadock Lobo - São Paulo-Sp");
    		works.add(w7);
    		
    		Work w8 = new Work();
    		w8.setId(8);
    		w8.setDates("dez de 2009 - jun de 2010.");
    		w8.setDescription("Suporte a produção do Sistema de Faturamento, Análise de JOBS, instruções para retomadas de processamento, montagem de JCL para processamentos especiais e montagem de Schedule. Banco de dados: Acesso as tabelas DB2 via SQL.");
    		w8.setEmployer("Carriers Interconnect");
    		w8.setTitle("Trainne");
    		w8.setLocation("Rua 7 de abril - São Paulo-Sp");
    		works.add(w8);    		  
    		
    		return works;
	   }

}
