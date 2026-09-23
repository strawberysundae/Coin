public class Coin {
    private String state;
    private int heads;
    private int tails;
    
    public String getState() {
        return state;
    }
    public void flip() {
        if (Math.random() < 0.5)
            state = "tails";
        else state = "heads";
    }
}