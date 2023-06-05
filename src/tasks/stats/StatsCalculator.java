package tasks.stats;

public class StatsCalculator {

    /**
     * Input format:
     * First line consist of 4 numbers separated by space. This corresponds to width of columns in a final table.
     * First number: width of index column, minimum is 5
     * Second number: width of average column, minimum is 7
     * Third number: width of SD column, minimum is 7
     * Fourth number: width of Median column, minimum is 7
     * <p>
     * All next columns contain sequences of numbers separated by space. There can be different number of numbers in
     * sequence in each row.
     * Number of rows with sequences is not know in advance
     */
    public void start() {
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
     * output format:
     * table name: '|-----Statistics of input-----|' number of '-' characters should be determined dynamically based on
     * table width
     * header: '| index | average | SD | medians |' number of spaces should be determined dynamically and words should
     * be center aligned
     * index - left aligned
     * averages - 2 decimal places, right aliogtned
     * sds - 3 decimal places
     * medians - 2 decimal places
     * each column should be separated by '|' character
     * each row should be separated by line that consists from '-' and '+' characters (see example)
     * <p>
     * Example:
     * given first line was '5 7 7 7'
     * |-----Statistics of Input-----|
     * +-----+-------+-------+-------+
     * |Index|Average|   SD  | Median|
     * +-----+-------+-------+-------+
     * |1    |  23.23|   0.35|    21|
     * +-----+-------+-------+------+
     */
    public void printTable(double[] averages, double[] sds, double[] medians, int[] columnWidths) {
        //
    }
}
