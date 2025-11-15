class Heart{
    void beat(){
        System.out.println("Heart is beating...");
    }
}

class Human{
    private Heart heart;
    Human(){
        heart  = new Heart();
    }
    void show(){
        heart.beat();
    }
}


public class Composition {
    public static void main(String[] args) {
        Human h = new Human();
        h.show();
    }
}
