// Дан массив b (n). Переписать в массив C (n) положительные элементы массива b (n) умноженные на 5
import java.util.Random;
public class Focus {
    public static void main(String[] args) {

        int m=10;
        int[] b = new int [m];

        for (int i = 0; i < b.length; i++) {
            b[i] = new Random().nextInt(40) + (-20);
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        int new_size = 0;
        for (int k : b) {
            if (k > 0) {
                new_size++;
            }
        }
        int[] new_b = new int[new_size];
        m = 0;
        for (int j : b) {
            if (j > 0) {
                new_b[m] = j * 5;
                System.out.print(new_b[m] + " ");
                m++;
            }
        }

    }
}