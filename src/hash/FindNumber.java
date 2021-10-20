package hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            if (nums.contains(num)) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
