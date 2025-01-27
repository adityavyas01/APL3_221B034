class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

class Overriding {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();

        Child ch = new Child();
        ch.show();
    }
}
