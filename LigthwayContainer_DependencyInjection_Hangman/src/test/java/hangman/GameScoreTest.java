package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;

public class GameScoreTest {
	
	@Test
	public void correctOriginalScore() {
		OriginalScore puntaje = new OriginalScore();
		int valorInferior,valorFrontera,valorSuperior;
		
		valorInferior = puntaje.calculateScore(3, 11);
		valorFrontera = puntaje.calculateScore(4, 10);
		valorSuperior = puntaje.calculateScore(5,9);
		
		Assert.assertEquals(0,valorInferior);
		Assert.assertEquals(0,valorFrontera);
		Assert.assertEquals(10,valorSuperior);
	}
	
	@Test
	public void correctBonusScore() {
		BonusScore puntaje = new BonusScore();
		int valorInferior,valorFrontera,valorSuperior;
		
		valorInferior = puntaje.calculateScore(2, 6);
		valorFrontera = puntaje.calculateScore(4, 8);
		valorSuperior = puntaje.calculateScore(2,2);
		
		Assert.assertEquals(0,valorInferior);
		Assert.assertEquals(0,valorFrontera);
		Assert.assertEquals(10,valorSuperior);
	}
	
	@Test
	public void leastCorrectPowerScore() {
		PowerScore puntaje = new PowerScore();
		int valorInferior,valorFrontera,valorSuperior;
		
		valorInferior = puntaje.calculateScore(2, 8);
		valorFrontera = puntaje.calculateScore(0,0);
		valorSuperior = puntaje.calculateScore(2,0);
		
		Assert.assertEquals(0,valorInferior);
		Assert.assertEquals(0,valorFrontera);
		Assert.assertEquals(30,valorSuperior);
	}
	
	@Test
	public void mostCorrectPowerScore() {
		PowerScore puntaje = new PowerScore();
		int valorInferior,valorFrontera,valorSuperior;
		
		valorInferior = puntaje.calculateScore(3, 0);
		valorFrontera = puntaje.calculateScore(4,8);
		valorSuperior = puntaje.calculateScore(4,10);
		
		Assert.assertEquals(155,valorInferior);
		Assert.assertEquals(500,valorFrontera);
		Assert.assertEquals(500,valorSuperior);
	}

}
