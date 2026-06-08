import java.util.*;

class Device {
    String name;
    int watts;

    Device(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }

    String describe() {
        return "Device " + name + ": " + watts + " W";
    }
}

class LightDevice extends Device {
    int brightness;

    LightDevice(String name, int watts, int brightness) {
        super(name, watts);
        this.brightness = brightness;
    }

    @Override
    String describe() {
        return "Light " + name + ": " + watts + " W, " + brightness + "% brightness";
    }
}

class CameraDevice extends Device {
    int resolution;

    CameraDevice(String name, int watts, int resolution) {
        super(name, watts);
        this.resolution = resolution;
    }

    @Override
    String describe() {
        return "Camera " + name + ": " + watts + " W, " + resolution + "p";
    }
}

public class Level4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Device[] devices = new Device[n];

        for (int i = 0; i < n; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];
            int watts = Integer.parseInt(parts[2]);
            int extra = Integer.parseInt(parts[3]);

            if (type.equals("LIGHT")) {
                devices[i] = new LightDevice(name, watts, extra);
            } else {
                devices[i] = new CameraDevice(name, watts, extra);
            }
        }
        in.close();

        for (int i = 0; i < n; i++) {
            System.out.println(devices[i].describe());
        }
    }
}
