package d52;

public class Q25 {
    static void main(String[] args) {
        Double d = new Double("7"); //古い書き方で推奨はされていない
        Double d2 = d + 4.25;

        double d3 = Double.parseDouble("7");

        System.out.println(d2);
    }
}

/*
[メモ]
問題集のDouble(java.lang.String)という表現は現在では推奨されていないようです。
新しい書き方(Double.parseDouble)と合わせて抑えておきましょう

オートボクシング:Doubleとdoubleの計算結果をDoubleで受け取ること
あんボクシング:逆にDoubleからdoubleへ自動で戻ること
Double型:double(基本型)をオブジェクトとして扱うようにしたラッパークラスのことで、
doubleと同じような感覚で使用することができる
 */
