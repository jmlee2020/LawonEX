package lotto.shuffle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class FisherYatesShuffle implements ShuffleImpl{

	@Override
	public ArrayList<Integer> shuffle(LinkedList<Integer> numbers) {
		ArrayList<Integer> lottoNumber = new ArrayList<>();
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i<6; i++) {
			int size = numbers.size();
			int target = random.nextInt(size);
			lottoNumber.add(numbers.get(target));
			numbers.remove(target);
		}
		
		return lottoNumber;
	}


}
