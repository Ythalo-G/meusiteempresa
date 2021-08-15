package br.com.siteempresa;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.DaoGeneric;
import br.com.entidades.Cargo;



@ManagedBean(name= "cargoBean")
@ViewScoped
public class CargoBean {
	
 
	
	private Cargo  cargo = new Cargo();
	private DaoGeneric<Cargo> daoGeneric = new DaoGeneric<Cargo>();
	private List<Cargo> cargos = new ArrayList<Cargo>();
	
	
	
	public String salvar() {
		try {
			cargo = daoGeneric.marge(cargo);
			carregarCargos();
	    }catch(Exception e ) {
			
		}
		return "";
		
	}
	public String novo() {
		cargo = new Cargo();
		return "";
	}
	
	// remover produto da tela
	public String remove() {
		
		daoGeneric.deletePorId(cargo);
		cargo = new Cargo();
		carregarCargos();
		return "";
	}
	
	// remover produto passa por parametro
	public String remove(Cargo cargoParametro) {
		
		daoGeneric.deletePorId(cargoParametro);
		cargo = new Cargo();
		carregarCargos();
		return "";
	}
	
	
	public void carregarCargos() {
		cargos = daoGeneric.getListEntity(Cargo.class);
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public DaoGeneric<Cargo> getDaoGeneric() {
		return daoGeneric;
	}
	public void setDaoGeneric(DaoGeneric<Cargo> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	public List<Cargo> getCargos() {
		return cargos;
	}

	
	
	
	
	
	
}
