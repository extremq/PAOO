package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;

        System.out.print("a = ");
        a = Double.parseDouble(reader.readLine());
        System.out.print("b = ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("c = ");
        c = Double.parseDouble(reader.readLine());

        double semiperimeter = (a + b + c) / 2;
        double area = Math.sqrt(
                semiperimeter *
                        (semiperimeter - a) *
                        (semiperimeter - b) *
                        (semiperimeter - c)
        );

        System.out.println("Area = " + area);
    }
}
