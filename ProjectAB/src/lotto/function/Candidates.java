package lotto.function;
import java.util.LinkedList;

public class Candidates {
	
	private static LinkedList<Integer> numbers = new LinkedList<>();
	
	// �ĺ��� ���� �� �ڵ� ���� ����
	public Candidates() {
		reset();
	}

	// �ĺ��� ����
	public void reset () {
		numbers.clear();
		for(int i = 1; i < 46; i++) {
			numbers.add(i);
		}
	}
	
	// �ĺ��� ��������
	public LinkedList<Integer> get(){
		if(numbers.size() < 45) { 
			System.out.println("�����ؾ���");
		}
		return numbers;
	}
}
