package d52;

import java.awt.*;

// 実行用クラス
public class Q6 {
    static void main(String[] args) {
        Drink[] dr = { // オブジェクト配列で管理する場合はこのような書き方
               new Drink("Gomacola", 150),
               new Drink("MrPeppar", 130),
               new Drink("SaltWater", 320)
        }; // セミコロンを忘れずに
        VendingMachine vm = new VendingMachine(dr); // コンストラクタに↑drオブジェクトを渡して、インスタンス化
        vm.display(); // 5: 販売する清涼飲料水を一番目から順に表示する
        vm.execCom("i 100"); // 3.①:100円を投入
        vm.execCom("p 2"); // 3.②:2番目の清涼飲料水を購入
        vm.execCom("i 500"); // 3.①:500円を投入
        vm.execCom("p 3"); // 3.② : 3番目の清涼飲料水を購入
        vm.execCom("c 0"); // 3.③:お釣りを払い出す(0はダミーで参照しない)
    }
}

// 清涼飲料水の名称と価格し、名称と価格を表す文字列を取得するメソッドを提供
class Drink{
    private String name; // 清涼飲料水の名前
    private  int price; // 価格
    Drink(String name, int price){ // インスタンス化の際に実行されるコンストラクタ
        this.name = name; // メンバ変数にコンストラクタの引数を代入する際、this.をつける
        this.price = price; // 同上
    }
    public String getName() { return name; } // 名称を返す
    public int getPrice() { return price; } // 価格を返す
    public String toString() { // 名称を文字列を表す文字列を返す
        return "[" + name + "]" + price + "円"; // 例: [Gomacola] 150円
    }
}

// 自動販売機をシミュレートするクラス
class VendingMachine{
    private Drink[] drinks; //販売する清涼飲料水を管理する配列
    private int cash = 0; // 投入額 (2:初期値は0)
    private int[] coins = {500, 100, 50, 10}; // 自動販売機が受け付ける効果を管理する配列 (1)
    VendingMachine(Drink[] drinks) { // コンストラクタはクラス名とメソッド名を合わせる
        this.drinks = drinks; // オブジェクト (参照型) でも基本型と同じように扱える
    }

    public void display(){ // 5:説明文にある形式で販売する清涼飲料水を1番目から順に表示する
        int idx = 1; // 1番目からの初期値
        for(Drink drink : drinks){
            System.out.println(" [" + idx + "]" + drink);
            idx++;
        }
    }

    public void execCom(String command){ // 引数のコマンドを解釈し、適切な処理を行う
        String[] s = command.split(" "); // 半角スペースで分割
        switch (s[0]){ // 3:コマンド (i, p, c)を解釈したいため
            case "i": // 投入コマンド
                if(isCoin(s[1])) cash += Integer.parseInt(s[1]); // isCoin()はtrueの処理
                break;
            case "p": // 購入コマンド
                int idx = Integer.parseInt(s[1]) - 1; // 指定された番号を配列で扱えるよう-1にしている
                if(idx <= 0 || idx > drinks.length) return; // 3.②:数値用法が1未満(0以下), またはn(drinks.length)を超える場合何もしない
                int price = drinks[idx].getPrice(); // 選択された清涼飲料水の価格を取得
                if(price <= cash){ // 価格(price) が 投入額(cash) 以下ならば
                    eject(idx); // ejectメソッドの実行 (清涼飲料水が排出されました)
                    cash -= price; // cashの更新
                    payChange(); // お釣りの払い出しpayChangeメソッドの実行
                }else{ // お金が足りなければ
                    System.out.println("お金が足りません");
                }
                break;
            case "c": // お釣りコマンドのcase
                payChange(); // お釣りを払い出すpayChangeメソッドの実行
                break;
            default:
                break;
        }
    }

    private boolean isCoin(String s){ // 引数の金額が、自動販売機が受け取るいずれかの金額に等しい場合だけtrueを返す
        int c = Integer.parseInt(s); // 文字列を整数に変換
        for(int coin : coins){ // いずれかの金額はメンバ変数coinsで指定されている
            if (c == coin) return true;
        }
        return false;
    }

    private void eject(int idx) { // 指定した飲料水を排出したメッセージを表示する
        System.out.println(drinks[idx] + " が排出されました");
    }

    private void payChange(){
        if (cash == 0) {
            System.out.println("お釣り　なし");
            return;
        }
        String s = "お釣り";
        for (int coin: coins){
            if(cash / coin > 0){ // 投入額cash / 扱える金額coin が0よりも大きい場合
                s += coin + "円:" + (cash / coin) + "枚"; // 下記メモで詳しく
                cash %= coin; // cashをcoinで割ったあまりをcashに上書き (37:下記メモで詳しく)
            }
        }
        System.out.println(s);
    }
}