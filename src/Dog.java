public class Dog extends Pet{


    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Bark-bark", getName());
        System.out.println();
    }

    public void train() {
        System.out.printf("%s squats, lies down and dances.", getName());
        System.out.println();
    }
}
