package locadoraApp.controller;

import com.google.gson.Gson;

import locadoraApp.model.domain.Filme;
import locadoraApp.model.service.FilmeService;
import spark.Route;

public class FilmeController {
	
	
	// Criando as rotas com lambda
	
	public static Route obterLista = (req, res) -> {
		return FilmeService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Filme filme = new Gson().fromJson(req.body(), Filme.class);
		
		FilmeService.incluir(filme);
		
		return "Inclusão feita:" + filme;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Filme filme = FilmeService.obter(index);
		
		FilmeService.excluir(index);
		
		return "Exclusão feita: " + filme;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Filme filme = FilmeService.obter(index);
		
		return "Busca feita: " + filme;
	};
}
