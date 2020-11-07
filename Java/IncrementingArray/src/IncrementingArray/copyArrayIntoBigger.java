package IncrementingArray;

public class copyArrayIntoBigger {

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5}; // array size increase
        int[] arrayTwo = new int[arrayOne.length + (arrayOne.length/2)];
            for (int i = 0; i < arrayOne.length; i++) {
                arrayTwo[i] = arrayOne[i];
            }
            arrayOne = arrayTwo;

            for (int j = 0; j < arrayOne.length; j++){ //add new things to array
                if(arrayOne[j] != 0){
                    arrayOne[j] = arrayOne[j];
                } else {
                    arrayOne[j] = 8;
                     j = arrayOne.length;
                }
            }
        }
    }
// temporary array to move items from one side to another excluding deleted one