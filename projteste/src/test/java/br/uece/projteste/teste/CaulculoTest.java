package br.uece.projteste.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.uece.projteste.Calculo;


public class CaulculoTest {

	@Test
	public void test() {
		assertEquals(Calculo.somar(2, 3), 5);
	}

}
