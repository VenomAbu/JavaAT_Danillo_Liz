package locadoraApp.model.domain;

public class FilmeAcao extends Filme {
	
	private int id;
	
	private String nome;
	private String descricao;
	private int popularidade;
	
	
	public FilmeAcao() {
		super();
		this.setNome("Filme de Ação");
		this.setDescricao("Esse é um filme de ação frenética!");
		this.setPopularidade(5);
	}
	
	public FilmeAcao(String nome, String descricao, int popularidade) {
		this();
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setPopularidade(popularidade);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + nome + " - " + descricao + " - " + popularidade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPopularidade() {
		return popularidade;
	}
	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
}
