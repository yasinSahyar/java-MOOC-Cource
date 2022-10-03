
import java.util.Scanner;

public class Jatketaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Jatketaanko?");
        String input = lukija.nextLine();
        while (!input.equalsIgnoreCase("ei")){
            System.out.println("Jatketaanko?");
            input = lukija.nextLine();
        }

    }
}
