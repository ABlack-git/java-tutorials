package primitives;

import java.util.Arrays;

public class StringsAndArrays {
    /**
     * 1) String and string formatting
     * 2) Arrays
     */
    public static void main(String[] args) {
        String name = "Andrew";
        int age = 29;
        System.out.println(String.format("Hello, my name is %s. I'm %d years old", name, age));

        double bar = 10.555555;

        System.out.println(String.format("%.2f", bar));

        StringBuilder sb = new StringBuilder("My");
        sb.append(" name");
        sb.append(" is").append(name).append("I am ").append(age).append(" yeas old");
        System.out.println(sb.toString());

        arrays();
    }


    public static void arrays() {
        int[] ages = new int[10];
        System.out.println(Arrays.toString(ages));
        ages[0] = 10;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages.length);

        int[] ages2 = {1, 2, 3, 4, 5};
        ages2[0] = 10;
        System.out.println(Arrays.toString(ages2));
        System.out.println(ages[4]);
        int[] newAges = new int[ages.length * 2];
        System.out.println(Arrays.toString(newAges));
        for (int i = 0; i < ages2.length; i++) {
            newAges[i] = ages2[i];
        }
        System.out.println(Arrays.toString(newAges));

        int[][] matrix = new int[10][20];

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println(matrix[9][4]);

        int[][] matrix2 = {{1, 2, 3}, {3, 2, 1}};
    }


}
