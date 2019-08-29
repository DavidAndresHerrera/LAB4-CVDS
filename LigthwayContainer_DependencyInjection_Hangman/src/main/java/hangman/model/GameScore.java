package hangman.model;

public interface GameScore {
	/**
	 * 
	 * @param correctCount numero de acierto de letras correctas
	 * @param incorrectCount numero de desaciertos de letras incorrectas
	 * @return el calor total del puntaje dependiendo de que tipo de evali
	 */
	public int calculateScore(int correctCount, int incorrectCount);
}
