package assignment;

public class Account {
	private double	loanValue;
	private double rate;
	private int	daysActive;
	private AccountType accountType;
	
	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return this.loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is "+this.rate);
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setLoanValue(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			this.loanValue = value;
		}
	}
	

	@Override
	public String toString() {
		return "Account [loanValue=" + loanValue + ", rate=" + rate + ", daysActive=" + daysActive + ", accountType="
				+ accountType + "]";
	}

	public static double computeTotalFee(Account[] 	accounts)
	{
	double totalFee=0.0;
	Account	account;
	int temp = 365;
	for	(int	i=0;i<accounts.length;i++)	{
	account=accounts[i];
	if(account.accountType==AccountType.PREMIUM||account.accountType==AccountType.SUPER_PREMIUM)	
	totalFee+=.0125	*	(	//	1.25%	broker's	fee
			account.loanValue*Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);	//	interest-principal
	}
	return	totalFee;
	}

	public Account(double value, double rate, int daysActive, AccountType type) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.daysActive=daysActive;
		this.accountType = type;
	}
	
	
}
