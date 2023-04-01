
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
 
        while (true){
            Scanner scanner = new Scanner(System.in);
            String firstNumberLine = scanner.nextLine();
            String mathSymbol = scanner.nextLine();
            String secondNumberLine = scanner.nextLine();
            int firstNumber = Integer.parseInt(firstNumberLine);
            int secondNumber = Integer.parseInt(secondNumberLine);
            int result = 0;
            switch (mathSymbol){
                case "+" :
                    System.out.println(mathSymbol.equals("+"): firstNumber + secondNumber);
                    result = firstNumber + secondNumber ;
                break;
                case "-" :
                    System.out.println("-");
                result = firstNumber - secondNumber;
                break;
                case "*" :
                    System.out.println("*");
                result = firstNumber * secondNumber;
                break;
                case "/" :
                    System.out.println("/");
                result = firstNumber / secondNumber;
                break;
            }
}
    }
}
