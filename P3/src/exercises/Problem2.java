package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m;

        System.out.print("n = ");
        n = Integer.parseInt(reader.readLine());

        System.out.print("m = ");
        m = Integer.parseInt(reader.readLine());

        var A = new int[n];
        var B = new int[m];
        var intersection = new int[Integer.min(n, m)];

        for (int i = 0; i < A.length; ++i) {
            System.out.print("A[" + i + "] = ");
            A[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < B.length; ++i) {
            System.out.print("B[" + i + "] = ");
            B[i] = Integer.parseInt(reader.readLine());
        }

        int intersection_counter = 0;
        for (int i = 0; i < A.length; ++i) {
            if (!find(A[i], B))
                continue;

            intersection[intersection_counter++] = A[i];
        }

        System.out.println("intersection: ");
        for (int i = 0; i < intersection_counter; ++i) {
            System.out.print(intersection[i] + " ");
        }
    }

    private boolean find(int number, int[] arr) {
        for (int j : arr) {
            if (j == number)
                return true;
        }

        return false;
    }
}