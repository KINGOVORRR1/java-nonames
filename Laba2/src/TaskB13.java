import java.util.Scanner;

public class TaskB13{
    public void main(String[] args) {
        boolean high = false;
        String register = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scan.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (register.indexOf(word.charAt(0)) != -1) {
                high = true;
            }
        }
       System.out.print("Ваша строка начинается с большой буквы: " + high);
    }
}
