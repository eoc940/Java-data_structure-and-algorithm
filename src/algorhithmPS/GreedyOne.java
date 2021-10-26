package algorhithmPS;

import java.util.Scanner;

// 백준 거스름돈
public class GreedyOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pay = scanner.nextInt();

        int[] money = {500, 100, 50, 10, 5, 1};

        int total = 1000 - pay;
        int result = 0;

        for (int mon : money) {
            if (total < mon) {
                continue;
            }
            result += total / mon;
            total -= mon * (total/mon);
        }
        System.out.println(result);


    }
}
