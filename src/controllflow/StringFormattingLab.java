package controllflow;

public class StringFormattingLab {

    /**
     * https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax
     */
    public void start() {
        // 1. Recall string concatenation
        String firstString = "firstString";
        String secondString = "secondString";
        String thirdString = firstString + " " + secondString + " end of string";
        System.out.println(thirdString);
        // 2. String.format(), format syntax
        System.out.println(String.format("%s %s end of string", firstString, secondString));
        // 3. appending/prepending spaces
        String s1 = "s1";
        System.out.printf("%-4s%3s\n", s1, s1);
        // 4. zero padding
        System.out.printf("%06d\n", 1234567);
        System.out.printf("%+d\n", 123);
        // 5. floating point formatting
        System.out.printf("%.4f\n", 6.555555f);
        // 6. println, print, printf
        System.out.print(firstString + "\n");
        System.out.println(secondString);
        System.out.print(secondString + "\n");
        String fourthString = "newLineString\n";
        System.out.println(fourthString);
        System.out.print("asdasd");
        System.out.printf("%s %s \n", secondString, firstString);
        // 7. System.out vs System.err
        System.out.println("This is normal message");
        System.err.println("This is error message");
        // 8. formatting arguments
        // Value: 2 ------ Value2: 3 ------
        System.out.printf("Value: %1$s %3$s Value2: %2$s %3$s\n", 2, 3, "-".repeat(6));
        // 8. StringBuilder (build simple table)
        StringBuilder lineSb = new StringBuilder();
        String lineSeparator = lineSb.append("+").append("-".repeat(15)).append("+\n").toString();

        StringBuilder tableSb = new StringBuilder();
        tableSb.append(lineSeparator)
            .append("|").append(String.format("%-15s", "TableName")).append("|\n")
            .append(lineSeparator)
            .append("|").append(String.format("%7s", "Val1")).append("|").append(String.format("%7s", "Val2")).append("|\n")
            .append(lineSeparator);
        System.out.println(tableSb);
    }
}
