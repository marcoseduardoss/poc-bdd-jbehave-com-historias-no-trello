package br.uece.eada.teste;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;

import br.com.marcos.bddytrello.bdd.JunitStoryTrello;
import br.com.marcos.bddytrello.selenium.PaginaWeb;

public class CardTest extends JunitStoryTrello {

	private PaginaWeb paginWeb = null;	
	
	@Before
	public void before() {
		
		//inicializa dados de acesso ao trello		
		setIdCardKeyAndToken("56282bc41ee0573169fd3671", Trello.KEY, Trello.TOKEN);
		setSteps(this);
		
		//inicializa dados de acesso ao seleinum
		this.paginWeb = new PaginaWeb("C:\\marcos\\phantomjs.exe");
//		this.paginWeb = new PaginaWeb();
	}

	@Given("o coordenador esteja logado no sistema")
	public void givenOCoordenadorEstejaLogadoNoSistema() {
		this.paginWeb.open(Trello.URL+"/logado.html");
	}

	@When("clico em $link")
	public void whenClicoEmLiberarTurmas(String link) {
		this.paginWeb.clickById("cadastraracc01");
	}

	@When("escolho o tipo de ensino $tipoDeEnsino")
	public void whenEscolhoOTipoDeEnsinoÀDistancia(String tipoDeEnsino) {
		this.paginWeb.selecionarComboBoxByIndex("naturezaid", 2);	
		System.out.println("Tipo de ensino: "+tipoDeEnsino);
	}

	@When("escolho o polo $polo")
	public void whenEscolhoOPoloBeberibe(String polo) {
		System.out.println("Polo: "+polo);
	}

	@When("escolho o ano $ano")
	public void whenEscolhoOAno2012(String ano) {
		System.out.println("Ano: "+ano);
	}

	@When("escolho o curso $curso")
	public void whenEscolhoOCursoLicInformática(String curso) {
		System.out.println("Curso: "+curso);
	}

	@When("escolho a turma $turma")
	public void whenEscolhoATurma20122(String turma) {
		System.out.println("Turma: "+turma);
	}

	@When("ele clica em $botao")
	public void whenEleClicaEmLiberarEnvio(String botao) {
		System.out.println("botao: "+botao);
	}

	@When("ele clica no $botao")
	public void whenEleClicaNoBotãoImprimir(String botao) {
		System.out.println("botao: "+botao);
	}

	@Then("o sistema exibe a mensagem $msg.")
	public void thenOSistemaExibeAMensagemEnvioLiberadoComSucesso(String msg) {
		System.out.println("msg:"+msg);
	}

}
