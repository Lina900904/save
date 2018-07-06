package serviceImpl;

import domain.CardBean;
import service.CardService;

public class CardServiceImpl implements CardService {
	
	@Override
	public CardBean showCard() {
		CardBean card = new CardBean();
	
		card.setKind(kindRandom());
		card.setNumber(numRandom());
		return card;
	}

	@Override
	public String kindRandom() {
		String kind = "";
		String[] arr =new String[4];
		arr[0]="HEART";
		arr[1]="SPADE";		
		arr[2]="CLOVER";
		arr[3]="DIAMOND";
		int i=(int)(Math.random()*4);
		 kind = arr[i];
		
		return kind;
	}

	@Override
	public int numRandom() {
		int num = (int)(Math.random()*13);
		return num;
	}

	@Override
	public String game(CardBean[] show) {
		String result = "";
				if(show[0].getNumber() > show[1].getNumber()) {
					result = "컴퓨터 승리";
				}else if(show[0].getNumber() < show[1].getNumber()) {
					result = "나의 승리";
				}else {
					result = "무승부";
				}
		return result;
	}

}
