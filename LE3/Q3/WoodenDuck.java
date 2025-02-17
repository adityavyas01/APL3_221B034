class WoodenDuck extends Duck {
    WoodenDuck() {
        super(new NoFly(), new MuteQuack(), new Swim());
    }
}
