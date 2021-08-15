package br.com.siteempresa;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.DaoGeneric;
import br.com.entidades.Cargo;
import br.com.entidades.Empregador;

@ManagedBean(name="empregadorBean")
@ViewScoped
public class EmpregadorBean {
	
	@PostConstruct
	public void init() {
		// se o produto tiver == null instancia a classe
		if (empregador.getCargo() == null) {
			empregador.setCargo(new Cargo());
		}
	}
	
	private Empregador empregador = new Empregador();
	private DaoGeneric<Empregador> daoGeneric = new DaoGeneric<Empregador>();
	
	private List<Empregador> empregadores = new ArrayList<Empregador>();
	
	public String salvar() {
		try {
			empregador = daoGeneric.marge(empregador);
			carregarEmpregadores();
	    }catch(Exception e ) {
			
		}
		return "";
		
	}
	public String novo() {
		empregador = new Empregador();
		return "";
	}
	
	// remover produto da tela
	public String remove() {
		
		daoGeneric.deletePorIdEmpregador(empregador);
		empregador = new Empregador();
		empregador.setCargo(new Cargo());
		carregarEmpregadores();
		return "";
	}
	
	// remover produto passa por parametro
	public String remove(Empregador empregadorParametro) {
		
		daoGeneric.deletePorIdEmpregador(empregadorParametro);
		empregador = new Empregador();
		empregador.setCargo(new Cargo());
		carregarEmpregadores();
		return "";
	}
	
	
	public void carregarEmpregadores() {
		empregadores = daoGeneric.getListEntity(Empregador.class);
	}
	
	
	
	
	public Empregador getEmpregador() {
		return empregador;
	}

	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}

	public DaoGeneric<Empregador> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Empregador> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}

	public List<Empregador> getEmpregadores() {
		return empregadores;
	}
	
}
