public class Animal {
        String name;
        String color;
        int age;
        final int LEG_COUNT = 4;

        public Animal(String name) {
            this.name = name;
        }

        public Animal() {
        }

        public Animal(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public void info() {
            System.out.println(name + " " + color + " " + age);
        }

        public void run(int a) {
            System.out.println(name + " runs " + a + " metres");
        }

        public void swim(int b) {
            System.out.println(name + " swims " + b + " metres");
        }

        public void voice() {
            System.out.println("Animal " + name + " voice...");
        }

//    public abstract void voice();


        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

