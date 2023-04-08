
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sem3_3 {
    public static void main(String args[]) throws InterruptedException {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Введите 2 числа");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        } else {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }
        int max = Math.max(a, b);
        System.out.printf("Maximum value of %d and %d using Math.max() is %d %n", a, b, max);
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        if (x < y) {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
        } else {
            System.out.printf("Between %d and %d, Minimum is %d %n", x, y, y);
        }

        int min = Math.min(x, y);
        System.out.printf("Maximum value of %d and %d using Math.min() is %d %n", x, y, min);
    }
}
