// Transaction.java
package PaymentProcessor;

public class Transaction {
    private Customer sender;
    private Customer receiver;
    private double amount;
    private boolean success;

    public Transaction(Customer sender, Customer receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public void process() {
        if (sender.deduct(amount)) {
            receiver.credit(amount);
            success = true;
        } else {
            success = false;
        }
    }

    public void printSummary() {
        System.out.println("Transaction Summary:");
        System.out.println("From: " + sender.getName());
        System.out.println("To: " + receiver.getName());
        System.out.println("Amount: R" + amount);
        System.out.println("Status: " + (success ? "Success" : "Failed - Insufficient Funds"));
    }
}