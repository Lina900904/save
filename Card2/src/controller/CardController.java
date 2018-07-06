package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import domain.CardBean;
import service.CardService;
import serviceImpl.CardServiceImpl;

enum Kind {
	HEART, SPADE, CLOVER, DIAMOND
}

public class CardController {

	public static void main(String[] args) {

		Kind[] buttons = { Kind.HEART, Kind.SPADE, Kind.CLOVER, Kind.DIAMOND };
		CardService service =new CardServiceImpl();
		CardBean[] show = null;
		while (true) {

			switch (JOptionPane.showInputDialog("0.종료, 1.컴퓨터카드 2.내카드.3.결과보기")) {
			case "0": // 컴 카드 결정
				return;
			case "1": // 내카드 결정
				show = new CardBean[2];
				show[0] = service.showCard();
				System.out.println(service.showCard());

				break;
			case "2": // 결과보기
				show[1] = service.showCard();
				System.out.println(service.showCard());

				break;
			case "3": // 결과보기
				System.out.println(service.game(show));

				break;

			}

		}

	}

}
