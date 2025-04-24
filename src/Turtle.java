public class Turtle extends Pet {



    public Turtle(String name) {
        super(name, 1000);
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: ......", getName());
        System.out.println();
    }
}
