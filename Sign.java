public class Sign {
    private String message;
    private int width;

    public Sign(String m, int w) {
        message = m;
        width = w;
    }
    
    public int numberOfLines() {
        return message.length()/width + 1;
    }

    public String getLines() {
        String s = "";
        int i = 0;
        while(i<message.length()) {
            s += message.substring(i, i+1);
            i++;
            if()
        }
    }
}
