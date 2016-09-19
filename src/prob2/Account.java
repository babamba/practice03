package prob2;

public class Account {

	private String accountNo;
	private int balance;
	
	
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}

	void save(int i){
		balance = balance + i;
		System.out.println(accountNo + "계좌에 " + balance + "만원이 입금되었습니다. ");
	}
	
	void deposit(int i){ 
		balance = balance - i;
		System.out.println(accountNo + "계좌에 " + balance + "만원이 출금되었습니다. ");
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accontNo) {
		this.accountNo = accontNo;
	}

	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
