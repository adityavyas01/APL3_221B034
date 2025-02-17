class LakeDuck extends Duck {
    LakeDuck() {
        super(new FlyWithWings(), new QuackLoudly(), new Swim());
    }
}
