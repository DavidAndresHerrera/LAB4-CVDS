package hangman.model;

public class BonusScore implements GameScore {

	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		if (correctCount > 0) {
			puntaje += (10)*correctCount;
		}
		if (incorrectCount > 0)
		{
			puntaje -= 5*incorrectCount;
		}
		if (puntaje > 0) return puntaje;
		return 0;
	}

}
