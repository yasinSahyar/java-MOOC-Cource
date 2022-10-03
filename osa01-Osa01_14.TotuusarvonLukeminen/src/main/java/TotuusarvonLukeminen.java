
import java.util.Scanner;

public class TotuusarvonLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä jotain!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        System.out.println("Totta vaiko ei? " + arvo);

    }
}
