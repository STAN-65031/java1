// Вывести все простые числа от 1 до 1000

package home_work_1;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int number = Inputnumber();
        FindPrimeNumbers(number);
    }

    private static int Inputnumber() {
        while (true) {
            try {
                Scanner iScanner = new Scanner(System.in);
                System.out.println("Введите число");
                int number = iScanner.nextInt();
                return number;
            } catch (Exception ex) {

                System.out.println("какое то не правильное число!");

            }
        }

    }

    private static void FindPrimeNumbers(int number) {
        boolean isprime;
        for (int i = 2; i < number; i++) {
            isprime = true;
            for (int j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }
    }

}
