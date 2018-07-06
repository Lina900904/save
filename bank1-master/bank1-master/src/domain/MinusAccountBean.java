package domain;

public class MinusAccountBean extends AccountBean {
	public final static String ACCOUNT_TYPE="마이너스통장";
	protected String limit;
	@Override
	public void setAccountType(String accountType) {
		super.setAccountType("마이너스통장");
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getLimit() {
		return limit;
	}
	
}
