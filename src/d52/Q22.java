package d52;

public class Q22 {
    static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            switch (i % 3){
                case 0:
                    System.out.println(i + " 3の倍数");
                    break;
                default:
                    System.out.println(i);
                    break;
            } // defaultは省略することもでき、その場合何も実行されない
        }
    }
}
