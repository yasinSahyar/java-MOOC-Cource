
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        System.out.println("from?");
        int departure = Integer.valueOf(lukija.nextLine());
        System.out.println("Where to?");
        int end = Integer.valueOf(lukija.nextLine());
        while (departure <= end){
            System.out.println(luvut.get(departure));
            departure++;
        }

    }
}
