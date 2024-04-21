package sorting.algorithms;

    /*
       The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part.
       This process is repeated for the remaining unsorted portion until the entire list is sorted.
       Time complexity - O(N^2) for best, average, worst case.
       Auxiliary Space - O(1)
       Unstable and In-place sort
   */
public class SelectionSort implements Sorting {

    @Override
    public void executeSort(int[] arr) {
        for (int indexOuter = 0; indexOuter < arr.length; indexOuter++) {
            int minIndex = indexOuter;
            for (int indexInner = indexOuter + 1; indexInner < arr.length; indexInner++) {
                if (arr[indexInner] < arr[minIndex]) {
                    minIndex = indexInner;
                }
            }
            swap(arr, indexOuter, minIndex);
        }
    }

}
