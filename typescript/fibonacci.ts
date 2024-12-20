/**
 * Recursively computes Fibonacci numbers.
 * CSC 349, sample submission
 */

/**
 * Computes Fibonacci numbers.
 * @param n - A non-negative integer
 * @returns The `n`th number, or -1 if it is undefined
 */
function fib(n: number): number {
  if (n < 0) {
    return -1;
  }
  else if (n == 0 || n == 1) {
    return n;
  }
  else {
    return fib(n - 1) + fib(n - 2);
  }
}

console.log(fib(parseInt(process.argv[2])));
