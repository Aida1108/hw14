public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 0;
        int nowYear = 2022;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while (year <= finishYear) {
            if (year >= startYear) {
                System.out.println(+year);
            }
            year += period;
        }
        // Задание 2
        System.out.println("Задание 2");
        int b = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(b + " * " + i + " = " + (i * b));
        }


    }
}