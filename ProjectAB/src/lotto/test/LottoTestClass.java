package lotto.test;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import lotto.domain.Round;
import lotto.network.NetworkEx;

public class LottoTestClass {

	public static void main(String[] args) {
		NetworkEx networkEx = new NetworkEx();
		String data = networkEx.requestGet("789");

		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(data);
			Round round = new Round(jsonObj);

			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
	}
}
