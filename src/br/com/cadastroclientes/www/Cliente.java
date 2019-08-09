package br.com.cadastroclientes.www;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private int senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if((nome.length() < 3 || nome.length() > 30)) {
			throw new IllegalArgumentException("Nome Inválido, minimo de 3 Caracteres");
		}else {
			this.nome = nome;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if((email.length() > 50)) {
			throw new IllegalArgumentException("Email está muito extenso");
		}else {
			this.email = email;
		}
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if((telefone.length() < 11 || telefone.length() > 15)) {
			throw new IllegalArgumentException("O telefone está errado, Mínimo 14 caracteres");
		}
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void DadosCadastro() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Senha: " + senha);
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + "]";
	}
	
}
