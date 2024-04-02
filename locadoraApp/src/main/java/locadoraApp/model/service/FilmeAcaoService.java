package locadoraApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import locadoraApp.model.domain.FilmeAcao;

public class FilmeAcaoService {

	private static Map<Integer, FilmeAcao> filmesAcao = new HashMap<Integer, FilmeAcao>();
	
	private static Integer id = 0;
	
	public static void incluir(FilmeAcao filmeAcao) {
		
		filmeAcao.setId(++id);
		filmesAcao.put(filmeAcao.getId(), filmeAcao);
	}
	
	public static void excluir(Integer id) {
		filmesAcao.remove(id);
	}
	
	public static Collection<FilmeAcao> obterLista() {
		return filmesAcao.values();
	}
	
	public static FilmeAcao obter(Integer id) {
		return filmesAcao.get(id);
	}
}


	//void incluir: receber um objeto do tipo funcionários

	//void excluir: receber a chave (id)
	
	//colecao de funcionarios obterLista: não recebe
	
	//funcionario obterPorId: receber a chave