
import java.nio.file.Paths;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String str;

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

    }
}
