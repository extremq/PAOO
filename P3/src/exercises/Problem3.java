package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());

        var A = new int[n];

        for (int i = 0; i < A.length; ++i) {
            System.out.print("A[" + i + "] = ");
            A[i] = Integer.parseInt(reader.readLine());

            if (i > 0 && A[i] < A[i - 1]) {
                System.out.println("Not sorted.");

                return;
            }
        }

        System.out.println("Sorted.");
    }
}