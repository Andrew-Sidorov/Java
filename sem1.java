// // import java.util.Scanner;

// // public class sem1 {
// // public static void main(String[] args) {
// // System.out.println("Hello");
// // Scanner sc = new Scanner(System.in);
// // String name = sc.nextLine();
// // int age = sc.nextInt();
// // System.out.println(age);
// // System.out.println(name);
// // sc.close();

// // }
// // }
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
//
// // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
// // количество подряд идущих 1.

// // import java.util.Scanner;

// // public class sem1 {
// // public static void main(String[] args) {
// // int[] arr = { 1, 1, 0, 1, 1, 1 };
// // int count = 0;
// // int max = 0;
// // for (int i = 0; i < arr.length; i++) {
// // if (arr[i] == 1) {
// // count++;
// // if (count > max) {
// // max = count;
// // }
// // } else {
// // count = 0;
// // }

// // }
// // System.out.println("вывести максимальное количество подряд идущих 1:" + max);
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
//
// // }
// // }
// Дан массив nums = [1,3,2,4,3,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.
// решить нужно без использования дополнительного массива, а только перестановкой элементов.
// [1,2,4,5,3,3,3,3]

public class sem1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 2, 4, 3, 5, 3, 3 };
        int val = 3;
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                }

            }
        }
        for (int i : nums) {
            System.out.printf("%d, ", i);

        }
    }

    }

    //
    //
    //
    //
    // Analog Prepodavatelya
    int[] arr = new int[] { 1, 3, 3, 2, 4, 3, 5, 3, 3 };
    int val = 3;
int count = 0;

    for(
    int i = 0;i<arr.length;i++)if(arr[i]!=3)
    {
        arr[count++] = arr[i];
    }

    while(count<arr.length)arr[count++]=3;for(
    int i:arr)
    {
System.out.println(i);
}