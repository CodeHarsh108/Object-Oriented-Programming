 class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Student{
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(name + " lives in " + address.city);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address a = new Address("Indore");
        Student s = new Student("Harsh", a);

        s.show();
    }
}
