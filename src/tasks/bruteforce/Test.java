package tasks.bruteforce;

public class Test {
    public static void main(String[] args) {
        String password = "abcdaaaddb";
        BruteForceAttacker attacker = new BruteForceAttacker();
        attacker.init(new char[]{'a', 'b', 'c', 'd'}, password);

        System.out.println("Trying to break password...");
        attacker.breakPassword(password.length());

        if (attacker.isOpened()) {
            System.out.println("[VAULT] opened, password is " + password);
        } else {
            System.out.println("[VAULT] is still closed");
        }
    }
}
