import java.util.*;

class EnergyDevice {
    String name;
    int watts;
    EnergyDevice(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }
    int energy(int hours) {
        return watts * hours;
    }
    String label() {
        return "Device";
    }
}
class EnergyLight extends EnergyDevice {
    EnergyLight(String name, int watts) {
        super(name, watts);
    }
    @Override
    int energy(int hours) {
        return watts * hours;
    }
    @Override
    String label() {
        return "Light";
    }
}
class EnergyCamera extends EnergyDevice {
    EnergyCamera(String name, int watts) {
        super(name, watts);
    }
    @Override
    int energy(int hours) {
        return watts * 24;
    }
    @Override
    String label() {
        return "Camera";
    }
}

class Heater extends EnergyDevice {
    Heater(String name, int watts) {
        super(name, watts);
    }
    @Override
    int energy(int hours) {
        return watts * hours + 100;
    }
    @Override
    String label() {
        return "Heater";
    }
}

public class Level5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        EnergyDevice[] devices = new EnergyDevice[n];

        for (int i = 0; i < n; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];
            int watts = Integer.parseInt(parts[2]);

            if (type.equals("LIGHT")) {
                devices[i] = new EnergyLight(name, watts);
            } else if (type.equals("CAMERA")) {
                devices[i] = new EnergyCamera(name, watts);
            } else {
                devices[i] = new Heater(name, watts);
            }
        }
        in.close();

        for (int i = 0; i < n; i++) {
            System.out.println(devices[i].name + " (" + devices[i].label() + ") Energy: " + devices[i].energy(hours) + " Wh");
        }
    }
}
