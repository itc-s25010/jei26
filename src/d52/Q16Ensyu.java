package d52;

public class Q16Ensyu {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal tama = new Cat();
        Horse ao = new Horse();

        animal.bark();
        tama.bark();
        ao.bark();
    }
}

class Animal { // 継承されているクラス(親クラス)
    public void bark() {
        System.out.println("動物");
    }

    public void hello() {
        System.out.println("hello from Animal");
    }
}

    class Cat extends Animal{
        public void bark(){
            System.out.println("にゃーん");
        }
    }

    class Horse extends Animal{
        public void bark(){
            System.out.println("ひひーん");
        }
    }

