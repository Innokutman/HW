public class Cat {
    private int appetite = 10;
    private int hungry= 15;
    private String name;
    private boolean fullnes = false;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat...");
        plate.decreaseFood(appetite);
//        int eaten = food;
//        hungry -= eaten;
//        if (hungry <= 0) fullnes = true;
//            if (appetite >= hungry) fullnes = true;
    }

}
