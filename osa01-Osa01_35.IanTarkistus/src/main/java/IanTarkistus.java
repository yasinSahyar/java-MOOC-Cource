
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka vanha olet?");
        int jasin = Integer.valueOf(lukija.nextLine());
        if (jasin >= 0 && jasin <=120){
            System.out.println("OK");
        }else {
            System.out.println("Mahdotonat!");
        }

    }
}
