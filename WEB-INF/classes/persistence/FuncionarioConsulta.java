package persistence;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Empresa;
import entidades.Funcionario;


/**
*
 * Classe de consulta com JPQL.
 * @author Joao Moura  * 
 *
 *
 */



public class FuncionarioConsulta{

	public static void main(String[] args) {
		
		Session s;
		
		Transaction t;
		
			
		
		
		s = HibernateUtil.getSessionFactory().openSession();
	 	org.hibernate.Query consultafuncionario = s.createQuery("from Funcionario");
	 	
	    List<Funcionario> fcs = consultafuncionario.list();
	 		    
	    for (Funcionario funcionario : fcs) {
	    System.out.println("Busca por um Funcionario ? " + funcionario.getNome());
	 	}
		
		

	}

}
