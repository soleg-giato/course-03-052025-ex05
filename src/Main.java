public class Main {

    /**
     * author: Shchukin FN
     * date: 2025.04.24
     * task: lesson 05-01 (07)
     * Задача выложена в виде картинки
     * Показать на примере двух дочерних классов основные принципы ООП
     */

    public static void main(String[] args) {

        Pet dog = new Dog("Iosif", 3);
        Pet fish = new Fish();
        Pet turtle = new Turtle("Тартилла");

        System.out.println("Dog =================");
        dog.weight = 17;
        dog.speak();
        dog.walk();

        System.out.println("Fish =================");
        fish.speak();
        fish.walk();

        System.out.println("Turtle =================");
        turtle.speak();
        turtle.walk();

    }
}