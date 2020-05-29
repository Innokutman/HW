import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass5 {

    public static void main(String[] args) {
        Emp[] Employees = new Emp[5];
        Employees[0] = new Emp("Ivanov Ivan", "Baker", "ivivan@mail.ru", "892312312", 50000, 41);
        Employees[1] = new Emp("Petrov Ivan", "Barmen", "peivan@mail.ru", "892312312", 20000, 25);
        Employees[2] = new Emp("Ivanov Petr", "Driver", "ivpetr@mail.ru", "892312312", 10000, 55);
        Employees[3] = new Emp("Petrov Petr", "Policeman", "pepetr@mail.ru", "892312312", 400000, 35);
        Employees[4] = new Emp("Mashina Masha", "Developer", "masma@mail.ru", "892312312", 30000, 60);

        //Employees[2].info();
        //Emp[].age40(); - не могу сделать вызов метода
    }


}