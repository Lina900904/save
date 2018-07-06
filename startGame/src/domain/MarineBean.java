package domain;

public class MarineBean extends GroundUnitBean{
	 private String gun;

	public String getGun() {
		return gun;
	}
	public void setGun(String gun) {
		this.gun = gun;
	}
	@Override
	public String toString() {
		return "MarineBean [gun=" + gun + ", name=" + name + ", hp=" + hp + ", hipPoint=" + hipPoint + "]";
	}
	
}
