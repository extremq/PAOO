package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Problem11 implements ProblemSolver {
    @Override
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File myObj = new File("file.txt");

        Scanner myReader = new Scanner(myObj);

        int n;
        if (myReader.hasNextLine()) {
            n = Integer.parseInt(myReader.nextLine());
        }

        int sum = 0;
        if (myReader.hasNextLine()) {
            sum = Arrays.stream(myReader.nextLine().split(" +"))
                    .map(word -> Integer.parseInt(word))
                    .reduce(0, (current, next) -> current + next);
        }

        System.out.println("Suma este " + sum);

        myReader.close();
    }
}