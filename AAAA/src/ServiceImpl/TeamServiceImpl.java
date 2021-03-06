package ServiceImpl;

import javax.swing.JOptionPane;

import domain.TeamBean;

import service.TeamService;

public class TeamServiceImpl implements TeamService {
	TeamBean[] list;
	int count;

	public TeamServiceImpl() {
		list = new TeamBean[10];
		count = 0;
	}

	@Override
	public String createBmi(TeamBean team) {
		int hh = Integer.parseInt(team.getHeight());
		int w = Integer.parseInt(team.getWeight());
		double h = (double) hh / 100;
		double bmi = (w / (h * h));
		String msg = "";
		if (bmi >= 18.5 && bmi < 23.0) {
			msg = "정상";
		} else if (bmi >= 23.0 && bmi < 25.0) {
			msg = "비만 전단계";

		} else if (bmi >= 25.0 && bmi < 30.0) {
			msg = "비만";
		} else if (bmi >= 30.0 && bmi < 35.0) {
			msg = "1단계 비만";
		} else if (bmi < 18.5) {
			msg = "저체중";
		} else {
			msg = "3단계 비만";

		}

		return msg;
	}

	@Override
	public String avgHeight() {
		String avgH = "";
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += Integer.parseInt(list[i].getHeight());
			avgH = String.valueOf(sum / count);
		}
		return avgH;
	}

	@Override
	public String avgWeight() {
		String avgW = "";
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += Integer.parseInt(list[i].getWeight());
			avgW = String.valueOf(sum / count);
		}
		return avgW;

	}

	@Override
	public int maxHeight() {
		int max = 0;
		for (int i = 0; i < count; i++) {
			if (Integer.parseInt(list[i].getHeight()) > max) {
				max = Integer.parseInt(list[i].getHeight());
			}
		}
		return max;
	}

	@Override
	public int minHeight() {
		int min = 200;
		for (int i = 0; i < count; i++) {
			if (Integer.parseInt(list[i].getHeight()) < min) {
				min = Integer.parseInt(list[i].getHeight());
			}
		}

		return min;
	}

	@Override
	public void addList(TeamBean team) {
		list[count++] = team;

	}

	@Override
	public TeamBean[] list() {
		return list;
	}



	@Override
	public String maxName() {
		String maxresult = "";
		for (int i = 0; i < count; i++) {
			if (list[i].getHeight().equals(String.valueOf(maxHeight()))) {
				maxresult = list[i].getName();
			}

		}

		return maxresult;
	}

	@Override
	public String minName() {
		String minresult = "";
		for (int i = 0; i < count; i++) {
			if (list[i].getHeight().equals(String.valueOf(minHeight()))) {
				minresult = list[i].getName();
			}

		}
		return minresult;
	}

	@Override
	public String createGender(TeamBean team) {
		String gender = "";

		if (team.getGender().equals("1")) {
			gender = "남자";

		} else {
			gender = "여자";
		}

		return gender;
	}

	@Override
	public void create(TeamBean team) {
		team.setGender(createGender(team));
		team.setBmi(createBmi(team));
		addList(team);
	}

	@Override
	public String showList() {
		return String.format("평균키 %s \n 평균 몸무게 %s \n 최대키 %d (%s)\n 최소키 %d (%s)\n ", 
				avgHeight(), avgWeight(), maxHeight(),maxName(),minHeight(),minName());
	}


}
