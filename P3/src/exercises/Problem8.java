package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        char character;

        System.out.print("input = ");
        input = reader.readLine();

        System.out.print("character = ");
        character = reader.readLine().charAt(0);

        input = input.replaceAll(character + "", "*");

        System.out.println("Replaced string: " + input);
    }
}