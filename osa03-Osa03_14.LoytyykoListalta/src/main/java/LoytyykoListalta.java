
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        System.out.println("Ketä etsitään?");
        String search =lukija.nextLine();
        if (lista.contains(search)) {
            System.out.println(search + "löytyi !");
        }else System.out.println(search + "ei löytynyt !");

    }
}
