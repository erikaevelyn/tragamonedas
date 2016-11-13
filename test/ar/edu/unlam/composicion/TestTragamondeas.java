package ar.edu.unlam.composicion;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestTragamondeas {

	@SuppressWarnings("deprecation")
	@Test
	public void queElTragamonedasArrojeValoresEnElRango() {
		Tragamonedas tragamonedas = new Tragamonedas();
		Integer minimo = 1;
		Integer maximo = 10;
		tragamonedas.jugar();

		Assert.assertTrue(tragamonedas.getTambor1() >= minimo
				&& tragamonedas.getTambor1() <= maximo);
		Assert.assertTrue(tragamonedas.getTambor2() >= minimo
				&& tragamonedas.getTambor2() <= maximo);
		Assert.assertTrue(tragamonedas.getTambor3() >= minimo
				&& tragamonedas.getTambor3() <= maximo);
	}

}
