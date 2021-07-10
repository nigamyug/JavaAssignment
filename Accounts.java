package Assignment;

class AccountDetails{
	
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	
    static String bankName;
	
	public AccountDetails() {
		
	}

	public AccountDetails(int accountNo, double accountBalance, String accountPassword) {
	//	super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	static void setBankName(String bn) {
		bankName = bn;
	}
	
	void displayBankName() {System.out.println(" Bank Name : " + bankName );}
	
	void displayAccount() {
		System.out.println(" Bank Name : " + bankName );
		System.out.println(" Bank Account Number : " + accountNo );
		System.out.println(" Bank Account Balance : " + accountBalance);
		System.out.println(" Bank Account Password : " + accountPassword);
		System.out.println("\n"+"=============================================");
			}
	
}

public class Accounts {

	public static void main(String args[]) {
		
		AccountDetails.setBankName("ICICI Bank Ltd");
		AccountDetails a = new AccountDetails(12345 , 6055874, "Qwerty@1" );
		a.displayAccount();
		AccountDetails b = new AccountDetails(98765 , 4455661, "Asdfgh@2" );
		b.displayAccount();
		AccountDetails c = new AccountDetails(12345 , 6055874, "Zxcvbn@3" );
		c.displayAccount();
		/*AccountDetails b=new AccountDetails();
		b.setAccountBalance(55887744);
		b.setAccountNo(98765);
		b.setAccountPassword("Zxcvbn");
		
		System.out.println(" Bank Name : " + AccountDetails.displayBankName() );	
		System.out.println(" Bank Account No : " + b.getAccountNo());
		System.out.println(" Bank Account : " + b.getAccountNo());*/
		
		}
}







