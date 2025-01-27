class Mother {
    static void show() {
        System.out.println("Hello from Mother class");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Hello from Child class");
    }
}

class Polymorphism {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();

        Child ch = new Child();
        ch.show();

        Mother m1 = new Child();
        m1.show();
    }
}