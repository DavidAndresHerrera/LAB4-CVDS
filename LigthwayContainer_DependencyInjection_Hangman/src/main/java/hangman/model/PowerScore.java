package hangman.model;

public class PowerScore implements GameScore {

	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		for (int i = 0; i < correctCount; i++) {
			puntaje += Math.pow(5,i+1);
			System.out.println(puntaje+ " "+i);
		}
		puntaje -= incorrectCount*8;
		System.out.println(puntaje+" re");
		if (puntaje > 500) {
			return 500;
		}
		else if (puntaje > 0 ) {
			return puntaje;
		}
		return 0;
	}

}
