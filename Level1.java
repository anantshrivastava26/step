import java.util.*;

class SmartDevice {
    String id;
    String name;
    int watts;

    SmartDevice(String id, String name, int watts) {
        this.id = id;
        this.name = name;
        this.watts = watts;
    }

    String describe() {
        return "Device " + id + " (" + name + ")";
    }

    String category() {
        if (watts >= 1000) return "High";
        return "Standard";
    }
}

public class Level1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id = in.next();
        String name = in.next();
        int watts = in.nextInt();
        in.close();

        SmartDevice device = new SmartDevice(id, name, watts);
        System.out.println(device.describe());
        System.out.println("Power: " + device.watts + " W");
        System.out.println("Category: " + device.category());
    }
}
