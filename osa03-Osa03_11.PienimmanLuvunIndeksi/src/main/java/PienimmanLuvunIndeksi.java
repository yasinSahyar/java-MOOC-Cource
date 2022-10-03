
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        ArrayList<Integer> userList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            userList.add(input);
        }

        int smallest = userList.get(0);

        for (Integer integer : userList) {
            if (integer < smallest) {
                smallest = integer;
            }
        }

        System.out.println("Peinin luku on " + smallest);

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i) == smallest) {
                System.out.println("Peinin luku löytyy indeksisitä " + i);
            }
        }
        
    }
    
}
