package d48;

public class Q25 {
    String code;
    public static void main(String[] arges){
        Q25 obj = new Q25(); //Q25クラスをインスタンス化して、objという名前の変数に格納
        obj.setCode("FB1257");
        System.out.println(obj.code);
    }
    void setCode(String s){ // 引数で受け取った文字列をフィールド「code」に代入するメソッド
        code = s;
    }
}

/*
[メモ]
javaでは文字列を指定する場合"" (ダブルクオーテーション)で囲む必要がある
''(シングルくおーテーション)は、1文字だけ(Char型)を扱うときに使うので、混合しないよう
 */
