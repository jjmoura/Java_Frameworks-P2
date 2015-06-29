package persistence;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Empresa;

public class EmpresaConexao {
	

	/**
	 *
	  * Classe que faz o acesso ao Banco CRUD e testes.
	  * @author Joao Moura  * 
	  *
	  *
	  */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Session s;
			
			Transaction t;

			
			//Gravando Emrpesa no banco de dados
			

			Empresa emp = new Empresa();
			
			emp.setCnpj("456123");;
			emp.setRazaoSocial("Candido Mendes");;
			
			s = HibernateUtil.getSessionFactory().openSession();
			
			t = s.beginTransaction();			
			
			s.save(emp);
			
			t.commit();
			
			//s.close();
			
			
			 
			
			// Buscando Todos as Emrpesas do Banco
			
			s = HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Query query = s.createQuery("from Empresa");
		    List<Empresa> empresas = query.list();
		    
		    for (Empresa empresa : empresas) {
		    	System.out.println("Empresa : " + empresa.getRazaoSocial());
			}
		    
		    
		    
		 // Filtrando Empresa do Banco
			
		 	s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query buscauma = s.createQuery("from Empresa where cnpj = :cnpj");
		 	buscauma.setParameter("cnpj", "456123");
		    List<Empresa> empresas2 = buscauma.list();
		 		    
		    for (Empresa empresa2 : empresas2) {
		    System.out.println("Busca por uma Empresa " + empresa2.getRazaoSocial());
		 	}
		
		
		    
		 // Deletando Empresa
		    
		    
		    s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query consultarRemover = s.createQuery("from Empresa where cnpj = :cnpj");
		 	consultarRemover.setParameter("cnpj", "456123");
		    List<Empresa> empresas3 = consultarRemover.list();
		 		    
		    for (Empresa empresa3 : empresas3) {
		    System.out.println("Empresa para Exlusão " + empresa3.getRazaoSocial());
		    
		    t = s.beginTransaction();			
			
			s.delete(empresa3);
			
			t.commit();
		    
		 	}
		    
			
			
		
		}

		

		
		

	
	
	
	
	



	
	

	

}
