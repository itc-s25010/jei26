package d51;

public class Q19 {
    static void main(String[] args) {
        float f = 4.7f;
        double d = 0.86;
        double ans = f * d; // floatには代入できないため、大きい方のdoubleにする必要がある
        System.out.println(ans);
    }
}
