package Day07.Ex08_UserException;

public class Account {

	  private long balance;  // 예금잔액
	  
	  public Account() {
		  
		  
		  
		  
	  }
	public long getBanlance()  {
		return balance;
		
		
	}
	
	public void deposit(int money) {
		
		balance += money;
		
	}
	
	public void withdraw(int money) throws BalanceException {
		
		if(balance < money) {
			//예외 강제 발생
			throw new BalanceException("잔고가 부족합니다.\n"+(money-balance)+"원이 부족합니다.");
			
		}
		balance -= money;
		
	}
}


