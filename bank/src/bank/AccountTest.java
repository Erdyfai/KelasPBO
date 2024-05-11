package bank;

public class AccountTest {
    public static void main(String[] args) {
    	SavingsBond bond = new SavingsBond();
    	CheckingAccount account = new CheckingAccount();
    	
    	account.setName("Erdy Muhammad Fakhri_071");
    	account.deposit(500000.00);
    	bond.bondPurchase(account.transfer(100000), 12);
    	
    	System.out.println("====Account Information before its term measure====");
    	account.displayAccount();
    	System.out.println();
    	bond.displayBondPurchase();
    	
    	account.deposit(bond.calculateValueAfterMaturityPeriod());
    	
    	System.out.println();
    	System.out.println("====Account Information after its term measure====");
    	account.displayAccount();
    	System.out.println();
    	bond.displayBondProfit();
    	
    }
}

