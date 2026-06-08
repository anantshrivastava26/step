
// Lab 3 - Bank Account Guard: encapsulation with validating methods
import java.util.*;

public class app5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = Long.parseLong(in.nextLine().trim());
        int n = Integer.parseInt(in.nextLine().trim());
        Account acc = new Account(start);
        for (int i = 0; i < n; i++) {
            String[] p = in.nextLine().trim().split("\\s+");
            long v = Long.parseLong(p[1]);
            if (p[0].equals("DEPOSIT"))
                acc.deposit(v);
            else if (p[0].equals("WITHDRAW"))
                acc.withdraw(v);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Balance: ").append(acc.getBalance()).append("\n");
        sb.append("Rejected: ").append(acc.getRejected()).append("\n");
        System.out.print(sb);
        in.close();
    }
}

class Account {
    private long balance;
    private int rejected = 0;

    Account(long b) {
        balance = b;
    }

    // This method contains a BUG. Find it and fix it.
    // It should accept only positive amounts and reject the rest.
    void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // TODO: Implement this method from scratch.
    // Withdraw only when 0 < amount <= balance; otherwise count a rejection.
    void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            rejected++;
        }
    }

    long getBalance() {
        return balance;
    }

    int getRejected() {
        return rejected;
    }
}