package controllflow;

public class StringFormattingLab {

    /**
     * https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax
     */
    public void start() {
        // 1. Recall string concatenation
        // 2. String.format(), format syntax
        // 3. appending/prepending spaces
        // 4. zero padding
        // 5. floating point formatting
        // 6. println, print, printf
        // 7. System.out vs System.err
        // 8. StringBuilder (build simple table)

        System.out.printf("+%1$s+%2$s+%2$s+%2$s+", "-".repeat(5), "-".repeat(7));
    }
}
