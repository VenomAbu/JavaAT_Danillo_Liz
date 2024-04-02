package locadoraApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import locadoraApp.model.domain.Filme;

public class FilmeService {

	private static Map<Integer, Filme> filmes = new HashMap<Integer, Filme>();
	
	private static Integer id = 0;
	
	public static void incluir(Filme filme) {
		
		filme.setId(++id);
		filmes.put(filme.getId(), filme);
	}
	
	public static void excluir(Integer id) {
		filmes.remove(id);
	}
	
	public static Collection<Filme> obterLista() {
		return filmes.values();
	}
	
	public static Filme obter(Integer id) {
		return filmes.get(id);
	}
}


	//void incluir: receber um objeto do tipo funcionários

	//void excluir: receber a chave (id)
	
	//colecao de funcionarios obterLista: não recebe
	
	//funcionario obterPorId: receber a chave