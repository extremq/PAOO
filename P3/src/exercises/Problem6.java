package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());
        System.out.print("m = ");
        m = Integer.parseInt(reader.readLine());

        var A = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = Integer.parseInt(reader.readLine());
            }
        }

        int maxCount = 0;
        for (int i = 0; i < n; ++i) {
            int lineCount = 0;
            for (int j = 0; j < m; ++j) {
                if (A[i][j] != 0)
                    lineCount++;
            }

            maxCount = Integer.max(lineCount, maxCount);
        }

        System.out.println("Most non-zero numbers appear on a line at most " + maxCount + " times.");

    }
}