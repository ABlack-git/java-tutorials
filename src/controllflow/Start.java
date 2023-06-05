package controllflow;

public class Start {
    /**
     *
     */
    public static void main(String[] args) {
        StringFormattingLab lab1 = new StringFormattingLab();
        InputProcessingLab lab2 = new InputProcessingLab();

        int labNumber = 1;

        switch (labNumber) {
            case 1 -> lab1.start();
            case 2 -> lab2.start();
        }
    }
}
