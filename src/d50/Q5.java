package d50;

public class Q5 {
    public static void main(String[] args) {
        int[] num = new int [args.length];

        for(int i = 0; i < args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp; // 値を入れ替える際に一義的に使う
        for(int i = 1; i < num.length; i++){ // 先頭は比較不要のためi = 1 から始まる
            for(int j = i -1; j >=0 && num[j] > num[j + 1]; j--){ // j = i-1から左に向かって比較・交換
                tmp = num[j]; //num[i]を一次保存
                num[j] = num[j + 1]; //右の値を左に移動
                num[j + 1] = tmp; // 一義保存した値を右に移動
            }
        }

        // ソート完了後の配列を出力するための拡張for文
        for(int val : num){
            System.out.print(val + " ");
        }
    }
}
