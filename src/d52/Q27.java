package d52;

enum Signal{
    RED, YELLOW, GREEN
}

public class Q27 {
    static void main(String[] args) {
        Signal sig = Signal.YELLOW;
        if(sig == Signal.GREEN){
            System.out.println("緑");
        }
        if(sig == Signal.YELLOW){
            System.out.println("黃");
        }else {
            System.out.println("赤");
        }
    }
}
