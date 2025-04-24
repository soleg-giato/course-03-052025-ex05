public abstract class Pet {

    private String name;
    protected int age;
    public int weight;

    public Pet() {
        this.name = "Dodo";
        this.age = 1;
        this.weight = 1;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public abstract void speak();

    public void walk() {
        System.out.println("Pet walks across the room.");
    }
}
