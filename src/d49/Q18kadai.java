package d49;

public class Q18kadai {
    static void main(String[] args){
        int total = 75;
        int capacity = 30;
        int cargo = 2;

        System.out.println(total / capacity * (double)cargo);
    }
}

/*
total、capacityのどちらかをdouble型にすると小数点以下が切り捨てられないため2.5 * 2 = 5.0になるが
cargoにつければtotal/capacityの小数点以下は切り捨てられ
2 * 2.0 = 4.0になるため
 */