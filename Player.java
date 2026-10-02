public class Player {
    private int balance;

    public Player(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }

    public boolean flip(Coin c, String guess, int risk) {
        c.flip();

        boolean correct = c.getState().equals(guess);

        if (correct)
            balance += risk;
        else
            balance -= risk;

        return correct;
    }
}