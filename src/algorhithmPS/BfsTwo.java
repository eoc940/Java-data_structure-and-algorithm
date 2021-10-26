package algorhithmPS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 안전영역
public class BfsTwo {
    static int[][] direction = {
            // 좌 우 하 상 {x,y}
            {-1,0},{1,0},{0,-1},{0,1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());

        int[][] area = new int[N][N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            String[] splits = scanner.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                int v = Integer.valueOf(splits[j]);
                area[i][j] = v;
                maxHeight = Math.max(maxHeight, area[i][j]);
            }
        }
        int result = 1;
        for (int limit = 1; limit <= maxHeight; limit++) {
            boolean[][] visited = new boolean[N][N];
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (area[i][j] > limit && !visited[i][j]) {
                        count += 1;
                        //bfs
                        bfs(limit, area, visited, i, j);
                    }
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }

    public static void bfs(int limit, int[][] area, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] coordinate = queue.poll();

            for (int i = 0; i < direction.length; i++) {
                int nX = coordinate[0] + direction[i][0];
                int nY = coordinate[1] + direction[i][1];

                if (nX >= 0 && nY >= 0 && nX < area.length && nY < area.length
                        && area[nX][nY] > limit && !visited[nX][nY]) {
                    queue.add(new int[]{nX, nY});
                    visited[nX][nY] = true;
                }
            }
        }
    }

}
