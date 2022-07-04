//Дан массив x(n). Переписать в массив y(n) элементы массива x, большие 3.(со сжатием, без пустых элементов внутри).
//Затем упорядочть методом "выбора и перестановки" по возрастанию новый массив.
public class second {
    public static void main(String[] args) {
        int nn = 0;
        int n = 10;
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * 10);
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            int max = x[i];
            int max1 = i;
            for (int j = i+1; j < x.length; j++) {
                if (x[j] > max) {
                    max = x[j];
                    max1 = j;
                }
            }
            if (i != max1) {
                int tmp = x[i];
                x[i] = x[max1];
                x[max1] = tmp;
            }
        }
        int[] y = new int[n];
        for (int i = 0; i < y.length; i++) {
            if (x[i]>3)
                y[i]=x[i];
            if (y[i] != 0)
                nn = nn + 1;
        }

        int[] array = new int[nn];
        for (int i = 0; i < array.length; i++) {
            array[i] = y[i];
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
            System.out.print(array[i]+" ");

        }
    }
}
