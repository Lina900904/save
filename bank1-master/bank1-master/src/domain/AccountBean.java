package domain;

public class AccountBean {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;// 잔액, 계좌 랜덤
	protected String accountSeq,  accountNo,  accountType, createDate;// uid는 아이디 , createDate는 계좌생성일 블로그에서 오늘날짜 뽑는
																			// 로직 가져다쓰세요.
	// 통장 123-345-678 의 형태가 되도록 코딩 math.random()이용해서
	public void setMoney(int money) {
		this.money = money;
	}

	public String getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(String accountSeq) {
		this.accountSeq = accountSeq;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getMoney() {
		return money;
	}

	

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getCreateDate() {
		return createDate;
	}

	
}
