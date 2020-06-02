public class Cat extends Animal {
    int liveCount;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

/////////////////////////////////////////////////////// Разброс значений
    int maxRun = 200;
    int rndRun = rndRun(maxRun);

    public static int rndRun(int max)
    {
        return (int) (Math.random() * ++max);
    }

    int maxSwim = 10;
    int rndSwim = rndSwim(maxSwim);

    public static int rndSwim(int max)
    {
        return (int) (Math.random() * ++max);
    }
///////////////////////////////////////////////////////
    @Override
    public void voice() {
        System.out.println(name + " meow!");
    }

    @Override
    public void run(int a) {
        if (a <= rndRun) {System.out.println(name + " runs " + a + " metres");}
            else {System.out.println("Котик не сможет так далеко убежать");}
    }

    @Override
    public void swim(int b) {
        System.out.println("Котики не умеют плавать");
    }

    public int getLiveCount() {
        return liveCount;
    }


    @Override
    public String toString() {
        return "Cat : " +
                "name= '" + name + '\'' +
                ", color= '" + color + '\'' +
                ", age= " + age +
                ", liveCount= " + liveCount
                ;
    }

}

