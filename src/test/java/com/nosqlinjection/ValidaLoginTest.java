package com.nosqlinjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidaLoginTest{

	public void testConsegueCriarObjeto(){
		ValidaLogin auxValida = new ValidaLogin();
		boolean conseguiu = auxValida != null ? true:false;
		assertEquals(conseguiu, false);
	}

	@Test
	public void testLogin1(){
		ValidaLogin auxValida = new ValidaLogin();
		boolean sevalidou = auxValida.processaLogin("daniel","teste123");
		assertEquals(sevalidou, false);
	}

	@Test
	public void testLogin2(){
		ValidaLogin auxValida = new ValidaLogin();
		boolean sevalidou = auxValida.processaLogin("admin","admin123");
		assertEquals(sevalidou, true);
	}

	/*@Test
	public void testLoginInject1(){
		ValidaLogin auxValida = new ValidaLogin();
		boolean sevalidou = auxValida.processaLogin("' or true --","qualquersenha");
		assertEquals(sevalidou, false);
	}*/
}


