import java.util.Arrays;

public class TwoWayMerge {
    public static void main(String[] args) {
        // two sorted array should merge result to be sorted array
        int[] a = { 5, 10, 11, 13 };
        int[] b = { 2, 3, 8, 15, 17, 21 };
        twoWayMerge(a, b);
    }

    static void twoWayMerge(int a[], int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;// i for a array, j for b array, k for c array
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
                // k++;
            } else {
                c[k] = a[i];
                i++;
                // k++;
            }
            k++;
        }

        // while (j < b.length) {
        for (; j < b.length;) {
            c[k] = b[j];
            j++;
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        Arrays.stream(c).forEach(p -> System.out.print(p + ", "));

    }
}
