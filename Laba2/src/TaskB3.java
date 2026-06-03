import java.util.Scanner;

 class TaskB3 {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String str = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        System.out.print("Введите слово: ");
        String word = scan.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (str.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println(count);

    }
}
