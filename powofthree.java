public class PowerOfThreeChecker {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); 
        System.out.println(isPowerOfThree(12)); 
    }

    static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}