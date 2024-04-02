package locadoraApp.controller;

import com.google.gson.Gson;

import locadoraApp.model.domain.FilmeAcao;
import locadoraApp.model.service.FilmeAcaoService;
import spark.Route;

public class FilmeAcaoController {
	
	
	// Criando as rotas com lambda
	
	public static Route obterLista = (req, res) -> {
		return FilmeAcaoService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		FilmeAcao filme = new Gson().fromJson(req.body(), FilmeAcao.class);
		
		FilmeAcaoService.incluir(filme);
		
		return "Inclusão feita: " + filme;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		FilmeAcao filme = FilmeAcaoService.obter(index);
		
		FilmeAcaoService.excluir(index);
		
		return "Exclusão feita: " + filme;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		FilmeAcao filme = FilmeAcaoService.obter(index);
		
		return "Busca feita: " + filme;
	};
}
