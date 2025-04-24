public class Fish extends Pet{



    @Override
    public void speak() {
        System.out.printf("%s speak:`0oOoooo..", getName());
        System.out.println();
    }

    @Override
    public void walk() {
        System.out.printf("My fish %s left the aquarium for cleaning.", getName());
        System.out.println();
    }
}
