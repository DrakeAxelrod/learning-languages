package Ex2.p2.Completed;

public class FindN {
    public static void main(String[] args){
        int n=1;
        int sqr = 0;
        while (sqr<12000){
            sqr=1;
            sqr = n * n;
            System.out.println("testing "+n);
            n++;
        }
        System.out.println("Smallest integer such that n^2 > 1200: " + n);
    }
}


/*
Use a while loop to find the smallest integer n
such that n^2 (n square) is greater than 12000.
 */
