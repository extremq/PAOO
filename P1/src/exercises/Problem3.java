package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x, y;

        System.out.print("x = ");
        x = Double.parseDouble(reader.readLine());
        System.out.print("y = ");
        y = Double.parseDouble(reader.readLine());

        if (x >= 0) {
            if (y >= 0) {
                System.out.println("Cadranul I.");
            }
            else {
                System.out.println("Cadranul II.");
            }
        }
        else {
            if (y >= 0) {
                System.out.println("Cadranul III.");
            }
            else {
                System.out.println("Cadranul IV.");
            }
        }
    }
}