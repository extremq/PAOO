package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        System.out.print("a = ");
        a = Integer.parseInt(reader.readLine());
        System.out.print("b = ");
        b = Integer.parseInt(reader.readLine());
        System.out.print("c = ");
        c = Integer.parseInt(reader.readLine());

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle.");
        }
        else {
            System.out.println("Not a triangle.");
        }
    }
}
