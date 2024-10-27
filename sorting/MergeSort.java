public class MergeSort {
    // mergesort uses twoway merge,
    // need two array for two-way merge.,now we have one array only.so we need
    // divide
    // and conquer. make one array to two array
    // https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Merge-sort-example-300px.gif/220px-Merge-sort-example-300px.gif
    public static void main(String[] args) {
        int[] a = { 8, 6, 4, 3, 2 };// size 7
        // middle=(low+high)/2, 0/6=3 , 0 to 3 is one array
        mergeSort(a, 0, a.length - 1);
    }

    static void mergeSort(int[] a, int l, int h) {
        if (l < h) {
            int m = l + h / 2;// result 2
            // after divide half.
            mergeSort(a, l, m);// [8,6,4]left
            mergeSort(a, m + 1, h);// [3,2]right
        }
    }
}
