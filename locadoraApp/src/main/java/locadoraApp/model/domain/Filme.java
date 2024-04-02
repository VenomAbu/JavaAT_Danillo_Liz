package locadoraApp.model.domain;

public class Filme {
	
	private int id;
	
	protected String titulo;
	protected String autor;
	protected int anoPublicacao;
	protected String genero;
	protected boolean disponibilidade;
	
	
	
	public Filme() {
		this.setTitulo("Mario Bros");
		this.setAutor("Universal Pictures");
		this.setAnoPublicacao(2023);
		this.setGenero("Infantil");
		this.setDisponibilidade(false);
	}
	
	public Filme(String titulo, String autor, int ano, String genero, boolean disponibilidade) {

		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAnoPublicacao(ano);
		this.setGenero(genero);
		this.setDisponibilidade(disponibilidade);
	
	}
	
	@Override
	public String toString() {
		return "Filme " + id + ": " + titulo + " - " + autor + " - " + anoPublicacao + " - " + genero + " - " + disponibilidade;
		//return String.format("\nFuncionário %d: %s - %s - %.2f\n", id, nome, cargo, salario);
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
}
