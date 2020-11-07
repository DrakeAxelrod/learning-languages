public class SelfExpandingArray {

    public static int[] arr = new int[10];

    public static int[] growArr(int[] someArr) {
        int[] newArr = new int[(int) (someArr.length * 1.25)];
        for (int i = 0, j = someArr.length-1; i < j; i++, j--) {
            newArr[i] = someArr[i];
            newArr[j] = someArr[j];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int sampleSize = 10000;
        for (int i = 0; i < sampleSize; i++) {
            if (i != arr.length-1) {
                arr[i] = i;
            } else {
                arr = growArr(arr);
            }
            System.out.println(arr.length);
        }
    }
}
