
// Lab 5 - Phone Plans: an abstract contract, two concrete pricing rules
import java.util.*;

public class app4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        List<Plan> plans = new ArrayList<>();
        for (int i = 0; i < n; i++){
        String[] p = in.nextLine().trim().split("\\s+");
        if (p[0].equals("BASIC")) plans.add(new BasicPlan(p[1], Long.parseLong(p[2])));
        else plans.add(new PremiumPlan(p[1], Long.parseLong(p[2])));
        }
        Plan cheapest = null; long cheapestCost = 0;
        StringBuilder sb = new StringBuilder();
        for (Plan p : plans){
        long c = p.monthlyCost();
        sb.append(p.owner()).append(" (").append(p.kind()).append("):").append(c).append("\n");
        if (cheapest == null || c < cheapestCost){ cheapestCost = c; cheapest = p; }
        }
        sb.append("Cheapest: ").append(cheapest.owner()).append("\n");
        System.out.print(sb);
        in.close();
    }
}

abstract class Plan {
    private String planOwner; // encapsulated
    protected long gb;

    Plan(String owner, long gb) {
        this.planOwner = owner;
        this.gb = gb;
    }

    String owner() {
        return planOwner;
    }

    abstract long monthlyCost();

    abstract String kind();
}

class BasicPlan extends Plan {
    BasicPlan(String o, long g) {
        super(o, g);
    }

    // This method contains a BUG. Find it and fix it.
    // A basic plan costs 100 plus 10 per GB.
    long monthlyCost() {
        return 100 + 10 * gb;
    }

    String kind() {
        return "Basic";
    }
}

class PremiumPlan extends Plan {
    PremiumPlan(String o, long g) {
        super(o, g);
    }
    // A premium plan costs 250 plus 5 per GB.
    long monthlyCost() {
        return 250 + 5 * gb;
    }

    String kind() {
        return "Premium";
    }
}