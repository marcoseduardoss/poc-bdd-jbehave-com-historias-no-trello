package br.uece.eada.teste;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.After;
import org.junit.Before;

import br.com.marcos.bddytrello.bdd.JunitStoryTrello;


public class TesteSteps extends JunitStoryTrello {
		
	@Before
	public void before() {

		// inicializa dados de acesso ao trello
		setIdCardKeyAndToken("562113fc9399876b9eb3be55", Trello.KEY, Trello.TOKEN);
		setSteps(this);
		
	}

	@After
	public void after() {
	}
	
	@Given("estou logado no AlunoOnline")
	public void givenEuEstouLogadoNoMóduloAlunoOnline() {
	}

	@When("clico no link $link")
	public void whenClicoNoBotãoCadastrarACC(String valor) {
	}

	@When("escolho a Natureza da Atividade $natureza")
	public void whenEscolhoANaturezaDaAtividadeAcadêmicaEnsino(String valor) {
	}

	@When("escolho o Tipo de Atividade $tipo")
	public void whenEscolhoADescriçãoDaAtividadeCursosDeLínguaEstrangeiraMínimoTrêsSemestres(String valor) {
	}

	@When("digito a Data de Início $data")
	public void whenDigitoADataDeInício23102015(String valor) {
	}

	@When("digito a Data de Fim $data")
	public void whenDigitoADataDeFim09112015(String valor) {
	}

	@When("digito a Descrição da ACC $descricao") 
	public void whenDigitoADescriçãoDaACCCursoRealizadoNaSemanaUniversitária(String valor) {
	}

	@When("digito a Carga Horária da ACC $ch")
	public void whenDigitoACargaHoráriaDaACC60(String valor) {
	}

	@When("anexo o certificado escaneado.")
	public void whenEscolhoOArquivoASerAnexado() {
	}

	@When("clico no botão $botao") 
	public void whenClicoNoBotãoEnviarAcc(String valor) {
	}

	@Then("a ACC é persistida no sistema e o sistema exibe exibe o número de registro da ACC e exibe a mensagem $msg")
	public void thenExibemsgDeSucesso(String msg, String numero) {
	}
	
	
}
