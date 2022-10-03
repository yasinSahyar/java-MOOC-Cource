
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int jasin = Integer.valueOf(lukija.nextLine());
        if (jasin < 0){
            System.out.println("mahdotona!");
        }else if (jasin < 50){
            System.out.println("hylätty");
        }else if (jasin < 60){
            System.out.println("1");
        }else if (jasin < 70){
            System.out.println("2");
        }else if (jasin < 80){
            System.out.println("3");
        }else if (jasin < 90){
            System.out.println("4");
        }else if (jasin < 101){
            System.out.println("5");
        }else {
            System.out.println("uskomatonta!");
        }
    }
}
