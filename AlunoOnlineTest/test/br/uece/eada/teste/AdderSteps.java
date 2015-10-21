package br.uece.eada.teste;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.uece.jbehave.Soma;

public class AdderSteps {
	
	private static Soma adder;
	
	@Given("um somador é criado")
//	@Aliases(values={"um somador é criado"})
	public void theAdderIsCreated(){
		adder = new Soma();
	}
	
	@When("eu adiciono $a e $b")
	public void iAddTwoNumbers(int a, int b){
		adder.somar(a, b);
	}

	@Then("o resultado da soma deve ser $c")
	public void theResultMustBe(int c){
		assertEquals(c, adder.getResult());
	}

}
