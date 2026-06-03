import java.util.Scanner;

public class TaskA17 {
    void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] array;
        int arraySize = 0;
        System.out.print("Введите размер массива: ");
        arraySize = scan.nextInt();
        array = new int[arraySize];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
            if (array[i] == 0) {
                count++;
            }
        }
        System.out.print("Нулевых элементов в массиве: " + count);
        scan.close();
    }
}