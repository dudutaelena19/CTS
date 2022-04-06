package assignment;

public class Main {

	public static void main(String[] args) throws Exception {

		int numberOfAccounts = 2;
		Account account = new Account(10000, 0.35, 120, AccountType.PREMIUM);
		Account account1 = new Account(200, 0.2, 156, AccountType.BUDGET);

		Account[] accounts = new Account[] { account, account1 };

		User user = new User(numberOfAccounts, accounts);

		double total_fee = user.getTotalFee(accounts);
		System.out.println(total_fee);

	}

}
