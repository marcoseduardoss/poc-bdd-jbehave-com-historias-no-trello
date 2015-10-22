package br.uece.eada.teste;

import static org.junit.Assert.*;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.uece.jbehave.Subtracao;

public class SubSteps {
	
	private static Subtracao sub;
	
	@Given("um subtrator eh criado")
//	@Aliases(values={"um subtrator eh instanciado" })
	public void givenUmSubtratorÉInstanciado(){
		sub = new Subtracao();
	}
	
	@When("eu subtraio $a e $b")
	public void whenEuSubtraio7E5(int a, int b){
		sub.subtrair(a, b);		
	}

	@Then("o resultado da subtração deve ser $c")	
	public void theResultMustBe(int c){		
		assertEquals(c, sub.getResult());
	}

	


}
