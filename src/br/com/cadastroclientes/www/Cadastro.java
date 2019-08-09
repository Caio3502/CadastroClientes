package br.com.cadastroclientes.www;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.cadastroclientes.dao.ClienteDAO;

public class Cadastro {
	public static void main(String[] args) throws SQLException {
		Scanner leitura = new Scanner(System.in);
		String nome;
		String email;
		String telefone;
		int senha;
		
		
		try {
			Cliente cliente = new Cliente();
			
			System.out.println("Nome: ");
			nome = leitura.nextLine();
			cliente.setNome(nome);
			
			System.out.println("Email: ");
			email = leitura.nextLine();
			cliente.setEmail(email);
			
			
			System.out.println("Telefone: ");
			telefone = leitura.nextLine();
			cliente.setTelefone(telefone);
			
			System.out.println("Senha: ");
			senha = leitura.nextInt();
			cliente.setSenha(senha);
			
			cliente.DadosCadastro();
			ClienteDAO clienteDAO= new ClienteDAO();
			clienteDAO.salvar(cliente);
			
		System.out.println("CLIENTE SALVO COM SUCESSO!!!");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

