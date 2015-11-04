package br.uece.eada.teste;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;

import br.com.marcos.bddytrello.bdd.JunitStoryTrello;
import br.uece.jbehave.Subtracao;

public class SubtracaoTest extends JunitStoryTrello{	
	
	private static Subtracao sub;

	@Before
	public void before(){
		setIdCard("56155f117c3c5e684aa8e321");
		setSteps(this);
		System.out.println("Marcos Eduardo");
	}
	
	@Given("um subtrator eh criado")
//	@Aliases(values={"um subtrator eh instanciado"})
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
