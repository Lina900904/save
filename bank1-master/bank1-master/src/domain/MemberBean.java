package domain;

public class MemberBean {
	protected String accountSeq,ssn,addr,phone,email, proflie;

	public String getEmail() {
		return email;
	}

	public String getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(String accountSeq) {
		this.accountSeq = accountSeq;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProflie() {
		return proflie;
	}

	public void setProflie(String proflie) {
		this.proflie = proflie;
	}



	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	
	
}
