package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m, x;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());
        System.out.print("m = ");
        m = Integer.parseInt(reader.readLine());
        System.out.print("x = ");
        x = Integer.parseInt(reader.readLine());

        var A = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = Integer.parseInt(reader.readLine());
            }
        }

        int count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (A[i][j] == x)
                    count++;
            }
        }

        System.out.println("X appears " + count + " times.");

    }
}