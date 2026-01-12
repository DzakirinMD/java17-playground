package base;

public class OptimisticVsPessimisticLocking {

    // Simulating a Database Row for Optimistic Locking
    static class Wallet {
        int balance = 100;
        int version = 1; // The "Version" column is the secret to Optimistic locking
    }

    public static void main(String[] args) {
        optimisticLocking();
        pessimisticLocking();
    }

    /**
     * OPTIMISTIC LOCKING: "Assume things will be fine. less conflict"
     * Use case: High-read, low-write environments (e.g., checking profile info).
     */
    public static void optimisticLocking() {
        Wallet dbRow = new Wallet();

        // 1. User A reads the row
        int userAVersion = dbRow.version;
        int userANewBalance = dbRow.balance + 50;

        // 2. User B sneaks in and updates the balance first
        dbRow.balance = 200;
        dbRow.version++;

        // 3. User A tries to save
        System.out.println("--- Optimistic Locking ---");
        if (userAVersion == dbRow.version) {
            dbRow.balance = userANewBalance;
            System.out.println("Update Successful!");
        } else {
            // In a real app, you would catch this and retry the transaction
            System.err.println("Update Failed: Version Mismatch (Conflict Detected).");
        }
    }

    /**
     * PESSIMISTIC LOCKING: "Trust no one. more conflict"
     * Use case: High-value financial transactions (e.g., withdrawing money).
     */
    public static void pessimisticLocking() {
        System.out.println("\n--- Pessimistic Locking ---");
        Object lock = new Object(); // Simulating a DB Row Lock (FOR UPDATE)

        synchronized (lock) {
            // Once inside this block, NO OTHER thread can touch this logic.
            System.out.println("Row Locked. Performing sensitive balance update...");
            // Simulate DB work
            int balance = 100;
            balance -= 20;
            System.out.println("Update Successful. Balance is now: " + balance);
        }
        // Lock is automatically released here
    }
}