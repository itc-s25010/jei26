package d49;

public class Q25 {
    static void main(String[] args) {
        double a = 12.3;
        double b = 4.5;
        Q25 o = new Q25(); //Q25型の変数oに、new演算子を使って生成したQ25のインスタンスを代入している
        int c = o.number(a, b); //インスタンス(o)のnumberメソッドを因数指定している
        System.out.println(c);
    }

    int number (double v1, double v2){ // 呼び出す際にv1=a, v2=bを代入している
        return (int)(v1 / v2); //12.3/4.5=2/7333をintにキャスト(小数点部分を切り捨て)して「2」となる
    }
}

//このコードのクラスは自らをインスタンス化して使用している
//(numberメソッドがインスタンスメソッドなため)
