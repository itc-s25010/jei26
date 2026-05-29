package d49;

public class Q22 {
    static void main(String[] args){
        int length = 2100;
        String type;
        if (length < 1000){
            type = "Short";
        }else if (length > 2000){
            type = "Long";
        }else{
            type = "Standard";
        }
        System.out.println(type);
    }
}
