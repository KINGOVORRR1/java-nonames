import java.util.Scanner;

public class TaskB1 {
    public void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = scan.nextLine();
        System.out.println("Длина вашей строки: " + str.length());
    }
}
