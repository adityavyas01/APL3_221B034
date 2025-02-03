public class Main {
    public static void main(String[] args) {
        Test test = new Test();          // Create an instance of Test
        test.display();                  // Call the display method on Test
        
        ConcreteTest concreteTest = new ConcreteTest();  // Create an instance of ConcreteTest
        concreteTest.display();                         // Call the display method on ConcreteTest
    }
}
