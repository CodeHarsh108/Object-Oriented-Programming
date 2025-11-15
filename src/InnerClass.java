
//Member(non static) inner class
class Outer1{
    private int x = 10;
    class Inner1{
        void show(){
            System.out.println(x);
        }
    }
}

//static nested class
class Outer2{
    static class Inner2{
        void show(){
            System.out.println("Hello");
        }
    }
}


//local inner class
class Outer3{
    void display(){
        class Inner3{
            void show(){
                System.out.println("Hello form class inside method");
            }
        }
        Inner3 i = new Inner3();
        i.show();

    }
}

//Anonymous Inner class
interface  Animal{
    void sound();
}


public class InnerClass {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.show();

        Outer2.Inner2 obj = new Outer2.Inner2();
        obj.show();

        Outer3 outer3 = new Outer3();
        outer3.display();

        Animal a = new Animal() {
            @Override
            public void sound() {
                System.out.println("Barks!!");
            }
        };
        a.sound();


    }
}