package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 백준 배열 합치기
public class array_combine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            B.add(scanner.nextInt());
        }
        //A.forEach(e -> System.out.println(e + " "));
        //B.forEach(e -> System.out.println(e + " "));

        // logic
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < N && j < M) {
            int a = A.get(i);
            int b = B.get(j);

            if (a > b) {
                result.add(b);
                j++;
            } else {
                result.add(a);
                i++;
            }
        }

        for (; i < N; i++) {
            result.add(A.get(i));
        }
        for (; j < M; j++) {
            result.add(B.get(j));
        }

        // output
        StringBuilder sb = new StringBuilder();
        for (int e : result) {
            sb.append(e + " ");
        }
        System.out.println(sb.toString());
    }

}
