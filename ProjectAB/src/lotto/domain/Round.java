package lotto.domain;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Round {

	int no;
	int lotto01;
	int lotto02;
	int lotto03;
	int lotto04;
	int lotto05;
	int lotto06;
	int lottoBonus;
	
	public Round(JSONObject obj) {
		super();
		this.no = Integer.parseInt(obj.get("drwNo").toString());
		this.lotto01 = Integer.parseInt(obj.get("drwtNo1").toString());
		this.lotto02 = Integer.parseInt(obj.get("drwtNo2").toString());
		this.lotto03 = Integer.parseInt(obj.get("drwtNo3").toString());
		this.lotto04 = Integer.parseInt(obj.get("drwtNo4").toString());
		this.lotto05 = Integer.parseInt(obj.get("drwtNo5").toString());
		this.lotto06 = Integer.parseInt(obj.get("drwtNo6").toString());
		this.lottoBonus = Integer.parseInt(obj.get("bnusNo").toString());
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getLotto01() {
		return lotto01;
	}

	public void setLotto01(int lotto01) {
		this.lotto01 = lotto01;
	}

	public int getLotto02() {
		return lotto02;
	}

	public void setLotto02(int lotto02) {
		this.lotto02 = lotto02;
	}

	public int getLotto03() {
		return lotto03;
	}

	public void setLotto03(int lotto03) {
		this.lotto03 = lotto03;
	}

	public int getLotto04() {
		return lotto04;
	}

	public void setLotto04(int lotto04) {
		this.lotto04 = lotto04;
	}

	public int getLotto05() {
		return lotto05;
	}

	public void setLotto05(int lotto05) {
		this.lotto05 = lotto05;
	}

	public int getLotto06() {
		return lotto06;
	}

	public void setLotto06(int lotto06) {
		this.lotto06 = lotto06;
	}

	public int getLottoBonus() {
		return lottoBonus;
	}

	public void setLottoBonus(int lottoBonus) {
		this.lottoBonus = lottoBonus;
	}

	@Override
	public String toString() {
		return "Round [no=" + no + ", lotto01=" + lotto01 + ", lotto02=" + lotto02 + ", lotto03=" + lotto03
				+ ", lotto04=" + lotto04 + ", lotto05=" + lotto05 + ", lotto06=" + lotto06 + ", lottoBonus="
				+ lottoBonus + "]";
	}
	
	
	
	
	
}
