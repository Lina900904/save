package domain;

public class DropshipBean extends AirUnitBean{
	private String space;

	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}

	@Override
	public String toString() {
		return "DropshipBean [space=" + space + ", pilot=" + pilot + ", hp=" + hp + ", hipPoint=" + hipPoint + "]";
	}


}
