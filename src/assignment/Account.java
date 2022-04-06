package assignment;

public class Account {
	private double loanValue;
	private double rate;
	private int daysActive;
	private AccountType accountType;

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return this.loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + this.rate);
		return this.rate;
	}

	public AccountType getAccountType() {
		return this.accountType;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue * this.rate;
	}

	public void setLoanValue(double value) throws Exception {
		checkArgumentIsValid(value, "Loan value cannot be a negative number");

		this.loanValue = value;

	}

	@Override
	public String toString() {
		return "Account [loanValue=" + loanValue + ", rate=" + rate + ", daysActive=" + daysActive + ", accountType="
				+ accountType + "]";
	}

	public double computeInterestRate() {
		return this.loanValue * (1 - Math.pow(this.rate, (this.getMonthlyRate())));
	}


	public Account(double value, double rate, int daysActive, AccountType type)  {
		checkArgumentIsValid(value, "Loan value cannot be 0");
		checkArgumentIsValid(daysActive, "Cannot have a negative number of days");

		this.loanValue = value;
		this.rate = rate;
		this.daysActive = daysActive;
		this.accountType = type;
	}

	private void checkArgumentIsValid(double arg, String message) {
		if (arg < 0) {
			throw new IllegalArgumentException(message);
		}

	}
}
