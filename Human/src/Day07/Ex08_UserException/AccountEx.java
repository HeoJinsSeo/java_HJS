package Day07.Ex08_UserException;

public class AccountEx {
	
	public static void main(String[] args) {
		
		Account accout = new Account();
		// 10000입금
		accout.deposit(10000);
		// 20000출금
		try {
			accout.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		
	}
	

}
