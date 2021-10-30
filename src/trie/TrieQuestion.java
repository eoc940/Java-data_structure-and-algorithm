package trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrieQuestion {

    static class Trie {
        Trie[] node;
        boolean isEnd;

        Trie() {
            this.node = new Trie[10]; // 0-9 를 저장하기 위함
            this.isEnd = false;
        }

        public void add(String s) {
            if (s.length() == 0) return;

            Trie[] nodes = this.node;
            Trie curr = null;
            for (char c : s.toCharArray()) {
                int num = c - '0'; // int로 변환
                if (nodes[num] == null) {
                    nodes[num] = new Trie();
                }
                curr = nodes[num];
                nodes = nodes[num].node;
            }
            curr.isEnd = true;
        }

        public boolean check(String s) {
            Trie[] nodes = this.node;
            Trie curr = null;
            for (int i = 0; i < s.length(); i++) {
                int n = s.charAt(i) - '0';
                curr = nodes[n];
                if (curr.isEnd && i < s.length() - 1) {
                    // 일관성이 없는 경우
                    return false;
                }
                nodes = curr.node;

            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.valueOf(scanner.nextLine()); // 테스트 케이스 갯수

        for (int i = 0; i < T; i++) {
            int N = Integer.valueOf(scanner.nextLine()); // 전화번호 수

            List<String> numbers = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                // 전화번호를 입력받아서 리스트에 추가
                numbers.add(scanner.nextLine());
            }

            // do something
            Trie root = new Trie();
            numbers.forEach(number -> root.add(number));

            boolean check = true;
            for (String number : numbers) {
                if (!root.check(number)) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
