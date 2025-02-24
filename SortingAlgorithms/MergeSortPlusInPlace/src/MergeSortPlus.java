public class MergeSortPlus {

    public static void mergeSortPlus(int[] array, int left, int right) {
        if (right - left <= 20) {
            insertionSort(array, left, right);
        } else {
            if (left < right) {
                int mid = (left + right) / 2;

                // Recursively sort each half
                mergeSortPlus(array, left, mid);
                mergeSortPlus(array, mid + 1, right);

                // Merge the two halves back together
                merge(array, left, mid, right);
            }
        }
    }

    // InsertionSort function to sort small subarrays
    public static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // In-place merge function that combines two sorted subarrays into one
    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge elements from the two halves in sorted order
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // Copy any remaining elements from the right half
        while (j <= right) {
            temp[k++] = array[j++];
        }

        // Copy the merged elements back into the original array
        for (k = 0; k < temp.length; k++) {
            array[left + k] = temp[k];
        }
    }

    // Main method to test the MergeSortPlus implementation
    public static void main(String[] args) {
        int[] array = {700, 6, 5, 40, 3, 2, 1, 10000};

        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Sort the array using MergeSortPlus
        mergeSortPlus(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
