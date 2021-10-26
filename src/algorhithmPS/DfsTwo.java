package algorhithmPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DfsTwo {

    static boolean found = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int N = Integer.valueOf(s.split(" ")[0]);
        int M = Integer.valueOf(s.split(" ")[1]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(i, new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            s = scanner.nextLine();

            int a = Integer.valueOf(s.split(" ")[0]);
            int b = Integer.valueOf(s.split(" ")[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {

            dfs(1, i, visited, graph, N);
            if (found) {
                System.out.println(1);
                return;
            }

        }
        System.out.println(0);


    }

    static void dfs(int depth, int v, boolean[] visited, List<List<Integer>> graph, int N) {
        if (depth == N) {
            found = true;
            return;
        }
        visited[v] = true;

        for (int vertex : graph.get(v)) {
            if (!visited[vertex]) {

                dfs(depth+1, vertex, visited, graph, N);
            }
        }
        visited[v] = false;

    }
}
