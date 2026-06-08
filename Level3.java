import java.util.*;

class Light {
    String name;
    int brightness;

    // Default constructor — routes through full constructor with 70
    Light(String name) {
        this(name, 70);
    }

    // Full constructor
    Light(String name, int brightness) {
        this.name = name;
        this.brightness = brightness;
    }
}

public class Level3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Light[] lights = new Light[n];
        int defaultCount = 0;

        for (int i = 0; i < n; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            String type = parts[0];
            String name = parts[1];

            if (type.equals("DEFAULT")) {
                lights[i] = new Light(name);
                defaultCount++;
            } else {
                int brightness = Integer.parseInt(parts[2]);
                lights[i] = new Light(name, brightness);
            }
        }
        in.close();

        for (int i = 0; i < n; i++) {
            System.out.println(lights[i].name + ": " + lights[i].brightness);
        }
        System.out.println("Default Constructors Used: " + defaultCount);
    }
}
