public class MaxHeapBuilder {

    // 1. The maxHeapify method to correct a single violation
    public static void maxHeapify(int[] A, int heapSize, int i) {
        int l = 2 * i;         // Left child
        int r = 2 * i + 1;     // Right child
        int largest = i;

        if (l <= heapSize && A[l] > A[i]) {
            largest = l;
        }

        if (r <= heapSize && A[r] > A[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            maxHeapify(A, heapSize, largest); 
        }
    }

    // 2. The buildMaxHeap method to process the whole array
    public static void buildMaxHeap(int[] A) {
        int heapSize = A.length - 1; // Ignore the 0th index
        
        // Loop from the last non-leaf node down to index 1
        for (int i = heapSize / 2; i >= 1; i--) {
            maxHeapify(A, heapSize, i);
        }
    }

    // 3. A helper method to print the array, ignoring the 0th index
    public static void printArray(int[] A) {
        System.out.print("[__, ");
        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + (i < A.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // 4. The main method where the program starts executing
    public static void main(String[] args) {
        // The array from your second question, using 0 as a placeholder
        int[] A = {0, 3, 9, 8, 4, 5, 6, 7};
        
        System.out.print("Original Array: ");
        printArray(A);

        // Build the heap
        buildMaxHeap(A);

        System.out.print("Updated Max Heap: ");
        printArray(A);
    }
}

