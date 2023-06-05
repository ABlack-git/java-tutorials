package tasks.bruteforce;

public class BruteForceAttacker extends Thief {
    @Override
    public void breakPassword(int size) {
        char[] password = new char[size];
        computePermutation(getCharacters(), password, 0);
    }

    private char[] computePermutation(char[] characters, char[] password, int passwordPos) {
        return password;
    }
}
