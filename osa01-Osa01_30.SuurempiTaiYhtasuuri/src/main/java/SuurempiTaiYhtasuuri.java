
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        int jasin = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int memet = Integer.valueOf(lukija.nextLine());
        if ( jasin > memet ){
            System.out.println("Suurempi luku:" + jasin);
        } else if (jasin < memet){ 
            System.out.println("Suurempi luku:" + memet);   
        } else {
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
