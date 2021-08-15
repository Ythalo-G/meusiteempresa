package visao;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.insert;
import modelo.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFormattedTextField;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtnome = new JLabel("Nome:");
		txtnome.setBackground(SystemColor.textHighlight);
		txtnome.setForeground(new Color(0, 0, 0));
		txtnome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtnome.setBounds(22, 29, 68, 20);
		contentPane.add(txtnome);
		
		JLabel txtTelefone = new JLabel("Telefone:");
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTelefone.setBounds(22, 75, 94, 20);
		contentPane.add(txtTelefone);
		
		JLabel txtPizza = new JLabel("Pizza:");
		txtPizza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPizza.setBounds(22, 126, 68, 20);
		contentPane.add(txtPizza);
		
		JLabel textfieldPreco = new JLabel("Pre\u00E7o:");
		textfieldPreco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textfieldPreco.setBounds(170, 127, 68, 20);
		contentPane.add(textfieldPreco);
		
		JLabel txtObs = new JLabel("Obs:");
		txtObs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtObs.setBounds(10, 194, 68, 20);
		contentPane.add(txtObs);
		
		textFieldNome = new JTextField();
		textFieldNome.setBackground(new Color(255, 255, 255));
		textFieldNome.setForeground(new Color(0, 0, 0));
		textFieldNome.setBounds(109, 26, 139, 31);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBackground(new Color(255, 255, 255));
		textFieldTelefone.setForeground(new Color(0, 0, 0));
		textFieldTelefone.setBounds(109, 71, 139, 34);
		contentPane.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		JComboBox comboBoxPizza = new JComboBox();
		comboBoxPizza.setModel(new DefaultComboBoxModel(new String[] {"Americana", "Atum", "Bacon", "Calabresa", "Portuguesa", "Mussarela", "Quatro Queijo", "Parmegiana", "Escarola", "Milho", "Carne seca", "Carne Seca com catupiry", "Frango", "Frango com Catupiry", "Frango com mussarela", "Bauru", "Moda da casa"}));
		comboBoxPizza.setBounds(71, 129, 89, 20);
		contentPane.add(comboBoxPizza);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setBounds(228, 129, 86, 20);
		contentPane.add(textFieldPreco);
		textFieldPreco.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Borda Recheada\r\n");
		rdbtnNewRadioButton.setBounds(27, 164, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Borda simpes");
		rdbtnNewRadioButton_1.setBounds(170, 164, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextArea textAreaObs = new JTextArea();
		textAreaObs.setBounds(34, 225, 263, 77);
		contentPane.add(textAreaObs);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(47, 313, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(170, 313, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\istockphoto-1083487948-612x612.jpg"));
		lblNewLabel.setBounds(0, 0, 324, 341);
		contentPane.add(lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(202, 78, 6, 20);
		contentPane.add(formattedTextField);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Borda;
				
				//construir classe modelo Cliente//
				Cliente c = new Cliente();
				
				//contruir classe para inserir dados//
				insert d = new insert();
				
				
				if(e.getSource()==btnNewButton) {
					
					if(rdbtnNewRadioButton.isSelected() ) {
						Borda = "Borda Recheada";
					
					}
					else  {
						 Borda = "Borda Simples";
						
					}
					//apontar dados do encapsulamento//
					c.setNome( textFieldNome.getText());
				
					c.setTelefone((textFieldTelefone.getText()));
					c.setPizza(String.valueOf(comboBoxPizza.getSelectedItem()));
					c.setPreco(Float.parseFloat(textFieldPreco.getText()));
					c.setBorda((Borda));
					c.setObs(textAreaObs.getText());
					
				
					
					
					//passar a classe modelo junto com ade dados do cliente//
					
					d.cadastrarCliente(c);
					
				}
			}
		});
		}
}
