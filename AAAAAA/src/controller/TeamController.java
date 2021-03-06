package controller;

import javax.swing.JOptionPane;

import serviceImpl.TeamServiceImpl;
import domain.TeamBean;
import service.TeamService;

enum Button {
	EXIT, INSERT, LISTTOTAL, LISTAVG
}

public class TeamController {

	public static void main(String[] args) {
		Button[] Butts = { Button.EXIT, Button.INSERT, Button.LISTTOTAL, Button.LISTAVG };
		TeamService service = new TeamServiceImpl();
		TeamBean team = null;

		while (true) {

			Button select = (Button) JOptionPane.showInputDialog(null, // frame
					"선택", // frame title
					"기능을 선택하세요", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					Butts, // array of choices
					Butts[1]// default
			);
			switch (select) {
			case EXIT:
				return;
			case INSERT:
				team = new TeamBean();

				team.setName(JOptionPane.showInputDialog("이름"));
				team.setGender(JOptionPane.showInputDialog("성별  1.남자  2.여자"));
				team.setHeight(JOptionPane.showInputDialog("키"));
				team.setWeight(JOptionPane.showInputDialog("몸무게"));
				service.create(team);

				break;
			case LISTTOTAL:
				JOptionPane.showMessageDialog(null, service.list());

				break;
			case LISTAVG:
				JOptionPane.showMessageDialog(null, service.showList());

				break;

			default:
				break;

			}

		}

	}

}
