
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Urheilutilastot {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?:");
        String file = scan.nextLine();

        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?:");
        String team = scan.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        List<String[]> total = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(",");
            total.add(arr);
        }

        int tappioita = 0;
        int voittoja = 0;
        for (String[] arr : total) {
            int score1 = Integer.parseInt(arr[2]);
            int score2 = Integer.parseInt(arr[3]);

            if (arr[0].equalsIgnoreCase(team) && score1 > score2 || arr[1].equalsIgnoreCase(team) && score2 > score1) {
                voittoja++;
            } else if (arr[0].equalsIgnoreCase(team) || arr[1].equalsIgnoreCase(team)) {
                tappioita++;
            }
        }

        int otteluita = voittoja + tappioita;
        System.out.println("Otteluita: " + otteluita);
        System.out.println("Voittoja: " + voittoja);
        System.out.println("Tappioita: " + tappioita);

    }

}
