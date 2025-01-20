public class Main {
    private String name;
    private int speed;

    public static void main(String[] args) {
        Main ob = new Main();
        ob.setName("HONDA");
        ob.setspeed(100);
        System.out.println("Name: " + ob.getName());
        System.out.println("Number: " + ob.getspeed());

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getspeed() {
        return speed;
    }
}
