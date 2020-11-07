import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/db.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s");
                System.out.println(Arrays.toString(tokens));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
