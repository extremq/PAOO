package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.print("input = ");
        input = reader.readLine();

        String vowels = "aeiouAEIOU";

        int count = 0;
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                ++count;
            }
        }

        System.out.println("Found a vowel " + count + " times.");
    }
}