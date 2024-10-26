public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 2, 8, 22, 7, 1, 90, 30 };

        selectionSort(a);
        for (int i : a)
            System.out.print(i + ", ");

    }

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

    }
}
