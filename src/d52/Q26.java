package d52;

public class Q26 {
    static void main(String[] args) {
        int x = 0;
        for (int i = 3; i < 20; i += 5){
            if(i < 10){
                if (i % 2 == 0){
                    x = -1 * i;
                }else{
                    x = 3 * i;
                }
            }else{
                if(i % 9 == 0){
                    x = -1 * i;
                }
            }
            System.out.print(x + " ");
        }
    }
}
