package d50;

public class Q17 {
    public static void main(String[] args) {
        float f = 7.8f; // 7.8fはfloat型ということを明示している
        double d = 15.37; // doubleの場合は省略するのがデフォルト

        double x = f * d; // 異なる方の計算はより大きい方に自動変換される
        System.out.print(x);
    }
}
