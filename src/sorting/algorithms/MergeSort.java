package sorting.algorithms;

public class MergeSort implements Sorting {

    /*
    Merge sort is a sorting algorithm that follows the divide-and-conquer approach.
    It works by recursively dividing the input array into smaller sub-arrays and sorting those sub-arrays then merging them back together to obtain the sorted array.
    Stable but not in-place
    Time complexity - O(N logN) for all cases
    Space complexity - O(N)
     */
    @Override
    public void executeSort(int[] arr) {
        executeMergeSort(arr, 0, arr.length - 1);
    }

    private void executeMergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            executeMergeSort(arr, left, middle);
            executeMergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int lengthOfFirstHalf = middle - left + 1;
        int lengthOfSecondHalf = right - middle;
        int firstHalfArray[] = new int[lengthOfFirstHalf];
        int secondHalfArray[] = new int[lengthOfSecondHalf];

        for (int index = 0; index < lengthOfFirstHalf; index++) {
            firstHalfArray[index] = arr[left + index];
        }

        for (int index = 0; index < lengthOfSecondHalf; index++) {
            secondHalfArray[index] = arr[middle + index + 1];
        }

        int indexOfFirstHalf = 0, indexOfSecondHalf = 0, indexOfOriginalArray = left;

        while (indexOfFirstHalf < lengthOfFirstHalf && indexOfSecondHalf < lengthOfSecondHalf) {
            if (firstHalfArray[indexOfFirstHalf] <= secondHalfArray[indexOfSecondHalf]) {
                arr[indexOfOriginalArray] = firstHalfArray[indexOfFirstHalf];
                indexOfFirstHalf++;
            } else {
                arr[indexOfOriginalArray] = secondHalfArray[indexOfSecondHalf];
                indexOfSecondHalf++;
            }
            indexOfOriginalArray++;
        }

        while (indexOfFirstHalf < lengthOfFirstHalf) {
            arr[indexOfOriginalArray] = firstHalfArray[indexOfFirstHalf];
            indexOfFirstHalf++;
            indexOfOriginalArray++;
        }

        while (indexOfSecondHalf < lengthOfSecondHalf) {
            arr[indexOfOriginalArray] = secondHalfArray[indexOfSecondHalf];
            indexOfSecondHalf++;
            indexOfOriginalArray++;
        }
    }

}
