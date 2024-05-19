package sorting.algorithms;

public class InsertionSort implements Sorting {

        /*
        The algorithm works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
        Time complexity - O(N^2) for average, worst case. O(N) for best case.
       Auxiliary Space - O(1)
       Stable and In-place sort
       (N-1) passes
     */
    @Override
    public void executeSort(int[] arr) {
        for (int indexOuter = 1; indexOuter < arr.length; indexOuter++) {
            int key = arr[indexOuter];
            int indexInner = indexOuter - 1;
            for (; indexInner >= 0 && arr[indexInner] > key; ) {
                arr[indexInner + 1] = arr[indexInner];
                indexInner--;
            }
            arr[indexInner + 1] = key;
        }
    }

}
