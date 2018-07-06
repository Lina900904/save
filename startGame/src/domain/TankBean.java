package domain;

public class TankBean extends GroundUnitBean {
	private String cannon;

	public String getCannon() {
		return cannon;
	}

	public void setCannon(String cannon) {
		this.cannon = cannon;
	}

	@Override
	public String toString() {
		return "TankBean [cannon=" + cannon + ", name=" + name + ", hp=" + hp + ", hipPoint=" + hipPoint + "]";
	}



}
