package primitives;

import java.util.Random;

public class PrimitivesTask {
    /**
     * 1) Create a 5x5 matrix of integers
     * 2) Fill in the matrix with random integers. Use rand.nextInt(10) from below. This function returns a random
     * integer from 0 to 9;
     * 3) Print out the first row of matrix. For this complete naivePrintRow function. **Do NOT** use Arrays.toString().
     * DO use for loop and System.out.println(). The printed row should start with '[' and end with ']' characters
     * and each number should be followed by coma and space except last number. Example output [1, 2, 3, 4].
     * 4) Now complete the function printRow using StringBuilder. Your task is firstly to create a string of the row
     * and then print it out with one single call to System.out.println
     * 5) Print all rows of the matrix using printRow function. Do not copy and paste code, use for loop;
     * 6) Complete the function theGreatDivider. Your goal is to print out all elements of matrix and for each element
     * output the following message 'Row: {rowNumber}, Column: {columnNumber}, Value: {value at row and column},
     * DividedValue: {value divided by two}'. Note that DivedValue should be displayed with 2 digits after decimal
     * point. Example: 'Row: 1, Column: 3, Value: 5, DividedValue: 2.50'
     */
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        int[] myArray = {1, 2, 3};
        naivePrintRow(myArray);
    }

    /**
     * HINT: if you are not sure about how to print the last number of array without coma and space
     * (e.g. you don't want to print [1, 2, 3, ] you want to print [1, 2, 3]), think about the fact that you don't need
     * if statement and in for loop you use row.length as condition
     */
    private static void naivePrintRow(int[] row) {
        // remove the code below and write your own implementation using only for loop and System.out.print or
        // System.out.println. Difference between print and println is that println will print new line character at
        // the end

        System.out.print(row[0]); // output: 1
        System.out.print(row[1]); // output: 12
        System.out.println(row[2]); // output: 123
        System.out.print("This will start from new line"); // this will be printed on new line
    }

    private static void printRow(int[] row) {
        StringBuilder sb = new StringBuilder();
        sb.append("text to add");
        // write your code here
        System.out.println(sb);
    }

    private static void theGreatDivider(int[][] matrix) {
        // print 'Row: i, Column: j, Value: x, DividedValue: x/2' for each i and j in matrix. Use println to print from
        // new line
    }
}
