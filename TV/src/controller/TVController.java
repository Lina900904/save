package controller;

import javax.swing.JOptionPane;


import domain.*;
import service.*;
import serviceImpl.TVServiceImpl;
import controller.*;

enum Kind {
	POWEROFF,POWERON,CHANNELUP,CHANNELDOWN,LIST
	}

public class TVController {

	public static void main(String[] args) {
		TVService service = new TVServiceImpl();

		
		while (true) {
			switch (JOptionPane.showInputDialog("0.POWEROFF, 1.POWERON 2.CHANNEL UP 3.CHANNEL DOWN 4.명령하기 5.TV정보 보여주기")) {
			case "0":
				JOptionPane.showMessageDialog(null, "티비를 종료합니다");

				return;
			case "1":
				service.powerOn();
				JOptionPane.showMessageDialog(null, "전원켜짐");
				break;
			case "2":
				
				
				JOptionPane.showMessageDialog(null, service.channelUp());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.channelDown());
				break;
			case "4":
				service.order(JOptionPane.showInputDialog("1. 유투브  2.페이스북 3.넷플릭스"));
				
			
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.show());
				
				break;//4번에 명령하고 나서 현재는 채널 7에 유투브야 하고 보여주기
			}
		}

	}

}
