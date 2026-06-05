package d50;

public class Q23Kadai {
    String code;

    public static void main(String[] args) {
        Q23Kadai obj = new Q23Kadai();
        obj.setCode("Code");
        System.out.println(obj.getCode());
    }
    void setCode(String c){
        code = c;
    }
    String getCode(){
        return code;
    }
}
