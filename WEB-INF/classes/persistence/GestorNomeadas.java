package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Gestor;

/**
*
 * Classe que Executa as consultas nomeadas da classe Gestor
 * @author Joao Moura  * 
 *
 *
 */


public class GestorNomeadas {

	
	public static void main(String[] args) {
		
		// 2 - Obtem um gerenciador de entidades e uma transação
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("cmJavaJPA");

	    EntityManager em = emf.createEntityManager();
		
		Gestor pd = new Gestor();
		
	    pd = em.createNamedQuery("buscarPorID", Gestor.class).getSingleResult();
	    
	    
	    List<Gestor> pf = em.createQuery("Select from Gestor", Gestor.class).getResultList();
		
	}
	
	
	
	
	
	
    
    
	
	
}
