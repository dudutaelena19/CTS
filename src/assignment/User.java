package assignment;

public class User {
	private int numberOfAccounts;
	private Account[] accounts = new Account[numberOfAccounts];
	public static double broker_fee = 0.0125;

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public User(int numberOfAccounts, Account[] accounts) {
		this.numberOfAccounts = numberOfAccounts;
		this.accounts = accounts;

	}

	public static double getTotalFee(Account[] accounts) {
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountType() == AccountType.PREMIUM
					|| accounts[i].getAccountType() == AccountType.SUPER_PREMIUM)
				totalFee += broker_fee * ( // 1.25% broker's fee
				accounts[i].computeInterestRate()); // interest-principal
		}
		return totalFee;
	}

}
