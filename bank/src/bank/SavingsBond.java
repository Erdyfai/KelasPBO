package bank;

public class SavingsBond {
    private static final double[] INTEREST_RATES = {0.005, 0.01, 0.015, 0.02, 0.025};
    private int term; // months
    private double faceValue; 

    public SavingsBond() {
        faceValue = 0.0;
        term = 0;
    }

    public double calculateValueAfterMaturityPeriod() {
        return faceValue * Math.pow(1 + calculateInterestRate(term), term);
    }
    
    public double calculateValueAfterMonths(int months) {
        if (termValidation(months)) {
            throw new IllegalArgumentException("Invalid months. Must be between 1 and 60 months.");
        }
        return faceValue * Math.pow(1 + calculateInterestRate(term), months);
    }
    
    public double calculateProfitEarned() {
    	return calculateValueAfterMaturityPeriod() - faceValue;
    }
    
  
    public double calculateInterestRate(int term) {
        if (termValidation(term)) {
            throw new IllegalArgumentException("Invalid term. Must be between 1 and 60 months.");
        }
        int index = term / 12; // interest increase every year
        return INTEREST_RATES[index];
    }

    public void bondPurchase(double faceValue, int term) {
        if (termValidation(term)) {
            throw new IllegalArgumentException("Invalid term. Must be between 1 and 60 months.");
        }
        this.faceValue = faceValue;
        this.term = term;
    }
    
    // information
    public void displayBondPurchase() {
    	System.out.println("Bond Purchase	: Rp" + faceValue);
    	System.out.println("Term 	        : " + term + " months");
    	System.out.println("Interest Rate	: " + calculateInterestRate(term) * 100 + "%");
    }
    
    public void displayBondProfit() {
    	System.out.println("Result Receive: Rp" + calculateValueAfterMaturityPeriod());
    	System.out.println("Profit Earned : Rp" + calculateProfitEarned());
    }
    
    private boolean termValidation(int months) {
        return months < 1 || months > 60;
    }
    
    // setter getter
    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }
    
    public double getFaceValue() {
        return faceValue;
    }
    
    public void setTerm(int term) {
        if (termValidation(term)) {
            throw new IllegalArgumentException("Invalid term. Must be between 1 and 60 months.");
        }
        this.term = term;
    }

    public int getTerm() {
        return term;
    }
}
