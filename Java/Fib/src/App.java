import java.util.HashMap;

public class App {

    static public int shitFib(int n)
    {
        if(n<=1) return n;
        return shitFib(n-1) + shitFib(n-2);
    }

    public static Double fib(double n) // 2^n
    {
        return fib(n, new HashMap<Double, Double>());
    }

    private static double fib(double n, HashMap<Double, Double> map)
    {
        if (map.containsKey(n)) return map.get(n);
        if (n<=1) return n;
        map.put(n, fib(n-1, map) + fib(n-2, map));
        return map.get(n);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(fib(1000));
    }
}
// 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765