

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class TiedotTiedostosta {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?: ");
        String file = scanner.nextLine();
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String str;
        while ((str =br.readLine()) != null) {
            String[] strArray = str.split(",");
            String formattedYears = "vuotta";
            
            if (Integer.parseInt(strArray[1]) == 1) {
                formattedYears = "vuosi";
            }
            System.out.println(strArray[0] + ", age: " + strArray[1] + " " + formattedYears );
        }
        

    }
}
