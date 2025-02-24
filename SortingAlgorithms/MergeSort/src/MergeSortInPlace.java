public class MergeSortInPlace {

    private int[] array;

    public void sort(int[] input) {
        this.array = input;
        mergeSort(0, input.length - 1);
    }

    private void mergeSort(int lower, int upper) {
        if (lower == upper) {
            return;
        } else {
            int mid = (lower + upper) / 2;
            mergeSort(lower, mid);
            mergeSort(mid + 1, upper);
            merge(lower, mid + 1, upper);
        }
    }

    private void merge(int lowerPointer, int upperPointer, int upperBound) {
        int[] tempStorage = new int[upperBound - lowerPointer + 1];
        int mid = upperPointer - 1;
        int lowerBound = lowerPointer;
        int j = 0;

        while (lowerPointer <= mid && upperPointer <= upperBound) {
            if (array[lowerPointer] <= array[upperPointer]) {
                tempStorage[j++] = array[lowerPointer++];
            } else {
                tempStorage[j++] = array[upperPointer++];
            }
        }

        while (lowerPointer <= mid) {
            tempStorage[j++] = array[lowerPointer++];
        }

        while (upperPointer <= upperBound) {
            tempStorage[j++] = array[upperPointer++];
        }

        for (j = 0; j < tempStorage.length; j++) {
            array[lowerBound + j] = tempStorage[j];
        }
    }

    public static void main(String[] args) {
        MergeSortInPlace sorter = new MergeSortInPlace();
        int[] array = {7, 6, 5, 4, 3, 2, 1, 400, 200};

        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Sort the array using in-place MergeSort
        sorter.sort(array);

        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
