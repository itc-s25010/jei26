package d52;

public class Q2{
    static void main(String[] args) {
        Cooker cooker = new Cooker();
        String s = cooker.getSteak();
        System.out.println(s);
    }
}

class Cooking {
    private String name;
    private int time;
    Cooking(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String getName() { return name;}
    public int getTime() { return time;}
}

class Cooker{
    private Cooking c1 = new Cooking("ステーキ", 20);
    private Cooking c2 = new Cooking("ミニサラダ", 10);

    public String getSteak() {return c1.getName(); }
}

class Temper {
    private double temperature;
    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

class Tester {
    public void test() {
        Temper t = new Temper();
        t.getTemperature();
        t.setTemperature(17.2);
    }
}