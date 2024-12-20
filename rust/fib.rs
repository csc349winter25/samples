//! Recursively computes Fibonacci numbers.
//! CSC 349, sample submission

fn main() {
    let n: i32 = std::env::args()
        .nth(1).expect("args")
        .parse::<i32>().expect("parse");

    println!("{}", fib(n));
}

fn fib(n: i32) -> i32 {
    if n < 0 {
        return -1;
    }
    else if n <= 1 {
        return n;
    }
    else {
        return fib(n - 1) + fib(n - 2);
    }
}
