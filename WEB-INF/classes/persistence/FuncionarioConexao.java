package persistence;


import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Funcionario;

/**
*
 * Classe que faz o acesso ao Banco para gravar as informacoes.
 * @author Joao Moura  * 
 *
 *
 */

public class FuncionarioConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		Session s;
		
		Transaction t;

		
		 
				//Gravando Nota Fiscal    

	    
	    Funcionario fc = new Funcionario();
		
		fc.setCpf(741);
		fc.setNome("Dilma Rolseff");
		
		fc.setEmpresa(null);
		
			    
		
		s = HibernateUtil.getSessionFactory().openSession();
		
		t = s.beginTransaction();			
		
		s.save(fc);
		
		t.commit();
		s.close();
	    
		System.out.println("Dados do Funcionario " + fc.getNome()  + " Gravados!");
		
		
		 
	    }
		
		

		
		
	}

