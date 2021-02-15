import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Note eingeben:");
        int number = scan.nextInt();


        String result = switch (number) {
            case 1:
                yield "Sehr gut";
            case 2:
                yield "Gut";
            case 3:
                yield "Befriedigned";
            case 4:
                yield "Genügend";
            case 5:
                yield "Nicht Genügend";
            default:
                yield "No grade";

        };

        System.out.println(result);
    }
}