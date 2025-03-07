public class SmithNum {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(isSmithNum(n));
    }

    // Method to check if a number is a Smith number
    public static boolean isSmithNum(int n) {
        return sumOfDgt(n) == primeFactorsSum(n);
    }

   

    // Method to find the sum of the prime factors of a number
    public static int primeFactorsSum(int n) {
        int sum = 0;
        // Check for all prime factors starting from 2
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                sum += sumOfDgt(i);  // Add sum of digits of the prime factor  4
                n /= i;  // Divide n by i until it's no longer divisible
            }
        }
        // If n is a prime number greater than 2
        if (n > 1) {
            sum += sumOfDgt(n);
        }
        return sum;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDgt(int n) {//22
        int sum = 0; //
        while (n != 0) {
            sum += n % 10;  // Add the last digit of n to sum   4
            n /= 10;  // Remove the last digit
        }
        return sum;  //4
    }
}
