package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, p;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());
        System.out.print("p = ");
        p = Integer.parseInt(reader.readLine());

        int primeCounter = 0;
        int divisibleByPCounter = 0;
        for (int i = 0; i < n; ++i) {
            n = Integer.parseInt(reader.readLine());

            if (isPrime(n)) {
                primeCounter++;
            }

            if (n % p == 0) {
                divisibleByPCounter++;
            }
        }

        System.out.println("Prime = " + primeCounter);
        System.out.println("Divisible by p = " + divisibleByPCounter);
    }

    private boolean isPrime(int number) {
        if (number % 2 == 0 || number < 2) return false;

        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0)
                return false;
        }

        return true;
    }
}