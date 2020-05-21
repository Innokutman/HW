import java.util.Random;
import java.util.Scanner;
public class MainClass3

{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        do {
        int counter = 0;
        int guess = -1;
        int number = random.nextInt(10);
        while (counter < 3 && guess != number) {
            System.out.print("Угадайте число от 0 до 9: ");
            guess = scanner.nextInt();
            if (guess != number) {
                System.out.println("Ваше число " + (guess < number? "меньше" : "больше"));
                counter++;
           }
        }
        System.out.println("Вы " + (guess == number? "выиграли" : "проиграли, ответ: " + number));
        System.out.println("Повторим? Да - 1, Нет - 0");
        } while (sc.nextInt() == 1);
    }

}



