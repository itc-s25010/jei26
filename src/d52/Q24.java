package d52;

public class Q24 {
    static void main(String[] args) {
        int[] nums = {-5, 8, 3, 0, 9, -1};
        for (int n : nums){
            n *= 2; // nは-10→16→6→・・・と処理されるのがこの繰り返しのみで有効(スコープ)
        }
        for (int n: nums){
            System.out.print(n + ":");
        }
    }
}
