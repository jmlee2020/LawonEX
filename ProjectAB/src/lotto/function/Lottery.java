package lotto.function;
import java.util.ArrayList;
import java.util.Collections;

import lotto.shuffle.FisherYatesShuffle;
import lotto.shuffle.ShuffleImpl;

public class Lottery {

	public ArrayList<Integer> shuffle() {
		Candidates candidates = new Candidates();
		ShuffleImpl fisherYates = new FisherYatesShuffle();
		
		ArrayList<Integer> lotto = fisherYates.shuffle(candidates.get());
		Collections.sort(lotto);
		
		return lotto;
	}
	
}
