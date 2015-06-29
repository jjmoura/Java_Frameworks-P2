package entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
*
 * Entidade, classe padrao
 * @author Joao Moura  * 
 *
 *
 */


@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEmpresa;
	
	@Column(unique = true)
	private String cnpj;
	
	private String razaoSocial;
	
	@OneToMany(mappedBy = "empresa")
	private List<Funcionario> funcionario;
	
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}


	public Empresa(Integer idEmpresa, String cnpj, String razaoSocial) {
		super();
		this.idEmpresa = idEmpresa;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}


	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", cnpj=" + cnpj
				+ ", razaoSocial=" + razaoSocial + "]";
	}


	public Integer getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public List<Funcionario> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}



	
	
	
	
}
