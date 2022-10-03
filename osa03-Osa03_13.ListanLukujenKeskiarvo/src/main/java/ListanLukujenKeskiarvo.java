
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        
        float sum = 0;
        for(Integer integer :list) {
            sum += integer;
        }
        float average = (sum / list.size());
        
        System.out.println("Keskiarvo :"+ average);
    }
}
