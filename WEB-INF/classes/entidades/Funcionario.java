package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




/**
*
 * Classe estrutural do obejto funcionario.
 * @author Joao Moura  * 
 *
 *
 */




@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFuncionario;
	
	@Column(unique = true)
	private Integer cpf;	
	
	private String nome;
	
	
	@ManyToOne
	private Empresa empresa;
	
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public Funcionario(Integer idFuncionario, Integer cpf, String nome) {
		super();
		this.idFuncionario = idFuncionario;
		this.cpf = cpf;
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", cpf=" + cpf
				+ ", nome=" + nome + "]";
	}


	public Integer getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	

	
	

	
	
	
}