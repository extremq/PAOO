package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());

        var v = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("v[" + i + "] = ");
            v[i] = Integer.parseInt(reader.readLine());
        }

        int min = v[0];
        for (int i = 1; i < n; ++i) {
            min = Integer.min(v[i], min);
        }

        System.out.println("Min = " + min);
    }
}