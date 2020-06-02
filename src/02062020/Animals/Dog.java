public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

/////////////////////////////////////////////////////// Разброс значений
    int maxRun = 500; // Разброс значений
    int rndRun = rnd(maxRun);

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

    int maxSwim = 10; // Разброс значений
    int rndSwim = rnd(maxSwim);

    public static int rndSwim(int max)
    {
        return (int) (Math.random() * ++max);
    }
///////////////////////////////////////////////////////
    @Override
    public void voice() {
        System.out.println(name + " gav gav!");
    }

    @Override
    public void run(int a) {
        if (a <= 500) {System.out.println(name + " runs " + a + " metres");}
        else {System.out.println("Этот пёсик столько не пробежит");
    }
    }
    @Override
    public void swim(int b) {
        if (b <= 10) {System.out.println(name + " swims " + b + " metres");}
        else {System.out.println("Пёсик столько не проплывёт");}
    }

}
