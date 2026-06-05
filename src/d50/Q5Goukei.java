package d50;

public class Q5Goukei {
    public static void main(String[] args) {
        int[] num = new int[args.length]; // argsの長さの文配列を作成

        //配列numに変換した整数を格納するための繰り返し
        for(int i = 0; i < args.length; i++){
            // 例;文字列"10"を整数10に変更するにはIntegerクラスのparseInt()というメソッドを使う
            num[i] = Integer.parseInt(args[i]);
        }

        // 整数に変換後の値を使って合計を求める
        int sum = 0;
        for(int val : num){
            sum += val;
        }
        System.out.println(sum);
    }
}
