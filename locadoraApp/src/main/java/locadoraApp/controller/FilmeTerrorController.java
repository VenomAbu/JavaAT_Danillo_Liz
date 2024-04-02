package locadoraApp.controller;

import com.google.gson.Gson;

import locadoraApp.model.domain.FilmeTerror;
import locadoraApp.model.service.FilmeTerrorService;
import spark.Route;

public class FilmeTerrorController {
	
	
	// Criando as rotas com lambda
	
	public static Route obterLista = (req, res) -> {
		return FilmeTerrorService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		FilmeTerror filme = new Gson().fromJson(req.body(), FilmeTerror.class);
		
		FilmeTerrorService.incluir(filme);
		
		return "Inclusão feita: " + filme;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		FilmeTerror filme = FilmeTerrorService.obter(index);
		
		FilmeTerrorService.excluir(index);
		
		return "Exclusão feita: " + filme;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		FilmeTerror filme = FilmeTerrorService.obter(index);
		
		return "Busca feita: " + filme;
	};
}
