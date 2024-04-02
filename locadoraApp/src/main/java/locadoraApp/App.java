package locadoraApp;

import locadoraApp.controller.FilmeAcaoController;
import locadoraApp.controller.FilmeController;
import locadoraApp.controller.FilmeTerrorController;
import locadoraApp.controller.FuncionarioController;
import locadoraApp.controller.LocadoraController;
import locadoraApp.controller.UsuarioController;
import locadoraApp.controller.ViaCepController;
import locadoraApp.model.domain.Filme;
import locadoraApp.model.domain.FilmeAcao;
import locadoraApp.model.domain.FilmeTerror;
import locadoraApp.model.domain.Funcionario;
import locadoraApp.model.domain.Locadora;
import locadoraApp.model.domain.Usuario;
import locadoraApp.model.service.FilmeAcaoService;
import locadoraApp.model.service.FilmeService;
import locadoraApp.model.service.FilmeTerrorService;
import locadoraApp.model.service.FuncionarioService;
import locadoraApp.model.service.LocadoraService;
import locadoraApp.model.service.UsuarioService;
import spark.Spark;

public class App {

	public static void main(String[] args) {

		Spark.port(8080);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/Index.html");
		});

		// ROTAS USUÁRIO
		Spark.get("/usuario/listar", UsuarioController.obterLista);
		Spark.post("/usuario/incluir", UsuarioController.incluir);
		Spark.delete("/usuario/:id/excluir", UsuarioController.excluir);
		Spark.get("/usuario/:id/obter", UsuarioController.obter);

		// ROTAS FUNCIONÁRIO
		Spark.get("/funcionario/listar", FuncionarioController.obterLista);
		Spark.post("/funcionario/incluir", FuncionarioController.incluir);
		Spark.delete("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id/obter", FuncionarioController.obter);
		
		// ROTAS LOCADORA
		Spark.get("/locadora/listar", LocadoraController.obterLista);
		Spark.post("/locadora/incluir", LocadoraController.incluir);
		Spark.delete("/locadora/:id/excluir", LocadoraController.excluir);
		Spark.get("/locadora/:id/obter", LocadoraController.obter);
		
		// ROTAS FILME
		Spark.get("/filme/listar", FilmeController.obterLista);
		Spark.post("/filme/incluir", FilmeController.incluir);
		Spark.delete("/filme/:id/excluir", FilmeController.excluir);
		Spark.get("/filme/:id/obter", FilmeController.obter);
		
		// ROTAS FILME ACAO
		Spark.get("/filmeAcao/listar", FilmeAcaoController.obterLista);
		Spark.post("/filmeAcao/incluir", FilmeAcaoController.incluir);
		Spark.delete("/filmeAcao/:id/excluir", FilmeAcaoController.excluir);
		Spark.get("/filmeAcao/:id/obter", FilmeAcaoController.obter);
		
		// ROTAS FILME TERROR
		Spark.get("/filmeTerror/listar", FilmeTerrorController.obterLista);
		Spark.post("/filmeTerror/incluir", FilmeTerrorController.incluir);
		Spark.delete("/filmeTerror/:id/excluir", FilmeTerrorController.excluir);
		Spark.get("/filmeTerror/:id/obter", FilmeTerrorController.obter);

		// VIACEP - A SANTA API DE TODOS NÓS!
		Spark.get("/viacep/:cep", ViaCepController.getEndereco);

		// Instanciando alguns objetos e os adicionando nas listas, para poder exibir
		// eles sem dificuldades.
		
		
		// Usuários
		Usuario u1 = new Usuario("Liz", "liz@mail", 16);
		Usuario u2 = new Usuario("Patty", "patty@mail", 15);
		Usuario u3 = new Usuario("Soul", "soul@mail", 16);
		
		UsuarioService.incluir(u1);
		UsuarioService.incluir(u2);
		UsuarioService.incluir(u3);
		
		// Funcionarios
		Funcionario f1 = new Funcionario("Rosalina", "Dona de tudo e todos", 9999);
		Funcionario f2 = new Funcionario("Death The Kid", "Agiota/Cobrador", 888);
		Funcionario f3 = new Funcionario("Danillo Liz", "Estagiário", 0);

		FuncionarioService.incluir(f1);
		FuncionarioService.incluir(f2);
		FuncionarioService.incluir(f3);
		
		// Locadoras
		
		Locadora l1 = new Locadora();
		Locadora l2 = new Locadora("Locadora da Peach", "Reino dos Cogumelos", 2002);
		Locadora l3 = new Locadora("Locadora do Luigi", "Mansão Assombrada", 1625);
		
		LocadoraService.incluir(l1);
		LocadoraService.incluir(l2);
		LocadoraService.incluir(l3);

		
		// Filmes
		
		Filme fi1 = new Filme();
		Filme fi2 = new Filme("Pump Fiction", "Tarantino", 1995, "Drama", true);
		Filme fi3 = new Filme("O Estranho Mundo de Jack", "Tim Burton", 1993, "Comédia", true);
		
		FilmeService.incluir(fi1);
		FilmeService.incluir(fi2);
		FilmeService.incluir(fi3);

		// Cansei de ficar preenchendo e vou só colocar os padrões
		
		// Filmes de Acão
		FilmeAcao fa1 = new FilmeAcao();
		fa1.setTitulo("Duro de Matar");
		FilmeAcao fa2 = new FilmeAcao();
		fa2.setTitulo("Mercenários");
		FilmeAcao fa3 = new FilmeAcao();
		fa3.setTitulo("Missão Impossível");
		FilmeAcaoService.incluir(fa1);
		FilmeAcaoService.incluir(fa2);
		FilmeAcaoService.incluir(fa3);
		
		// Filmes de Terror
		FilmeTerror ft1 = new FilmeTerror();
		ft1.setTitulo("Sexta-feira 13");
		FilmeTerror ft2 = new FilmeTerror();
		ft2.setTitulo("Halloween");
		FilmeTerror ft3 = new FilmeTerror();
		ft3.setTitulo("A Bruxa de Blair");
		FilmeTerrorService.incluir(ft1);
		FilmeTerrorService.incluir(ft2);
		FilmeTerrorService.incluir(ft3);
	}
}