
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int eta = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int peta = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int jota = Integer.valueOf(lukija.nextLine());
        double moka = (eta + peta + jota)/3.0;
        System.out.println("Syötettyjen lukujen keskiarvo on " + moka );

    }
}
