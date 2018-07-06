package service;

import domain.CardBean;

public interface CardService {
	public CardBean showCard();
	public String kindRandom();
	public int numRandom();
	public String game(CardBean[] card);
	
	
	
	
}
