package dp;

import java.util.Arrays;
import java.util.Scanner;

public class LongestArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = scanner.nextInt();
        }

        int[] memo = new int[N];
        Arrays.fill(memo, 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i]) {
                    memo[i] = Math.max(memo[j] + 1, memo[i]);
                }
            }
        }
        int result = Arrays.stream(memo).max().getAsInt();
        System.out.println(result);
    }
}
