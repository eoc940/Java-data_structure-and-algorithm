package algorhithmPS;

import java.util.*;

public class BfsOne {

    static int[][] direction = {
            // 좌 우 하 상 {x,y}
            {-1,0},{1,0},{0,-1},{0,1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());

        int[][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0'; // '0' 안써주면 아스키코드 값이 들어감
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    result.add(bfs(N, map, visited, i, j));
                }
            }
        }

        System.out.println(result.size());
        Collections.sort(result);
        result.forEach(i -> System.out.println(i));
    }

    public static int bfs(int N, int[][] map, boolean[][] visited, int x, int y) {
        int size = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] coordinate = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = coordinate[0] + direction[i][0];
                int nY = coordinate[1] + direction[i][1];

                if (nX >= 0 && nX < N && nY >= 0 && nY < N && map[nX][nY] == 1 && !visited[nX][nY]) {
                    queue.add(new int[]{nX, nY});
                    visited[nX][nY] = true;
                    size++;
                }
            }

        }
        return size;
    }
}
