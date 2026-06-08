import java.util.*;

class Thermostat {
    private int temp;
    private int rejected;

    Thermostat(int startTemp) {
        this.temp = startTemp;
        this.rejected = 0;
    }

    private void apply(int newTemp) {
        if (newTemp >= 16 && newTemp <= 30) {
            temp = newTemp;
        } else {
            rejected++;
        }
    }

    void set(int t) {
        apply(t);
    }

    void up(int d) {
        apply(temp + d);
    }

    void down(int d) {
        apply(temp - d);
    }

    int getTemp() {
        return temp;
    }

    int getRejected() {
        return rejected;
    }
}

public class Level2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startTemp = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        Thermostat t = new Thermostat(startTemp);

        for (int i = 0; i < n; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            String op = parts[0];
            int val = Integer.parseInt(parts[1]);

            if (op.equals("SET")) t.set(val);
            else if (op.equals("UP")) t.up(val);
            else if (op.equals("DOWN")) t.down(val);
        }
        in.close();

        System.out.println("Final Temperature: " + t.getTemp());
        System.out.println("Rejected Operations: " + t.getRejected());
    }
}
