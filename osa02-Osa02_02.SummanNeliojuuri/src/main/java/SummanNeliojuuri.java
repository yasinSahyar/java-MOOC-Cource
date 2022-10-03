
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = lukija.nextInt();
        int moka = lukija.nextInt();
        int sum = eka + moka ;
        
        double sqrt = Math.sqrt(sum);
        System.out.println(sqrt);

    }
}
