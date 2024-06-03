import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Mezclar el deck");
            System.out.println("2. Mostrar la primera carta del deck");
            System.out.println("3. Seleccionar una carta al azar del deck");
            System.out.println("4. Obtener una mano de cinco cartas del deck");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        }

        scanner.close();
    }
}

