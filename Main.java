// Main.java
package PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice", 500);
        Customer bob = new Customer("Bob", 300);

        System.out.println("--- Attempting Transaction 1 ---");
        PaymentGateway.executeTransaction(alice, bob, 200);

        System.out.println("\n--- Attempting Transaction 2 ---");
        PaymentGateway.executeTransaction(alice, bob, 400);

        System.out.println("\nFinal Balances:");
        System.out.println("Alice: R" + alice.getBalance());
        System.out.println("Bob: R" + bob.getBalance());
    }
}