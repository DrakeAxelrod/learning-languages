package ClassroomExamples;

public class MatrixSum {
/*
given a matrix Arxc, it creates another matrix Brx1 with one column.
Each row, in this single column, has the sum of all values 
in the corresponding row of Arxc. for instance:
input:
10 11 12
25 25 0
-5 -3 2
output:
33
50
-6
*/
    public static void main(String [] args){
        // using short cut for metrix
        int[][] matrixA = { {10, 11, 12}, 
                            {25, 25, 0}, 
                            {-5, -3, 2}};
            System.out.println(matrixA [0]);
    }
}