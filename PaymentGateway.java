// PaymentGateway.java
package PaymentProcessor;

public class PaymentGateway {
    public static void executeTransaction(Customer sender, Customer receiver, double amount) {
        Transaction transaction = new Transaction(sender, receiver, amount);
        transaction.process();
        transaction.printSummary();
    }
}