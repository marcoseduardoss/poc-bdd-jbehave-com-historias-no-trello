package br.uece.eada.teste;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;

import br.com.marcos.bddytrello.bdd.JunitStoryTrello;
import br.uece.jbehave.Soma;

public class AdderSteps extends JunitStoryTrello{
	
	private static Soma adder;
	
	@Before
	public void before(){		
		setIdCardKeyAndToken("5614553d5e0a78744c0a913d",Trello.KEY, Trello.TOKEN);
		setSteps(this);
	}
	
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
		//assertEquals(2, adder.getResult());
		assertEquals(c, adder.getResult());
	}

}
