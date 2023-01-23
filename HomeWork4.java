//*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 24 45 //24 + 45 = 69 (n=2)

package home_work_1;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = GeneratesEquation();
        SolvesEquation(arr);

    }

    public static int[] GeneratesEquation() {
        int[] arr = new int[3];
        int random_a = 0 + (int) (Math.random() * 10);
        int random_b = 0 + (int) (Math.random() * 10);
        int random_c = 10 + (int) (Math.random() * 100);
        System.out.println("Задано уравнение " + random_a + "? + ?" + random_b + " = " + random_c);
        arr[0] = random_a;
        arr[1] = random_b;
        arr[2] = random_c;
        return arr;
    }

    public static void SolvesEquation(int[] arr) {
        String num_a = Integer.toString(arr[0]);
        String num_b = Integer.toString(arr[1]);
        int num_c = arr[2];
        boolean isOkey = false;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(num_a + "" + Integer.toString(i));
            int b = Integer.parseInt(Integer.toString(i) + "" + num_b);

            if (a + b == num_c) {
                isOkey = true;
                result = i;
            }
        }
        if (isOkey)
            System.out.println("Решением уровнения будет " + result);
        else
            System.out.println("У этого вырежения нет решения(");
    }
}
