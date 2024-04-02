package locadoraApp.model.domain;

import java.util.List;

public class Locadora {
	
	private int id;
	private String nome;
	private String localizacao;
	private int anoInicialFuncionamento;
	private Funcionario funcionario;
	private List<Filme> filme;
	
	public Locadora() {
		this.setNome("Locadora Rosalina");
		this.setLocalizacao("Observatório");
		this.setAnoInicialFuncionamento(2000);
	}
	
	public Locadora(String nome, String localizacao, int ano) {
		this();
		this.setNome(nome);
		this.setLocalizacao(localizacao);
		this.setAnoInicialFuncionamento(ano);
	}
	
	
	@Override
	public String toString() {
		return "Locadora " + id + ": " + nome + " - " + localizacao + " - " + anoInicialFuncionamento + " - " + funcionario + " - " + "\n" + filme;
		//return String.format("\nFuncionário %d: %s - %s - %.2f\n", id, nome, cargo, salario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getAnoInicialFuncionamento() {
		return anoInicialFuncionamento;
	}
	public void setAnoInicialFuncionamento(int anoInicialFuncionamento) {
		this.anoInicialFuncionamento = anoInicialFuncionamento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Filme> getFilme() {
		return filme;
	}

	public void setFilme(List<Filme> filme) {
		this.filme = filme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
