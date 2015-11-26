package br.uece.eada.teste;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.junit.Before;

import br.com.marcos.bddytrello.bdd.JunitStoryTrello;


public class CadastroAccSteps extends JunitStoryTrello {
		
//	private PaginaWeb paginWeb = null;

	@Before
	public void before() {

		// inicializa dados de acesso ao trello
		setIdCardKeyAndToken("562113fc9399876b9eb3be55", Trello.KEY, Trello.TOKEN);
		setSteps(this);

		//ABRE a PÁGINA WEB
//		this.paginWeb = new PaginaWeb();
		
		// inicializa dados de acesso ao seleinum
//		this.paginWeb = new PaginaWeb(Trello.PATH_PHANTOMJS);		
		
	}

	@After
	public void after() {
//		this.paginWeb.close();// FECHA O NAVEADOR APÓS O USO 
	}
	
	@Given("estou logado no AlunoOnline")
	public void givenEuEstouLogadoNoMóduloAlunoOnline() {
//		this.paginWeb.open(Trello.URL + "/index.html");
//		this.paginWeb.open("http://www.google.com.br");
	}

	@When("clico no link $link")
	public void whenClicoNoBotãoCadastrarACC(String valor) {
//		 this.paginWeb.clickById("cadastraracc01");
	}

	@When("escolho a Natureza da Atividade $natureza")
	public void whenEscolhoANaturezaDaAtividadeAcadêmicaEnsino(String valor) {
//		 this.paginWeb.selecionarComboBoxByIndex("naturezaid", 1);
	}

	@When("escolho o Tipo de Atividade $tipo")
	public void whenEscolhoADescriçãoDaAtividadeCursosDeLínguaEstrangeiraMínimoTrêsSemestres(String valor) {
//		 this.paginWeb.selecionarComboBoxByIndex("atividadeid", 1);
	}

	@When("digito a Data de Início $data")
	public void whenDigitoADataDeInício23102015(String valor) {
//		this.paginWeb.preencherCampoData("matricula7", valor);
	}

	@When("digito a Data de Fim $data")
	public void whenDigitoADataDeFim09112015(String valor) {
//		this.paginWeb.preencherCampoData("datafim", valor);
	}

	@When("digito a Descrição da ACC $descricao") 
	public void whenDigitoADescriçãoDaACCCursoRealizadoNaSemanaUniversitária(String valor) {
//		this.paginWeb.preencherCampoTexto("cursoevento", valor);
	}

	@When("digito a Carga Horária da ACC $ch")
	public void whenDigitoACargaHoráriaDaACC60(String valor) {
//		this.paginWeb.preencherCampoTexto("hora", valor);
	}

	@When("anexo o certificado escaneado.")
	public void whenEscolhoOArquivoASerAnexado() {
		//PENDENTE
	}

	@When("clico no botão $botao") 
	public void whenClicoNoBotãoEnviarAcc(String valor) {
//		this.paginWeb.clickById("enviar");
	}

	@Then("a ACC é persistida no sistema e o sistema exibe exibe o número de registro da ACC e exibe a mensagem $msg")
	public void thenExibemsgDeSucesso(String msg, String numero) {
//		assertTrue(this.paginWeb.containText(msg));
	}
	
	
}
