package d49;

public class Q24 {
    static void main(String[] args) {
        int values[] = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }

        System.out.println(sum / values.length);
        System.out.println(sum);
        System.out.println(values.length);
    }
    /*
    [メモ]value.lengthについて
    配列valuesの要素数を取得します
    int values[] = {10, 20, 30, 40}であればvalues.length「4」となります
     */
}
