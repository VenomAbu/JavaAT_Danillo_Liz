package locadoraApp.model.domain;

import locadoraApp.model.service.FilmeAcaoService;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private int idade;
	
	public Usuario() {
		this.setNome("Danillo");
		this.setEmail("Ros4Life@mail");
		this.setIdade(20);
	}
	
	public Usuario(String nome) {
		this.setNome(nome);
	}
	
	public Usuario(String nome, String email, int idade) {
		this.setNome(nome);
		this.setEmail(email);
		this.setIdade(idade);
	}
	
	
	@Override
	public String toString() {
		return "Usuário " + id + ": " + nome + " - " + email + " - " + idade + " anos de idade.";
		//return String.format("\nFuncionário %d: %s - %s - %.2f\n", id, nome, cargo, salario);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
