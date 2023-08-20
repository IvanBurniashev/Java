package homework.hw_030823;

public class Substring {
    private String str;
    private int position;
    
    protected String getLetter(String str, int position) {
        this.str = str;
        this.position = position;
        if (position > 0 && position <= str.length()) {
            return(String.valueOf(str.charAt(position - 1)));
        } else {
            return ("");
        }
    }
}
