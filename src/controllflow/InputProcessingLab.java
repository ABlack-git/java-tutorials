package controllflow;

import java.util.Arrays;
import java.util.Scanner;

import utils.TextIO;

public class InputProcessingLab {

    public int processNumber(int number) {
        if (number < 100) {
            return number * 2;
        }
        return number / 2;
    }

    public int processNumber(double number) {
        return (int) Math.ceil(number);
    }

    public void appendToString(StringBuilder sb) {
        sb = new StringBuilder(); // sb 2
        sb.append("append");
        System.out.println(sb);
    }

    public void printNumber(int number, int numberOfLeadingZeros) {

    }

    public void printNumber(double number, int decimalPlaces) {

    }

    private boolean processInput(String processingCommand) {
        if (processingCommand.equals("Y")) {
            return true;
        } else if (processingCommand.equals("N")) {
            return false;
        } else {
            System.err.println("That's not what I asked for, idiot");
            System.exit(-1);
        }
        return false;
    }

    public void start() {

//        StringBuilder sb = new StringBuilder("My string"); //sb 1
//        appendToString(sb);
//        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        // prompt for int input
//        System.out.println("Enter an integer:");
//        int receivedInt = scanner.nextInt();
//        System.out.println("Entered integer: " + receivedInt);
        // read integer if not integer abort with sys exist use System.err for err message
        System.out.println("Enter an integer:");
        String input = scanner.nextLine();
        boolean isInteger = TextIO.isInteger(input);
        int inputInt = -1;
        if (isInteger) {
            inputInt = Integer.parseInt(input);
            System.out.println("Entered integer: " + inputInt);
        } else {
            System.err.println("That's not integer you asshole: " + input);
            System.exit(-1);
        }
        // prompt for double input
        System.out.println("Enter a double: ");
        // read double and check
        input = scanner.nextLine();
        boolean isDouble = TextIO.isDouble(input);
        double inputDouble = -1;
        if (isDouble) {
            inputDouble = Double.parseDouble(input);
            System.out.println("Entered double: " + inputDouble);
        } else {
            System.err.println("That's not double you asshole: " + input);
            System.exit(-1);
        }
        // prompt if input should be processed
        System.out.println("Enter Y if input should be processed and N if not");
        input = scanner.nextLine();
        boolean processInput = processInput(input);
        System.out.println("Input will be processed: " + processInput);
        // prompt for leading zeros and decimal point (format: 2 3)
        System.out.println("Enter number of leading zeros and precision (format: 2 3): ");
        // read and validate
        input = scanner.nextLine();
        String[] inputs = input.split(" ");
        System.out.println(Arrays.toString(inputs));
        if (inputs.length != 2) {
            System.err.println("I asked for two numbers, how hard is this?");
            System.exit(-1);
        }
        for (int i = 0; i < 2; i++) {
            if (!TextIO.isInteger(inputs[i])) {
                System.err.println("I asked for two numbers, how hard is this?");
                System.exit(-1);
            }
        }
        int numZeros = Integer.parseInt(inputs[0]);
        int numPrecision = Integer.parseInt(inputs[1]);

        System.out.printf("Entered numbers: %d, %d\n", numZeros, numPrecision);
        // process int and double
        if (processInput) {
            System.out.printf("Procesed int: %d, processed double: %d\n", processNumber(inputInt),
                processNumber(inputDouble));
        } else {
            System.out.println("Finish running");
        }
        // print int and double


    }
}
