import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskC9 {
    public static void main(String[] args) {
        System.out.println("Калькулятор для делений");
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double result;
        boolean process = true;
        while (process) {
            try {
                System.out.printf("Введите первое значение: ");
                firstNumber = input.nextDouble();
                System.out.printf("Введите второе значение: ");
                secondNumber = input.nextDouble();
                if (secondNumber == 0) {
                    throw new ArithmeticException("Ошибка деления, деление на ноль запрещено. Повторите ввод!");
                }
                result = firstNumber / secondNumber;
                System.out.println("Ваше значение: " + result);
                process = false;
                input.close();
            }
            catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            catch (InputMismatchException i) {
                System.out.println("Ошибка: Некорректный ввод! Повторите действие.");
                input.nextLine();
            }
        }

    }
}
