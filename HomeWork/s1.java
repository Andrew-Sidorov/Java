// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
package HomeWork;

public class s1 {
    public static void main(String[] args) throws IOException {
        int result = showTotalAmount(5);
    }

    public static int showTotalAmount(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return result;
    }
}
