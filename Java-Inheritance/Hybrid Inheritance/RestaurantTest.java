package javaInheritance;

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " cooks delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Rahul", 30);
        Worker w2 = new Waiter("Amit", 25);

        w1.performDuties();
        w2.performDuties();
    }
}
