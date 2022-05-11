//Определить матрицу(двумерный массив) и её заполнить случайными значениями. Построить вектор B который возвращает количество положительных элементов в каждом столбце матрицы.
import java.util.*;
public class 3 {
    public static void main (String[] args) {
        int[][] mas = { {1, 3, 6, 8, 10}, {-6, 2, -1, -4, 1}, {1, 43, 3, 1, 4},
                {1, -10, -6, 6, 7}, {-2, 4, -5, 7, -9}};
        Vector v = new Vector(5);
        for (int j = 0; j < 5; j++) {
            int k = 0;
            for (int i = 0; i < 5; i++) {
                if (mas[i][j]>0) {
                    k++;
                }
            }
            v.add(j, k);
        }
        for(int i = 0; i < 5; i++)
            System.out.print(v.get(i) + " ");
    }
}