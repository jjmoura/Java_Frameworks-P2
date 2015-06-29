package entidades;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
*
 * Classe consultas Nomeadas
 * @author Joao Moura * 
 *
 *
 */


@Entity
@NamedQueries({
    @NamedQuery(name = "buscarTodosNoBanco", query = "select g from Gestor g"),
    @NamedQuery(name = "buscarPorId", query = "select g from Gestor g where g.Id = '5825'"),
    @NamedQuery(name = "encontrarParam", query = "select g from Gestor g where g.Id = :gId")
})

public class Gestor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduto;
	
	
	private Integer Id;
		
	private String nomeGestor;
	
	private Date nascimento;
	
	private Integer CRA;
	
	
	public Gestor() {
		// TODO Auto-generated constructor stub
	}


	public Gestor(Integer idProduto, Integer id, String nomeGestor,
			Date nascimento, Integer cRA) {
		super();
		this.idProduto = idProduto;
		Id = id;
		this.nomeGestor = nomeGestor;
		this.nascimento = nascimento;
		CRA = cRA;
	}


	@Override
	public String toString() {
		return "Gestor [idProduto=" + idProduto + ", Id=" + Id
				+ ", nomeGestor=" + nomeGestor + ", nascimento=" + nascimento
				+ ", CRA=" + CRA + "]";
	}


	public Integer getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getNomeGestor() {
		return nomeGestor;
	}


	public void setNomeGestor(String nomeGestor) {
		this.nomeGestor = nomeGestor;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public Integer getCRA() {
		return CRA;
	}


	public void setCRA(Integer cRA) {
		CRA = cRA;
	}


	
	

}
