package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Cliente;
import visao.TelaCadastro;

public class insert {
	
	
	//construir objeto de conexao//
	conexaoDAO bd = new conexaoDAO();
	
	//contruir objeto de tela cliente//
	TelaCadastro dados = new TelaCadastro();
	
	//passar no metodo de cadastros parametro da casse modelo cliente//
	public void cadastrarCliente(Cliente c) {
		
		//solicitar conexao ao banco//
		bd.conectaBanco();
		
		try {
			
			//dentro do objeto bd tem todas as informações de conexao e variavel stmt//
			
			//prepara o banco e inseri informações e cada ? indica o campo na tabela//
			
			PreparedStatement pst = bd.con.prepareStatement("insert into tbCliente (Nome,Telefone,Pizza,Preco,Borda,Obs) values(?,?,?,?,?,?)");
		
					
					//comando para inserir primeiro campo na tabela//
					pst.setString(1,c.getNome()) ;
			       pst.setString(2,c.getTelefone()) ;
			       pst.setString(3,c.getPizza()) ;
			       pst.setFloat(4,c.getPreco()) ;
			       pst.setString(5,c.getBorda()) ;
			       pst.setString(6,c.getObs()) ;
			       
			       //executa comando na tabela///
			       
			       pst.executeUpdate();
			       
			       
			       //termina comando inserir informações no banco fecha o banco//
			       
			       pst.close();
			       
			       //mensagem caso inserir//
			       JOptionPane.showMessageDialog(null, "cadastrado com sucesso");
			       
			       //mensagem de erro caso nao consiga se conectar//
			       
		}catch(SQLException ex) {
			 JOptionPane.showMessageDialog(null, "cadastro nao realizado" +ex.getMessage());
		       
		}
	}



}
