package lotto.function;
import java.util.LinkedList;

public class Candidates {
	
	private static LinkedList<Integer> numbers = new LinkedList<>();
	
	// 후보군 생성 시 자동 숫자 설정
	public Candidates() {
		reset();
	}

	// 후보군 리셋
	public void reset () {
		numbers.clear();
		for(int i = 1; i < 46; i++) {
			numbers.add(i);
		}
	}
	
	// 후보군 가져오기
	public LinkedList<Integer> get(){
		if(numbers.size() < 45) { 
			System.out.println("리셋해야함");
		}
		return numbers;
	}
}
