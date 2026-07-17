package d52;

public class Q5 {
    static void main(String[] args) {
        String majors = "+----"; //メモリの行
        int LIMIT = 400; // 400以上の値を弾く際の上限値を設定
        if(args.length == 0) return; // 1:整数値が一つも指定されていないときはプログラムを終了
        int max = 0, i = 0;
        int[] data = new int[args.length];
        for (String s : args){
            data[i] = Integer.parseInt(s); // コマンドライン引数を整数に変換
            if (data[i] <= 0 || data[i] >= LIMIT) return; // 1:0以下、400以上の場合は終了 (1以上400未満)
            if (max > data[i]){ // 指定された整数の中から最大値maxを求める
                max = data[i];
            }
            i ++; // インデックスの更新
        }

        // メモリ表示
        int majormax = (max - 1) / 5 + 1; // メモリを表示する際に使うmajormaxの計算。詳しくは後述
        System.out.println("       "); // メモリを表示する際の調整用インデント
        for (i = 0; i < majormax; i++){
            System.out.print(majors.substring(i)); // charAtメソッドを使ってメモリを出力
        }
        System.out.println(""); // 改行

        // グラフ表示
        for (i = 0; i < data.length; i++){
            System.out.printf("%4d : ", data[i]); // print()メソッドのフォーマット指定子%4dは4桁の整数右揃え
            int n = (data[i] - 1) / 5 + 1; // (32) 詳しくは後述
            for (int j = 0; j < n; j++){
                System.out.print('*');
            }
            System.out.println(""); // 改行
        }
    }
}
