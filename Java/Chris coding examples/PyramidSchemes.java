import java.util.Scanner;

public class PyramidSchemes {
    private static final Scanner scanner = new Scanner(System.in);

    public PyramidSchemes(){}


    public void makeScheme(int num) {
        // print stuff here :)
        System.out.println(num);
        String str = "";

        for (int i = 1; i <= num; i++) {
            int numSpaces = num-i;
            str = addSpaces(str, numSpaces);
            str = addNumsLeft(str, i);
            str = addNumsRight(str, i);
            str = addSpaces(str, numSpaces);
            System.out.println(str);
            str = ""; // Fuck off java
        }
    }

    public String addSpaces(String str, int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            str+=" ";
        }
        return str;
    }

    public String addNumsLeft(String str, int num) {
        int start = num;
        while (num > 0) {
            str += Integer.toString(num);
            num--;
        }
        return str;
    }

    public String addNumsRight(String str, int num) {
        int cur = 2;
        while (cur <= num) {
            str += Integer.toString(cur);
            cur++;
        }
        return str;
    }

    public static void main(String[] args) {
        PyramidSchemes p = new PyramidSchemes();
        System.out.print(" >> Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        p.makeScheme(num);
        scanner.close();
    }
}
