import java.util.Scanner;

public class TaskA7 {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int size;
        size = scan.nextInt();
        System.out.printf("Введите элементы массива: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.printf("Массив в обратном порядке: ");
        for (int j = size-1; j >= 0; j--)
        {
            System.out.print(array[j] + " ");

        }
        scan.close();
    }
}

