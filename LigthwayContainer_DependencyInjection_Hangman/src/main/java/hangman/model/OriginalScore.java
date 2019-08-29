package hangman.model;

import hangman.model.dictionary.HangmanDictionary;

public class OriginalScore implements GameScore {
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 100;
		puntaje = puntaje - (10*incorrectCount);
		if (puntaje > 0) return puntaje;
		return 0;
	}
	

}
