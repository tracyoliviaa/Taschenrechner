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

            if (option == 1) {
                System.out.println("Addition gewählt");
                System.out.print("Gib die Zahlen (getrennt durch Leerzeichen) ein: ");
                double zahl1 = scanner.nextDouble();
                double zahl2 = scanner.nextDouble();
                double ergebnis = zahl1 + zahl2;
                System.out.println("Ergebnis: " + ergebnis);
            } else {
                System.out.print("Gib die erste Zahl ein: ");
                double zahl1 = scanner.nextDouble();

                System.out.print("Gib die zweite Zahl ein: ");
                double zahl2 = scanner.nextDouble();

                double ergebnis = 0;



                switch (option) {
                    case 2:
                        ergebnis = zahl1 - zahl2;
                        break;
                    case 3:
                        ergebnis = zahl1 * zahl2;
                        break;
                    case 4:
                        if (zahl2 != 0) {
                            ergebnis = zahl1 / zahl2;
                        } else {
                            System.out.println("Division durch Null ist nicht erlaubt.");
                            continue;
                        }
                        break;
                }

                System.out.println("Ergebnis: " + ergebnis);
            }
        }

        scanner.close();
    }
}
