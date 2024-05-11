package bank;

public class CheckingAccount {
	private double balance;
	private String name;
	
	public CheckingAccount() {
		balance = 0.0;
		name = "";
	}

	public void withdrawal(double withdraw) {
		if(balanceAdequancy(withdraw)) {
			System.out.println("Saldo anda tidak cukupxz");
			System.out.println("Saldo anda: " + this.getBalance());
		}else if(withdraw <= 0) {
			System.out.println("Mohon masukan dengan benar");
			System.out.println("Saldo anda: " + this.getBalance());
		}else {
			this.setBalance(this.getBalance() - withdraw);
			System.out.println("Penarikan berhasil");
			System.out.println("Saldo anda: " + this.getBalance());
		}
	}
	
	public void deposit(double deposit) {
		this.setBalance(this.getBalance() + deposit);
	}
	
	public double transfer(double transfer) {
		this.setBalance(this.getBalance() - transfer);
		return transfer;
	}
	
	public void displayAccount() {
		System.out.println("Name	:" + getName());
		System.out.println("Balance	:Rp" + getBalance());
	}
	
	private boolean balanceAdequancy(double minus) {
		return balance < minus;
	}
	public void setBalance(double balance) {
		 this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
}
