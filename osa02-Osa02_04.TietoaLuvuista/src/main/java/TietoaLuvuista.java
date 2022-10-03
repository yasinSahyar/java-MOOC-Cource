
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int num1 = lukija.nextInt();
        int num2 = lukija.nextInt();
        
        if (num1 > num2){
            System.out.println("Luku " + num1 + " on suurempi kuin luku " + num2);
        }else if (num1 < num2){
            System.out.println("Luku " + num1 + "  on pienempi kuin " + num2);
        }else {
            System.out.println("Luku " + num1 + " on yhtä suuri kuin luku " + num2);
        }

    }
}
