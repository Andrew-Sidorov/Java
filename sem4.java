
//1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
public class sem4 {

import java.util.ArrayList;
import java.util.LinkedList;

// // 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// // 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
// Сравните с предыдущим.

// public static void main(String[] args) {
// ArrayList<Integer> arrList = new ArrayList<>();
// long startA = System.currentTimeMillis();
// for (int i = 0; i < 1_000_000; i++) {
// arrList.add(0, i);
// }
// long stopA = System.currentTimeMillis();
// System.out.println(stopA - startA);

// LinkedList<Integer> linkedList = new LinkedList<>();
// long startB = System.currentTimeMillis();
// for (int i = 0; i < 1_000_000; i++) {
// linkedList.add(0, i);
// }
// long stopB = System.currentTimeMillis();
// System.out.println(stopB - startB);
// }
// }
//
//
//
//
//
//
//
//
// /
// /
// /
/// /
// /
// /
// /
// /
// /
// /
// /
// /
// /
// /
// /Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text
// сохранить text в связный список.
// Если введено print~num, выводит строку из позиции num в связном списке и
// удаляет её из списка.
// Работать до тех пор, пока не введен stop
// asd
// [asd]
// cvbn
// [asd, cvbn]
// g
// [asd, cvbn, g]
// print~1
// cvbn
// [asd,g]
//
//
//
//
//
/////
//
//
//
//
//
//
//
//
//
//
//
///
///
//
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой
// в списке, а первая - последней.
// asd
// zxc
// qwe
// print
// qwe
// zxc
// asd
// []

public class ThirdTask {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (true) {
            System.out.println("Enter the string:");
            str = sc.nextLine();
            if (str.equals("print")) {
                while (!dq.isEmpty())
                    System.out.println(dq.removeLast());
                break;
            } else {
                dq.add(str);
            }
        }
        sc.close();
    }
}