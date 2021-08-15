package br.com.siteempresa;

import javax.persistence.Persistence;

public class TesteJPA {

	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("meusiteempresa");
	}

}
