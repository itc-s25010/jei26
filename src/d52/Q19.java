package d52;

public class Q19 {
    static void main(String[] args) {
        float f = 9.8f; // 明示的にfloatを扱う場合は9.8fなどと書く
        double d = 9.9;
        System.out.println(f > d); // 両者の値がdouble型に(大きい方)に変換されて比較
    }
}
