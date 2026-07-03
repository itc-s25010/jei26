package d51;

public class Q26 {
    public static void main(String[] args){
        int n = 1;
        String s = "";
        switch (n){
            case 1:
                s += "one";
                case 2:
                    s += "two";
            default:
                s += "?";
        }
        System.out.println(s);
    }
}
