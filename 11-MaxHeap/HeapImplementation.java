public class HeapImplementation {

    // Method to recursively heapify a subtree with the root at index i
    public static void maxHeapify(int[] A, int heapSize, int i) {
        int left = 2 * i + 1;  // Adjusted for 0-based indexing
        int right = 2 * i + 2; // Adjusted for 0-based indexing
        int largest = i;

        // Check if the left child exists and is greater than the current root
        if (left < heapSize && A[left] > A[i]) {
            largest = left;
        }

        // Check if the right child exists and is greater than the largest found so far
        if (right < heapSize && A[right] > A[largest]) {
            largest = right;
        }

        // If the largest is not the current root, we have a violation
        if (largest != i) {
            // Exchange A[i] with A[largest]
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            // Recursively correct the affected subtree
            maxHeapify(A, heapSize, largest);
        }
    }

    // Method to build a Max Heap from an unsorted array
    public static void buildMaxHeap(int[] A) {
        int heapSize = A.length;
        
        // Non-leaf nodes start at (heapSize / 2) - 1 in a 0-based array
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            maxHeapify(A, heapSize, i);
        }
    }

    public static void main(String[] args) {
        // Unsorted array example
        int[] unsortedArray = {14, 10, 8, 7, 9, 3, 2, 4, 6};
        
        buildMaxHeap(unsortedArray);
        
        System.out.print("Max Heap: ");
        for (int value : unsortedArray) {
            System.out.print(value + " ");
        }
    }
}