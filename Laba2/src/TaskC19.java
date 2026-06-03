import java.util.Scanner;

public class TaskC19 {
    public static void main(String[] args) {
        String nameCheck = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        Scanner scan = new Scanner(System.in);
        System.out.println("Форма регистрации");
        while (true) {
            try {
                System.out.print("Введите имя: ");
                String firstName = scan.nextLine();
                for (int i = 0; i < firstName.length(); i++) {
                    if (nameCheck.indexOf(firstName.charAt(i)) == -1) {
                        throw new IllegalArgumentException("Имя не должно содержать цифры!");
                    }
                }
                System.out.print("ведите фамилию: ");
                String lastName = scan.nextLine();
                for (int i = 0; i < lastName.length(); i++) {
                    if (nameCheck.indexOf(lastName.charAt(i)) == -1) {
                        throw new IllegalArgumentException("фамилия не должна содержать цифры!");
                    }
                }
                System.out.print("введите почту: ");
                String email = scan.nextLine();

                System.out.println("регистрация прошла успешно!");
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("некорректный ввод: " + e.getMessage());
            }
        }
        scan.close();
        System.out.print("ввод закрыт");

    }
}
