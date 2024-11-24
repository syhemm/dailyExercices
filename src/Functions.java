import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        double rayon;
        double cercleAire;
        double carreAire;
        double cote;

        while (choice != 3)
        {
            menu();
            System.out.println("Make a choice.");
            choice = keyboard.nextInt();
            if (choice == 1)
            {
                System.out.println("Entrez le rayon: ");
                rayon = keyboard.nextDouble();
                cercleAire = cercleArea(rayon);
                System.out.println(cercleAire);
            }
            else if (choice == 2)
            {
                System.out.println("Entrez la mesure du cote: ");
                cote = keyboard.nextDouble();
                carreAire = squareArea(cote);
                System.out.println(carreAire);
            }
            else if (choice != 3)
            {
                System.out.println("Bad choice.");
            }
        }
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Quit");
    }

    public static double cercleArea(double ray) {
        double surface;
        surface = Math.PI * ray * 2;
        return surface;
    }

    public static double squareArea(double cote) {
        double surface;
        surface = Math.pow(cote, 2);
        return surface;
    }
}
