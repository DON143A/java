public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int shift = 0;

        // Count the number of zeros
        for (int num : arr) {
            if (num == 0) {
                shift++;
            }
        }

        // Start from the end and shift elements
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (i + shift < n) {
                    arr[i + shift] = 0;
                }
                shift--;
            }
            if (i + shift < n) {
                arr[i + shift] = arr[i];
            }
        }
    }
}