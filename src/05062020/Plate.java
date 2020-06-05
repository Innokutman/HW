public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount){
        food -= amount;
        if (food <= amount) {
            food = 0;
            System.out.println("кот не наелся, не забудьте добавить корм!");
        }
    }
    public void refillFood(int amount2) {
        food += amount2;
    }

    public void info(){
        System.out.println("Plate: "+ food);
    }
}
