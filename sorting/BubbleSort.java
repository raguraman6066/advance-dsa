import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 10, 1 };
        for (int i : a) {
            System.err.print(i + ", ");

        }
        System.out.println();
        BubbleSort(a);
        System.out.println("after sorted");
        System.out.println(Arrays.toString(a));
    }

    public static void BubbleSort(int[] a) {
        boolean isSorted = true;
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    // if array sorted it is not entering into this block
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (isSorted) {
                System.out.println("array already sorted");
                break;
            }
        }

    }
}
