public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Flashlight flashlight = new Flashlight();

        System.out.println("Flashlight is initially off: " + !flashlight.isLight());

        flashlight.on();
        System.out.println("Flashlight is on: " + flashlight.isLight());

        flashlight.off();
        System.out.println("Flashlight is off: " + !flashlight.isLight());

        flashlight.on();
        flashlight.on();
        flashlight.on();
        flashlight.on();
        flashlight.on();
        System.out.println("Flashlight is on: " + flashlight.isLight());
    }

    }

