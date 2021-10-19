package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }
        while (queue.size() > 1) {
            queue.poll();
            int card = queue.poll();
            queue.add(card);
        }
        System.out.println(queue.peek());
    }
}
