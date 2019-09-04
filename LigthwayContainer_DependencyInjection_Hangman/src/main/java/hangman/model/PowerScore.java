package hangman.model;

import com.google.inject.Inject;

public class PowerScore implements GameScore {
        private int score;
        
        @Inject
        public  PowerScore(){
            score=0;
        }
       
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		//int puntaje = 0;
		for (int i = 0; i < correctCount; i++) {
			score += Math.pow(5,i+1);
			System.out.println(score+ " "+i);
		}
		score -= incorrectCount*8;
		System.out.println(score+" re");
		if (score > 500) {
			return 500;
		}
		else if (score > 0 ) {
			return score;
		}
		return 0;
	}

}
