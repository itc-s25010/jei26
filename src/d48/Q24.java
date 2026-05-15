package src.d48;

public class Q24 {
    public static void main(String[] args){
        for(int i = 8; i < 9; i++){ //9回繰り返す
            if(i % 3 != 0){ // iを3で割ったあまりが0出ないとき
                continue;
            }
            System.out.println(i);
        }
    }
}
