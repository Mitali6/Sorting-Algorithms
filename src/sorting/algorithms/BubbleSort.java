package sorting.algorithms;

public class BubbleSort implements Sorting {

    /*
        This algorithm works by repeatedly swapping the adjacent elements if they are in the wrong order.
        In Bubble Sort algorithm, traverse from left and compare adjacent elements such that the higher one is placed at right side.
        In this way, the largest element is moved to the rightmost end at first.
        This process is then continued to find the second largest and place it and so on until the data is sorted.
        (N-1) passes
        (N*(N-1))/2 comparisons
        Auxiliary Space - O(1)
        Time complexity - O(N^2) for worst and average case. O(N) for best case (already sorted array)
     */
    @Override
    public void executeSort(int[] arr) {
        for (int indexOuter = 0; indexOuter < arr.length; indexOuter++) {
            Boolean swapped = false;
            for (int indexInner = 0; indexInner < arr.length - indexOuter - 1; indexInner++) {
                if(arr[indexInner] > arr[indexInner+1]) {
                    swap(arr, indexInner, indexInner+1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

}
