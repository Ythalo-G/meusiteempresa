package controle;

import java.sql.*;

import javax.swing.JOptionPane;
public class conexaoDAO {

	public Statement stmt;
	

	public ResultSet rs;

   private String driver= driver = "com.Mysql.jdbc.Driver";
   
 
   private final String DBNAME ="Pizzaria";
   
  
   private String caminho="jdbc:mysql://localhost:3306/"+DBNAME;
   
   private String usuario = "root"; //usuario do mysql//
   private String senha = "";//senha do mysql//
   public Connection con;//responsavel por realizar a conexao com o banco de dados//
   
   
   public void conectaBanco(){
	   
	   System.setProperty("jdbc.Drivers", driver);
	   
	  
	   try {
		   
		   //fazer conexao atraves do con realizar a conexao com o banco de dados verificar o caminho que esta o banco de dados //
		   //verificar se o usuario e senha esta correto//
		  con=DriverManager.getConnection(caminho,usuario,senha);
		  
		  
		  //exibir a mensagem que conectou no banco//
		  //JOptionPane.showMessageDialog(null,"conexao realizada com sucesso");
	   }catch(SQLException ex){
		   //mensagem de erro na conexao com o banco de dados
		   JOptionPane.showMessageDialog(null,"Erro de conexao"+ex.getMessage());
	   }
   }
   public void desconectar(){
	   
	   //inicio do tratamento de erro caso aconteca algum//
	   try {
		  //fechar banco de dados//
		  con.close();
		  
		  
		  //fechar tratamento de erro e mostrar a mensagem de erro//
		  //SQLExpection ex erro de comando no SQL//
	   }catch(SQLException ex){
		   
		   //mensagem que desconectou do banco de dados//
		   JOptionPane.showMessageDialog(null,"Desconectou");
	
	   }
   }
	
}