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

            if (option < 1 || option > 4) {
                System.out.println("Ungültige Option. Bitte wähle eine Option von 1-5.");
                continue;
            }

            double ergebnis = 0;

            if (option == 1) {
                System.out.println("Addition gewählt");
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();
                ergebnis = zahl1 + zahl2;
            } else if (option == 2) {
                System.out.println("Subtraktion gewählt");
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();
                ergebnis = zahl1 - zahl2;
            } else if (option == 3) {
                System.out.println("Multiplikation gewählt");
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();
                ergebnis = zahl1 * zahl2;
            } else if (option == 4) {
                System.out.println("Division gewählt");
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    continue;
                }
            }

            System.out.println("Ergebnis: " + ergebnis);
        }

        scanner.close();
    }
}
