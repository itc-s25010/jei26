package d50;

public class Q6 {

    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        if (min > max) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();//オブジェクトの生成
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);//下記メソッドの設計により引数にmin, maxをしていする

        //拡張for文を使い配列partのすべての要素を出力
        for (int prime : part) {
            System.out.printf("%d, ", prime);
        }
    }
}

class PrimeNumbers {
    boolean[] isPrimeNumbers;

    //素数判定配列を設定するメソッド
    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1]; // 4.①: 最大値+1を要素数とする素数判定配列を用意する
        for (int i = 2; i <= max; i++) {// 2から999の範囲とするためi=2としている
            isPrimeNumbers[i] = true; //4.②: 素数判定要素をすべてtrueに初期化する
        }

        // pが最大値の正の平方根を超えるまで④⑤の手順を繰り返す
        // 4.③: 素数として2をpに設定する
        // 4.⑤: 素数判定配列pの次の素数を先頭から探索し、pへ設定する(p++)
        for (int p = 2; p <= Math.sqrt(max); p++) {
            if (isPrimeNumbers[p]) { // p画素数であれば何倍をfalseに設定する
                for (int m = p * 2; m <= max; m += p) {
                    isPrimeNumbers[m] = false; // 4.④: 素数pの倍数をすべてfalseに設定する
                }
            }
        }
    }

    //指定された範囲の素数を素数判定範囲から抜き出し、結果を配列で返す
    int[] getPart(int min, int max) {
        int count = 0;
        for (int n = min; n <= max; n++) { //素数の数をカウントし、countへ格納
            if (isPrimeNumbers[n]) {
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }
        return part;
    }
}
