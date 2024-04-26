package br.com.fatec.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.fatec.model.Persistencia;
import br.com.fatec.model.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class TelaDeCadastro extends JFrame {

	private JPanel contentPane;
	private JPasswordField confirmacaoInput;
	private JPasswordField senhaInput;
	private JTextField loginInput;
	private JTextField nomeInput;
	private JButton listarBtn;
	private JButton cadastrarBtn;
	private JButton gravarBtn;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
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
	public TelaDeCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(10, 53, 46, 14);
		contentPane.add(nomeLabel);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setBounds(10, 78, 46, 14);
		contentPane.add(loginLabel);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(10, 103, 46, 14);
		contentPane.add(senhaLabel);
		
		JLabel confirmacaoLabel = new JLabel("Confirma\u00E7\u00E3o de Senha");
		confirmacaoLabel.setBounds(10, 128, 119, 14);
		contentPane.add(confirmacaoLabel);
		
		confirmacaoInput = new JPasswordField();
		confirmacaoInput.setBounds(139, 125, 285, 20);
		contentPane.add(confirmacaoInput);
		
		senhaInput = new JPasswordField();
		senhaInput.setBounds(139, 100, 285, 20);
		contentPane.add(senhaInput);
		
		loginInput = new JTextField();
		loginInput.setBounds(139, 75, 285, 20);
		contentPane.add(loginInput);
		loginInput.setColumns(10);
		
		nomeInput = new JTextField();
		nomeInput.setBounds(139, 50, 285, 20);
		contentPane.add(nomeInput);
		nomeInput.setColumns(10);
		
		listarBtn = new JButton("Listar Usuarios");
		listarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Usuario> lista = Persistencia.listarUsuarios();
				DefaultTableModel tabelamodelo = (DefaultTableModel)table.getModel();
				
				for (Usuario user: lista) {
					Object[] linha = {user.getId(), user.getNome(), user.getLogin(), user.getSenha()};
					tabelamodelo.addRow(linha);
				}
			}
		});
		listarBtn.setBounds(10, 522, 168, 23);
		contentPane.add(listarBtn);
		
		cadastrarBtn = new JButton("Cadastrar");
		cadastrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeInput.getText();
				String login = loginInput.getText();
				String senha = new String(senhaInput.getPassword());
				String confirmacao = new String(confirmacaoInput.getPassword());
				
				if (senha.equals(confirmacao)) {
					Usuario novoUsuario = new Usuario(nome, login, senha);
					Persistencia.cadastrar(novoUsuario);
					JOptionPane.showMessageDialog(null, "Usuário cadastrado!");
				} else {
					JOptionPane.showMessageDialog(null, "Confirmação de senha incorreta!");
				}
				
				nomeInput.setText("");
				loginInput.setText("");
				senhaInput.setText("");
				confirmacaoInput.setText("");
			}
		});
		cadastrarBtn.setBounds(335, 170, 89, 23);
		contentPane.add(cadastrarBtn);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sairBtn.setBounds(317, 522, 107, 23);
		contentPane.add(sairBtn);
		
		gravarBtn = new JButton("Gravar em Arquivo");
		gravarBtn.setBounds(10, 170, 168, 23);
		contentPane.add(gravarBtn);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Login", "Senha"
			}
		));
		table.setBackground(new Color(248, 248, 255));
		table.setBounds(10, 206, 414, 305);
		table.getTableHeader().setVisible(true);
		contentPane.add(table);
	}
}
