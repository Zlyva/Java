package Part1;

public class ArraySort {

	public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }

            }

        }
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }        
}