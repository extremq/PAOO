import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import exercises.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ProblemSolver[] problemSolvers = {
                // Vector
                new Problem1(),
                new Problem2(),
                new Problem3(),
                // Matrix
                new Problem4(),
                new Problem5(),
                new Problem6(),
                // String
                new Problem7(),
                new Problem8(),
                new Problem9(),
                // File
                new Problem10(),
                new Problem11(),
        };

        // Read number
        int problemNumber;
        do {
            System.out.print("Choose problem number (1 - " + problemSolvers.length + "): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            problemNumber = Integer.parseInt(reader.readLine());
        } while(problemNumber < 1 || problemNumber > problemSolvers.length);

        problemSolvers[problemNumber - 1].solve();
    }
}