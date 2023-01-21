// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)

package home_work_1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        while (true) {
            System.out.println(
                    "нажмите 1 для сложения\n нажмите 2 для вычетания\n нажмите 3 для умножения\n нажмите 4 для деления\n нажмите 0 для завершения");
            
            int number = Inputnumber();
            if (number == 0) {
                break;
            }
            char el = SelectAction(number);
            System.out.println("какое будет первое число?");
            int a = Inputnumber();
            System.out.println("какое будет второе число?");
            int b = Inputnumber();
            PerformsAction(a, b, el);
        }
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

    private static char SelectAction(int num) {

        char result = ' ';
        switch (num) {
            case 1:
                result = '+';
                break;
            case 2:
                result = '-';
                break;
            case 3:
                result = '*';
                break;
            case 4:
                result = '/';
                break;
            default:
                break;

        }
        return result;
    }

    private static void PerformsAction(int a, int b, char el) {
        switch (el) {
            case '+':
                System.out.println("результат сложения = " + (a + b));
                break;
            case '-':
                System.out.println("результат вычетания = " + (a - b));
                break;
            case '*':
                System.out.println("результат умножения = " + a * b);
                break;
            case '/':
                System.out.println("результат деления = " + a / b);
                break;
            default:
                break;
        }

    }
}
