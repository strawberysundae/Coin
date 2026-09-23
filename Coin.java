public class Coin {
    private String state;
    private int heads;
    private int tails;
    private double pTails;
    
    public String getState() {
        return state;
    }
    public int getHeads() {
        return heads;
    }
    public int getTails() {
        return tails;
    }
    public void flip() {
        if (Math.random() < 0.5) {
            state = "tails";
            tails++;
    }
        else {
            state = "heads";
            heads++;
        }
    }
    public void flip(int flips) {
        while (flips > 0) {
            flip();
            flips--;
        }
    }
}