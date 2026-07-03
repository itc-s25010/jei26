package d51;

public class Q18 {
    static void main(String[] args) {
        int i;
        for(i = 0; i < 9; i +=2){
            System.out.print(++i);
        }
    }
}
/*
[メモ]iの変化の様子
1回目のループ終了時:0->1
2回目のループ終了時:3->4->6
3回目のループ終了時:6->7->9
(i=9はi<9ではないため繰り返し終了となる)
出力は147
 */
