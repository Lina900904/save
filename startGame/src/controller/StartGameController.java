package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.*;
import serviceImpl.*;

enum Kind {
 DROPSHIP, MARINE, TANK,SCV	
}
public class StartGameController {

	public static void main(String[] args) {
		StartGameService service = new StartGameServiceImpl();
				
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료,  1.DROPSHIP 2.MARINE, 3.TANK 4.SCV  5.전체보기")) {
		case "0": 
			return;
		case "1": 
			DropshipBean d = new DropshipBean();
			JOptionPane.showMessageDialog(null,"DROPSHIP의 정보를 입력하세요");
			d.setSpace(JOptionPane.showInputDialog("space"));
			d.setHipPoint(JOptionPane.showInputDialog("HipPoint"));
			d.setHp(JOptionPane.showInputDialog("hp"));
			d.setPilot(JOptionPane.showInputDialog("pilot"));
			service.list().add(d);
			break;
		case "2": 
			MarineBean m =new MarineBean();
			JOptionPane.showMessageDialog(null, "MARINE 정보를 입력하세요");
			m.setGun(JOptionPane.showInputDialog("gun"));
			m.setHipPoint(JOptionPane.showInputDialog("HipPoint"));
			m.setHp(JOptionPane.showInputDialog("Hp"));
			m.setName(JOptionPane.showInputDialog("name"));
			service.list().add(m);
		
			break;
		case "3":
			TankBean t = new TankBean();
			JOptionPane.showMessageDialog(null, "TANK 정보를 입력하세요");
			t.setCannon(JOptionPane.showInputDialog("TANK의 개수"));
			t.setHipPoint(JOptionPane.showInputDialog("HipPint"));
			t.setHp(JOptionPane.showInputDialog("hp"));
			t.setName(JOptionPane.showInputDialog("name"));
			service.list().add(t);
			 break;
		case "4": 
			SCVBean s = new SCVBean();
			JOptionPane.showMessageDialog(null, "SCV 정보를 입력하세요");
			s.setMineral(JOptionPane.showInputDialog("Mineral의 개수"));
			s.setHipPoint(JOptionPane.showInputDialog("HipPoint"));
			s.setName(JOptionPane.showInputDialog("name"));
			s.setHp(JOptionPane.showInputDialog("hp"));
			service.list().add(s);
			break;
		case "5": 
			JOptionPane.showMessageDialog(null, service.list());
			
			break;
		}
		}

	}
}
