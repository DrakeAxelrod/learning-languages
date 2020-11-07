package Ex2.p2.InProgress;
import java.util.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number of lines: ");
        int n = input.nextInt();
        n++;
        input.nextLine();
        for (int i = 0; i < n; i++){
            int block = 1;
            for (int j = n; j>=i; j--)
                System.out.print(" ");
            for (int k = 0; k < i; k++) {
                System.out.print(block);
                block++;
            }
            System.out.println();
        }
    }
}
