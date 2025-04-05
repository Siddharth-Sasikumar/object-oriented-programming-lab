class Account {
    String holderName;
    double currentAmount;

    Account(String holderName, double currentAmount) {
        this.holderName = holderName;
        this.currentAmount = currentAmount;
    }

    void displayAmount() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Amount: $" + currentAmount);
    }
}

class FixedDepositAccount extends Account {
    double rateOfInterest = 5.0;

    FixedDepositAccount(String holderName, double currentAmount) {
        super(holderName, currentAmount);
    }

    void computeInterest() {
        double interest = (currentAmount * rateOfInterest) / 100;
        System.out.println("Interest Earned: $" + interest);
    }
}

public class singleinheritance2 {
    public static void main(String[] args) {
        FixedDepositAccount acc = new FixedDepositAccount("Dada Hussain", 10000);
        acc.displayAmount();
        acc.computeInterest();
    }
}
