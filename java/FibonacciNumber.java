/**
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

import java.util.Optional;

public class FibonacciNumber
{
    private final int value;                      // The value of this number
    private final Optional<FibonacciNumber> prev; // The previous number

    /**
     * Constructs the "n"th Fibonacci number.
     * @param n A non-negative integer
     * @throws FibonacciNumberException If the "n"th number is undefined
     */
    public FibonacciNumber(int n) {
        if (n < 0) {
            throw new FibonacciNumberException(n);
        }
        else if (n == 0) {
            this.prev = Optional.empty();
            this.value = 0;
        }
        else if (n == 1) {
            this.prev = Optional.of(new FibonacciNumber(0));
            this.value = 1;
        }
        else {
            this.prev = Optional.of(new FibonacciNumber(n - 1));
            this.value = prev.get().value + prev.get().prev.get().value;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    private static class FibonacciNumberException extends RuntimeException
    {
        private FibonacciNumberException(int n) {
            super("The Fibonacci number f(" + n + ") is not defined.");
        }
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber(Integer.parseInt(args[0])));
    }
}
