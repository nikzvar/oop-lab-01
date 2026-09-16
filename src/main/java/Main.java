import model.Hero;
import model.Point;
import strategy.Fly;
import strategy.HorseRide;
import strategy.Walk;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hero name: ");
        String name = scanner.nextLine();

        Hero hero = new Hero(name, new Point(0, 0), new Walk());

        while (true) {
            System.out.println("Choose a way to move: 1 - walk, 2 - horse ride, 3 - fly, 0 - exit");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number");
                scanner.next();
            }
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                hero.setStrategy(new Walk());
            } else if (choice == 2) {
                hero.setStrategy(new HorseRide());
            } else if (choice == 3) {
                hero.setStrategy(new Fly());
            } else {
                System.out.println("Wrong choice");
                continue;
            }

            System.out.print("Enter x: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a number. Enter x: ");
                scanner.next();
            }
            double x = scanner.nextDouble();

            System.out.print("Enter y: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a number. Enter y: ");
                scanner.next();
            }
            double y = scanner.nextDouble();

            hero.move(new Point(x, y));
        }
    }
}
