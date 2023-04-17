import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTest {

	@Test
	public void testSomar() {
		Calculo soma = new Calculo ();
		
		double resultado = soma.somar(15, 35);
		double resulTest= 50;
		
		assertEquals (resulTest, resultado,0);
	}

	@Test
	public void testSubtrair() {
		Calculo subtracao = new Calculo ();
		
		double resultado = subtracao.subtrair(60,21);
		double resulTest= 39;
		
		assertEquals (resulTest, resultado,0);
	}

	@Test
	public void testMultiplicar() {
		Calculo multiplicacao = new Calculo ();
		
		double resultado = multiplicacao.multiplicar (7, 6);
		double resulTest= 42;
		
		assertEquals (resulTest, resultado,0);
	}

	@Test
	public void testDividir() {
		Calculo divisao = new Calculo ();
		
		double resultado = divisao.dividir(27,3);
		double resulTest= 9;
		
		assertEquals (resulTest, resultado,0);
	}

	@Test
	public void testPotenciar() {
		Calculo potenciacao = new Calculo ();
		
		double resultado = potenciacao.potenciar(3,4);
		double resulTest= 81;
		
		assertEquals (resulTest, resultado,0);
	}

}
