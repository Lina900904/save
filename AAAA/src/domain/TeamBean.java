package domain;

public class TeamBean {
	protected String name, gender, height, weight,bmi;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBmi() {
		return bmi;
	}



	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "[이름=" + name + ", 성별=" + gender + ", 키=" + height + ", 몸무게=" + weight + ", bmi="
				+ bmi + "]";
	}

}
