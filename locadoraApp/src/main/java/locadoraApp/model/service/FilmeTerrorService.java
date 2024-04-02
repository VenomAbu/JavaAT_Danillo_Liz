package locadoraApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import locadoraApp.model.domain.FilmeTerror;

public class FilmeTerrorService {

	private static Map<Integer, FilmeTerror> filmesTerror = new HashMap<Integer, FilmeTerror>();
	
	private static Integer id = 0;
	
	public static void incluir(FilmeTerror filmeTerror) {
		
		filmeTerror.setId(++id);
		filmesTerror.put(filmeTerror.getId(), filmeTerror);
	}
	
	public static void excluir(Integer id) {
		filmesTerror.remove(id);
	}
	
	public static Collection<FilmeTerror> obterLista() {
		return filmesTerror.values();
	}
	
	public static FilmeTerror obter(Integer id) {
		return filmesTerror.get(id);
	}
}


	//void incluir: receber um objeto do tipo funcionários

	//void excluir: receber a chave (id)
	
	//colecao de funcionarios obterLista: não recebe
	
	//funcionario obterPorId: receber a chave