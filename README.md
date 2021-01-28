[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3990809&assignment_repo_type=AssignmentRepo)
# U4L4: Assignment - Loops
Homework Problems for Unit 4

## Primes
In this class you will be completing the `countFactors`, `isPrime`, and `countPrimes` methods.

The `countFactors` method accepts in integer parameter returns the number of factors of the integer.
- `countFactors(24)` returns `8` because 1, 2, 3, 4, 6, 8, 12, and 24 are factors of 24.

The `isPrime` method accepts in integer parameter returns whether an integer is prime or not. The method must call `countFactors`.
- `isPrime(27)` returns `false` and `isPrime(47)` returns `true`.

The `countPrimes` method accepts an integer parameter `n` returns the number of primes from 2 to n. The method must call `isPrime`.

- `countPrimes(24)` returns `9` because 2, 3, 5, 7, 11, 13, 17, 19, 23 are primes less than or equal to 24.
