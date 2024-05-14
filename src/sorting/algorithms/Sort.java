package sorting.algorithms;

public class Sort {

    public static void main(String[] args) {

        int arr[] = {65, 78, 34, 22, 11, 67, 2, 89, 10, 48, 30, 20, 1, 8, 56};
        Sort sort = new Sort();

        //Print un-sorted array.
        System.out.print("The un-sorted array is: ");
        sort.printArray(arr);

        //Executing Selection sort on un-sorted array
        //SelectionSort selectionSort = new SelectionSort();
        //selectionSort.executeSort(arr);

        //Executing Bubble sort on un-sorted array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.executeSort(arr);

        //Print sorted array.
        System.out.print("The sorted array post executing sorting algorithm is: ");
        sort.printArray(arr);

    }

    private void printArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

}
