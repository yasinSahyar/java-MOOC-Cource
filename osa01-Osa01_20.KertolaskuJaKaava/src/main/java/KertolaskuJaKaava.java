
import java.util.Scanner;

public class KertolaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int eta = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int moka = Integer.valueOf(lukija.nextLine());
        System.out.println(eta + " * " + moka + " = " + (eta * moka));
        

    }
}
