public class MainClass6 {

    public static void main(String[] args) {


        Animal cat = new Cat("Barsik", "red", 2, 9);
        cat.run(200);
        cat.swim(10);

        Animal dog = new Dog("Bobik", "black", 2);
        dog.run(350);
        dog.swim(9);

        Animal cat2 = new Cat("Boris", "striped black", 5, 4);
        cat2.run(100);
    }

}


