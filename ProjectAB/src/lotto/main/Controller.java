package lotto.main;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import lotto.function.Lottery;

public class Controller {
	
	@FXML
	private Text lotto01, lotto02, lotto03, lotto04, lotto05, lotto06;

	@FXML
	private Button lotteryBtn;
	
	@FXML 
	private void lottery(ActionEvent event) {
		Lottery lottery = new Lottery();
		ArrayList<Integer> lotto = lottery.shuffle();
				
		ArrayList<Text> lottoText = new ArrayList<>(
				Arrays.asList(lotto01, lotto02, lotto03, lotto04, lotto05, lotto06));

		
		for(int i = 0; i< lottoText.size(); i++) {
			lottoText.get(i).setText(String.valueOf(lotto.get(i)));
		}
	}
	
}
