import java.util.Scanner;

public class TaskC14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        try {
            System.out.printf("Введите что то: ");
            s = input.nextLine();
            int number = Integer.parseInt(s); // попытка преобразовать строку в число
            System.out.println("Число: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: строку нельзя преобразовать в число.");
        }

    }
}