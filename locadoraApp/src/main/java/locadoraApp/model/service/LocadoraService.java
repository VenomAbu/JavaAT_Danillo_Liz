package locadoraApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import locadoraApp.model.domain.Locadora;

public class LocadoraService {

	private static Map<Integer, Locadora> locadoras = new HashMap<Integer, Locadora>();
	
	private static Integer id = 0;
	
	public static void incluir(Locadora locadora) {
		
		locadora.setId(++id);
		locadoras.put(locadora.getId(), locadora);
	}
	
	public static void excluir(Integer id) {
		locadoras.remove(id);
	}
	
	public static Collection<Locadora> obterLista() {
		return locadoras.values();
	}
	
	public static Locadora obter(Integer id) {
		return locadoras.get(id);
	}
}


	//void incluir: receber um objeto do tipo funcionários

	//void excluir: receber a chave (id)
	
	//colecao de funcionarios obterLista: não recebe
	
	//funcionario obterPorId: receber a chave