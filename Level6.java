import java.util.*;

abstract class HomeDevice {
    private String name;
    private int watts;

    HomeDevice(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }

    String getName() {
        return name;
    }

    int getWatts() {
        return watts;
    }

    abstract int monthlyUnits();
    abstract String category();
}

class ReportLight extends HomeDevice {
    ReportLight(String name, int watts) {
        super(name, watts);
    }

    @Override
    int monthlyUnits() {
        return getWatts() * 150;
    }

    @Override
    String category() {
        return "Comfort";
    }
}

class ReportCamera extends HomeDevice {
    ReportCamera(String name, int watts) {
        super(name, watts);
    }

    @Override
    int monthlyUnits() {
        return getWatts() * 720;
    }

    @Override
    String category() {
        return "Security";
    }
}

class Speaker extends HomeDevice {
    Speaker(String name, int watts) {
        super(name, watts);
    }

    @Override
    int monthlyUnits() {
        return getWatts() * 60;
    }

    @Override
    String category() {
        return "Comfort";
    }
}

public class Level6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        HomeDevice[] devices = new HomeDevice[n];

        for (int i = 0; i < n; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];
            int watts = Integer.parseInt(parts[2]);

            if (type.equals("LIGHT")) {
                devices[i] = new ReportLight(name, watts);
            } else if (type.equals("CAMERA")) {
                devices[i] = new ReportCamera(name, watts);
            } else {
                devices[i] = new Speaker(name, watts);
            }
        }
        in.close();

        int total = 0;
        int mostExpensiveUnits = -1;
        String mostExpensiveName = "";
        int comfort = 0;
        int security = 0;

        for (int i = 0; i < n; i++) {
            int units = devices[i].monthlyUnits();
            total += units;

            if (units > mostExpensiveUnits) {
                mostExpensiveUnits = units;
                mostExpensiveName = devices[i].getName();
            }

            if (devices[i].category().equals("Comfort")) {
                comfort++;
            } else {
                security++;
            }
        }

        double avg = (double) total / n;

        System.out.println("Total Monthly Units: " + total);
        System.out.println("Most Expensive: " + mostExpensiveName + " (" + mostExpensiveUnits + ")");
        System.out.println("Comfort Devices: " + comfort);
        System.out.println("Security Devices: " + security);
        System.out.printf("Average Units: %.2f%n", avg);
    }
}
