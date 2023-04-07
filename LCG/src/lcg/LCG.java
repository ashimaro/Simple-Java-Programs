
package lcg;

/**
 *
 * @author Ashi
 */
public class LCG {

   static class Lcg {
        private final long modulus;
        private final int multiplier;
        private final int increment;
        private long seed;

        public Lcg(long modulus, int multiplier, int increment, long seed) {
            this.modulus = modulus;
            this.multiplier = multiplier;
            this.increment = increment;
            this.seed = seed;
        }

        public long next() {
            // Y = (a.X + c) mod m
            long val = (multiplier * seed) + increment;
            seed = val % modulus;
            return seed;
        }
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimesUntil(int n) {
        Lcg lcg = new Lcg(65536, 137, 1, 0);

        int count = 0;
        long num = -1;
        for (int i = 0; i < n; i++) {
            num = lcg.next();
            while (!isPrime(num)) {
                num = lcg.next();
            }
            System.out.print(num + ", ");
        }
        System.out.println();

        long nthPrime = findNthPrime(n);
        System.out.println("The " + n + "th prime number is " + nthPrime);
    }

    public static long findNthPrime(int n) {
        Lcg lcg = new Lcg(65536, 137, 1, 0);

        int count = 0;
        long num = -1;
        while (count < n) {
            num = lcg.next();
            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        printPrimesUntil(100);
    }
}
