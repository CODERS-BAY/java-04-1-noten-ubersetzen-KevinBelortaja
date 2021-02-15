import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Note eingeben:");
        int number = scan.nextInt();

        switch (number) {

            case 1:
                System.out.println("Sehr gut");
                break;

            case 2:
                System.out.println("Gut");
                break;

            case 3:
                System.out.println("Befriedigend");
                break;

            case 4:
                System.out.println("Genügned");
                break;

            case 5:
                System.out.println("Nicht Genügend");
        }
    }
}