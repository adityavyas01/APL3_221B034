public class Main {
    public static void main(String[] args) {
        Beverage b = new Whiskey();  b.templateMethod(30);
        Beverage b2 = new Beer();    b2.templateMethod(50);
        Beverage b3 = new Vodka();   b3.templateMethod(40);
        Beverage b4 = new Wine();    b4.templateMethod(60);
        Beverage b5 = new Rum();    b5.templateMethod(30);
    }
}
