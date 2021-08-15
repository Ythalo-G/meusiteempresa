package br.com.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empregador implements Serializable {
    
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long codEmpregador;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	
	@ManyToOne
	@JoinColumn(name ="codCargo")
	private Cargo cargo;
	
	@Column(name = "dataAdmisao")
	private String data;
	
	@Column(name = "salario")
	private Float salario;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "situacao")
	private String situacao;
	
	@Column(name = "observacao")
	private String observacao;

	public Long getCodEmpregador() {
		return codEmpregador;
	}

	public void setCodEmpregador(Long codEmpregador) {
		this.codEmpregador = codEmpregador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEmpregador == null) ? 0 : codEmpregador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregador other = (Empregador) obj;
		if (codEmpregador == null) {
			if (other.codEmpregador != null)
				return false;
		} else if (!codEmpregador.equals(other.codEmpregador))
			return false;
		return true;
	}







}
