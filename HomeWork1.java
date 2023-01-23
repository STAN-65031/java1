// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package home_work_1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int number = Inputnumber();
        System.out.println("Сумма чисел = " + SumТumbers(number));
        System.out.println("произведение чисел = " + ProductTumbers(number));
    }

    private static int SumТumbers(int number) {
        int result = 0;
        for (int i = 1; i < number + 1; i++) {
            result = result + i;
        }
        return result;

    }

    private static int ProductTumbers(int number) {
        int result = 1;
        for (int i = 1; i < number + 1; i++) {
            result = result * i;
        }
        return result;

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
}
