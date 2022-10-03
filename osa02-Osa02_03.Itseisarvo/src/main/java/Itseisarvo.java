
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sum = lukija.nextInt();
        if (sum < 0 ){
            System.out.println(sum * -1);
        } else {
            System.out.println(sum);
        }
    }
}
