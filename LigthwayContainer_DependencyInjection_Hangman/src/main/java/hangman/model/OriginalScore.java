package hangman.model;

import com.google.inject.Inject;
import hangman.model.dictionary.HangmanDictionary;

public class OriginalScore implements GameScore {
        private int score;
    
        public OriginalScore(){
            score=100;
        }
    
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		//int puntaje = 100;
		score = score - (10*incorrectCount);
		if (score > 0) return score;
		return 0;
	}
	

}
