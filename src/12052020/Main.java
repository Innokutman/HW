//Задание 1
public class Main
//Задание 2
{
    public static void main(String[] args) {
        System.out.println("Результат = " + calculate(1, 2, 3, 6));
        System.out.println(task10and20(5, 1));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(-15));
        greetings("Kesha");
        leapYear(2100);
        byte a = -10;
        short b = 500;
        int c = 5000;
        long d = 100000L;
        float e = 16.17f;
        double f = 16.17;
        char g = '$';
        boolean h = false;
        System.out.println("Значение переменной byte " + a);
        System.out.println("Значение переменной short " + b);
        System.out.println("Значение переменной int " + c);
        System.out.println("Значение переменной long " + d);
        System.out.println("Значение переменной float " + e);
        System.out.println("Значение переменной double " + f);
        System.out.println("Значение переменной char " + g);
        System.out.println("Значение переменной boolean " + h);
    }
    //Задание 3
    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }
//Задание 4

    public static boolean task10and20(int x1, int x2){
        if (10 <= (x1 + x2) && (x1 + x2) <= 20){
            return true;
        }else {
            return false;

        }
    }
    //Задание 5
    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
//Задание 6                                                               

    public static boolean isNegative(int x){
        if (x < 0){
            return true;
        }else {
            return false;

        }
    }
    //Задание 7
    public static void greetings(String name){
        System.out.println("Привет, " + name);
    }
//Задание 8   (Можно ещё сделать через if и then, но мне решение показалось очень громоздким в сравнении с логиечским)

    public static void leapYear(int x){
        if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }

    }

}