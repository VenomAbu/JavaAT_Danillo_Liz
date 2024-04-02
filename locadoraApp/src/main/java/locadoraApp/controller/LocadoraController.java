package locadoraApp.controller;

import com.google.gson.Gson;

import locadoraApp.model.domain.Locadora;
import locadoraApp.model.service.LocadoraService;
import spark.Route;

public class LocadoraController {
	
	
	// Criando as rotas com lambda
	
	public static Route obterLista = (req, res) -> {
		return LocadoraService.obterLista();
	};
	
	public static Route incluir = (req, res) -> {
		
		Locadora locadora = new Gson().fromJson(req.body(), Locadora.class);
		
		LocadoraService.incluir(locadora);
		
		return "Inclusão feita: " + locadora;
	};
	
	public static Route excluir = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Locadora locadora = LocadoraService.obter(index);
		
		LocadoraService.excluir(index);
		
		return "Exclusão feita: " + locadora;
	};
	
	public static Route obter = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Locadora locadora = LocadoraService.obter(index);
		
		return "Busca feita: " + locadora;
	};
	
}
