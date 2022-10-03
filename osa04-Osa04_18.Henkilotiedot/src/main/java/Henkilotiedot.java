
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("etunimi:");
            String etunimi = lukija.nextLine();

            if (etunimi.isEmpty()) {
                break;
            }

            System.out.println("sukunimi:");
            String sukunimi = lukija.nextLine();
            System.out.println("hetu:");
            String hetu = lukija.nextLine();

            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, hetu));

        }

        for (Henkilotieto Henkilotieto : henkilotiedot) {
            System.out.println(Henkilotieto.getEtunimi() + " " + Henkilotieto.getSukunimi());
        }

    }
}
