public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int shift = 0;

        
        for (int num : arr) {
            if (num == 0) {
                shift++;
            }
        }

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
