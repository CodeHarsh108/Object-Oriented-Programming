class Parent{
    int x = 100;

    Parent(){
        System.out.println("Parent Constructor called");
    }

    void show(){
        System.out.println("Parent show() called");
    }
}

class Child extends Parent{
    int x = 200;
    Child(){
        super();
        System.out.println("Child Constructor called");
    }
     void display(){
         System.out.println("Child : " + x);
         System.out.println("Parent : " + super.x);
         super.show();
     }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
