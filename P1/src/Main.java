import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import exercises.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ProblemSolver[] problemSolvers = {new Problem1(), new Problem2(), new Problem3(), new Problem4()};

        // Read number
        int problemNumber;
        do {
            System.out.print("Choose problem number (1 - 4): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            problemNumber = Integer.parseInt(reader.readLine());
        } while(problemNumber < 1 || problemNumber > 5);

        problemSolvers[problemNumber - 1].solve();
    }
}