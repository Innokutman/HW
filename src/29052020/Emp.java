public class Emp {

    private String FIO;
    private String Rank;
    private String email;
    private String telNumber;
    private int salary;
    private int age;

    public Emp(String FIO, String Rank, String email, String telNumber, int salary, int age) {
        this.FIO = FIO;
        this.Rank = Rank;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(FIO + " " + Rank + " " + email + " " + telNumber + " " + salary + " " + age);
    }
//    public void age40(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            if (age >= 40) {
//                System.out.println(FIO + " " + age);
//            }
//        }
//    }





}




