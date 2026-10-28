public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;

        System.out.println(number + (isPrime(number) ? " is prime." : " is not prime."));
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
