package tasks.stats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StatsCalculator {

    public void start() {
        // Example of reading multiple lines from std in.
        Scanner scanner = new Scanner(System.in);
        String first_line = scanner.nextLine();
        List<String> lines = new ArrayList<>();
        lines.add(first_line);
        while (scanner.hasNextLine()) {
            var line = scanner.nextLine();
            lines.add(line);
            System.out.println(Arrays.toString(line.split(" ")));
        }
        System.out.println(lines);

        // 1. read first line and validate

        // 2. read the rest of input and parse sequences

        // 3. compute average, sd and median for all sequences

        // 4. print table

    }

    public double[] parseInputLine(String line) {
        return null;
    }

    public double computeAverage(double[] sequence) {
        return -1;
    }

    public double computeStandardDev(double[] sequence) {
        return -1;
    }

    public double computeMedian(double[] sequence) {
        return -1;
    }

    /**
     * @param averages array of averages where i-th element corresponds to average of i-th input sequence
     * @param sds array of stds where i-th element corresponds to SD of i-th input sequence
     * @param medians array of medians where i-th element corresponds to median of i-th input sequence
     * @param columnWidths array of 4 numbers read on first input line
     */
    public void printTable(double[] averages, double[] sds, double[] medians, int[] columnWidths) {
        //
    }
}
