class RubberDuck extends Duck {
    RubberDuck() {
        super(new NoFly(), new Squeak(), new Swim());
    }
}
