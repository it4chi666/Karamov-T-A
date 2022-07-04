// Определить матрицу (двумерный массив) и ее заполнить случайными значениями. Построить вектор B, который возвращает количество положительных элементов в каждом столбце матрицы
import java.util.Random;
import java.util.Vector;
public class fourth {
    public static void main(String args[]) {
        int h = 7;
        int w = 7;
        int[][] matrix = new int[w][h];
        Vector B = new Vector();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                matrix[i][j] = new Random().nextInt(20) + (-10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < h; i++) {
            B.clear();
            for (int j = 0; j < w; j++) {
                if (matrix[j][i] > 0) {
                    B.add(1);
                }
            }
            System.out.println("Kol-vo polozhitelnih elementov " + (i + 1) + " stolbce: " + B.size());
        }

    }
}
