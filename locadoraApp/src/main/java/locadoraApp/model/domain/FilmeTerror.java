package locadoraApp.model.domain;

public class FilmeTerror extends Filme {
	
	private String tema;
	private String ambiente;
	private String monstro;
	
	public FilmeTerror() {
		super();
		this.setTema("Estudantes vs Assassino");
		this.setAmbiente("Cidade Abandonada");
		this.setMonstro("Serial Killer");
	}
	
	public FilmeTerror(String tema, String ambiente, String monstro) {
		this();
		this.setTema(tema);
		this.setAmbiente(ambiente);
		this.setMonstro(monstro);
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + tema + " - " + ambiente + " - " + monstro;
	}
	
	public String getMonstro() {
		return monstro;
	}
	public void setMonstro(String monstro) {
		this.monstro = monstro;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}	
}
