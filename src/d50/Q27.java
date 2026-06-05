package d50;

public class Q27 {
    public static void main(String[] args) {
        int control = 2;
        String mode;

        switch(control){
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            default:
                mode = "Wind";
                break; // case 2 が実行された後、defalutに処理が移らないようbreakをつけておく
        }
        System.out.print(mode); // Coolが出力された
    }
}
