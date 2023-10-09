import service.OperatingMenu;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {

        Scanner scanner = new Scanner(System.in);
        OperatingMenu[] menuValues = OperatingMenu.values();

        while (true) {

            for (OperatingMenu mode : menuValues) {
                System.out.printf("%d.%s\n", mode.ordinal(), mode.getName());
            }
            System.out.printf("%d.Exit\n", menuValues.length);
            System.out.print("Choose your destiny:");

            byte mode = scanner.nextByte();

            if (mode > menuValues.length - 1) {
                break;
            }

            menuValues[mode].getAClass().getDeclaredConstructor().newInstance().run(scanner);

            System.out.println("Task complete. Back to main menu.");
            System.out.println("--------------");

        }

        scanner.close();
    }

}