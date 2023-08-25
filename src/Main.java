import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Taschenrechner Menü:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Beenden");
            System.out.print("Wähle eine Option: ");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Taschenrechner wird beendet.");
                break;
            }

            if (option >= 1 && option <= 4) {
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();

                double ergebnis = 0;

                if (option == 1) {
                    System.out.println("Addition gewählt");

                    ergebnis = zahl1 + zahl2;
                } else if (option == 2) {
                    System.out.println("Subtraktion gewählt");


                    ergebnis = zahl1 - zahl2;
                } else if (option == 3) {
                    System.out.println("Multiplikation gewählt");


                    ergebnis = zahl1 * zahl2;
                } else if (option == 4) {
                    System.out.println("Division gewählt");


                    if (zahl2 != 0) {
                        ergebnis = zahl1 / zahl2;
                    } else {
                        System.out.println("Division durch Null ist nicht erlaubt.");
                        continue;
                    }
                }

                System.out.println("Ergebnis: " + ergebnis);
            }}

            scanner.close();
        }
    }
