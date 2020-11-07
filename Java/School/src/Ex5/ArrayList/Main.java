package Ex5.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("pink");

        for (String element : colors){
            System.out.println(element);
        }
        System.out.println("------------------------------------");
        colors.add(0, "orange");

        for (String element : colors){
            System.out.println(element);
        }
        System.out.println("------------------------------------");
        System.out.println(colors.get(4));
        System.out.println("------------------------------------");
        colors.set(2, "purple");
        System.out.println(colors.get(2));
        System.out.println("------------------------------------");
        colors.remove(3);
        for (String element : colors){
            System.out.println(element);
        }
        System.out.println("------------------------------------");
        for (String element : colors){
            if (element.contains("green")){
                System.out.println(element);
            }
        }
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println("------------------------------------");
        Collections.shuffle(colors);
        System.out.println(colors);
        ArrayList<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("a");
        colorsTwo.add("b");
        colorsTwo.add("c");
        colorsTwo.add("d");
        colorsTwo.add("e");
        System.out.println("before " +colorsTwo);
        Collections.copy(colorsTwo, colors);
        System.out.println("after " +colorsTwo);
        Collections.reverse(colors);
        System.out.println("reversed colors "+colors);
        List<String> sub_Colors = colors.subList(0,3);
        System.out.println(sub_Colors);

    }
}
