package controllflow;

import java.util.List;
import java.util.Random;

public class ControlFlow {

    /**
     * 1) If
     * 2) while (discuss while before for, introduce counter)
     * 3) for (show how for is basically a while)
     * 4) switch
     * 5) reading input
     */
    public static void main(String[] args) {
        boolean isPackageDamaged = true;
        if (isPackageDamaged) {
            System.out.println("Send to service");
        } else {
            System.out.println("it's not damaged it's fiiine");
        }
        System.out.println("continue normal flow");

        int wage = 70;

        if (wage < 50) {
            System.out.println("You are poor bitch");
        } else if (wage >= 50 && wage < 100) {
            System.out.println("Better but still");
        } else if (wage >= 200 && wage < 300) {
            System.out.println("Now we are talking");
        } else {
            System.out.println("Unknown range");
        }

        System.out.println("Continue flow");

        String color = "blue";
        String color2 = new String("red");

        if (color != null && color.equals(color2)) { // ALWAYS COMPARE OBJECTS WITH EQUALS
            System.out.println("let's try");
        }

        if ((isPackageDamaged && color2.equals("red")) || wage > 100) {
            System.out.println("example of complex ifs");
        }

        switch (color) {
            case "red":
                System.out.println("color is red");
                break;
            case "blue":
                System.out.println("color is blue");
                break;
            case "green":
                System.out.println("color is green");
                break;
            default:
                System.out.println("unknown color, color was " + color);
        }

        int counter = 0;
        while (counter < 100) {
            counter++;
        }
        System.out.println(counter);
        counter = 0;

        do {
            counter++; // will be executed before checking condition
        } while (counter < 100);
        System.out.println(counter);

        System.out.println("Test break");
        int i = 0;
        Random rand = new Random();
        int randInt;
        while (i < 100) {
            randInt = rand.nextInt(10);
            System.out.println(randInt);
            if (randInt < 5) {
                break;
            }
            i++;
        }
        System.out.println("Counter value " + i);

        System.out.println("Demo continue");
        i = 0;
        int j = 0;
        while (i < 100) {
            randInt = rand.nextInt(10);
            if (randInt < 5) {
                j++;
                continue;
            }
            i++;
            j++;
        }

        System.out.println("i: " + i + " j: " + j);
        System.out.println("Demo for loop");
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int k = 0; k < arrInt.length; k++) {
            System.out.println(arrInt[k]);
        }

        List<String> colors = List.of("red", "green", "blue", "yellow");
        for (String c : colors) { // for loop using iterators
            if (c.equals("red")) {
                continue;
            }
            System.out.println(c);
        }
    }
}
