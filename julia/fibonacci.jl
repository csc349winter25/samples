# Recursively computes Fibonacci numbers.
# CSC 349, sample submission

f(n) = n < 0 ? -1 : n <= 1 ? n : f(n - 1) + f(n - 2)
println(f(parse(Int, ARGS[1])))
