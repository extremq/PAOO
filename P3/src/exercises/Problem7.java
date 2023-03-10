package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem7 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        char character;

        System.out.print("input = ");
        input = reader.readLine();

        System.out.print("character = ");
        character = reader.readLine().charAt(0);

        int count = 0;
        for (char c : input.toCharArray()) {
            if (character == c) {
                ++count;
            }
        }

        System.out.println("Found " + character + " " + count + " times.");
    }
}