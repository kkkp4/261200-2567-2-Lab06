public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Cow wagyu = new Cow();
        Owl hedwig = new Owl();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();

//        wagyu.sound();
//        donald.sound();
//        burin.sound();
//        hedwig.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();
    }
}