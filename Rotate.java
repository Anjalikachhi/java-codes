
public class Rotate {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int last = arr[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // Move last element to front
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateByOne(arr);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
