package hangman.model;

import com.google.inject.Inject;

public class BonusScore implements GameScore {
        private int score;
        
        @Inject
        public BonusScore(){
            score=0;
        }
    
    
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		//int puntaje = 0;
		if (correctCount > 0) {
			score += (10)*correctCount;
		}
		if (incorrectCount > 0)
		{
			score -= 5*incorrectCount;
		}
		if (score > 0) return score;
		return 0;
	}

}
