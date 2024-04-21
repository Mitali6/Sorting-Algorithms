package sorting.algorithms;

interface Sorting {

    void executeSort(int arr[]);

    default void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
