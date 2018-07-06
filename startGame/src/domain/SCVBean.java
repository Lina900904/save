package domain;

public class SCVBean extends GroundUnitBean {
	private String mineral;

	public String getMineral() {
		return mineral;
	}



	public void setMineral(String mineral) {
		this.mineral = mineral;
	}



	@Override
	public String toString() {
		return "SCVBean [mineral=" + mineral + ", name=" + name + ", hp=" + hp + ", hipPoint=" + hipPoint + "]";
	}

}
