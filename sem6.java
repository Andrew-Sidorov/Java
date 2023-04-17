// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4,
// 5000, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2,
// 4, 5000, 6, 3}.
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4,
// 5000, 6, 3}.
// Распечатайте содержимое данного множества.

public class seminarr {

    public static void main(String[] args) {
        HashSet<Integer> mySetList = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        LinkedHashSet<Integer> mySet_List_Link = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        TreeSet<Integer> mySet_List_Tree = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.printf("Это Хеш Сэт: %s \n", mySetList);
        System.out.printf("Это Хеш Линк Сэт: %s \n", mySet_List_Link);
        System.out.printf("Это Три Сэт: %s \n", mySet_List_Tree);
    }
}
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
//
//
//
//
//
//
//
//
//
// 1. Напишите метод, который заполнит массив из 110 элементов случайными
// цифрами от 0 до 70.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью
// Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.
Static ArrayList<Integer> myArrayList = new ArrayList<>();
static int len = 110;

public static void main(String[] args) {

getArry();
fund(myArrayList);
System.out.printf("\n %s", myArrayList);
}

public static void getArry() {

Random random = new Random();
for (int i = 0; i < len; i++) {
myArrayList.add(random.nextInt(71));
}

}

public static void fund(ArrayList<Integer> arrayList) {
HashSet<Integer> arraySet = new HashSet<>(arrayList);
System.out.printf("%.2f", Double.valueOf(arraySet.size()) * 100 / arrayList.size());
}

}

//
//
//
///
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
//
//
//
//
//
//
// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
// приложения, которое является
// информационной системой ветеринарной клиники
// class Cat{
// public name - Имя
// public age
// }
// Ещё 3-4 поля
// 3 функции
public class Cat {
    private String name;
    String poroda;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, Integer age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void golos() {
        System.out.println(this.name + " say mur");
    }

    @Override
    public String toString() {
        return name + " <-Имя Возраст-> " + age;
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("Barsik", 3, "saf");
        Cat cat2 = new Cat("Barsik2", 4);
        barsic.golos();
    }
}