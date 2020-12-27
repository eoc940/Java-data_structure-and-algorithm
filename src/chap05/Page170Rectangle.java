package chap05;


public class Page170Rectangle {

    //유클리드 호제법 재귀 사용
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
    //유클리드 호제법 재귀 미사용
    public static int gcdPractice170(int x, int y) {
        int maxNum = Math.max(x,y);
        int minNum = Math.min(x,y);
        while (true) {
            int dividedNumber = maxNum % minNum;
            if (dividedNumber == 0) {
                return minNum;
            }
            maxNum = minNum;
            minNum = dividedNumber;
        }
    }

    public static int gcdPracticeQuiz3(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        int num = gcd(a[0], a[1]);
        for (int i = 1; i < a.length; i++) {
            num = gcd(num, a[i]);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(gcd(4,10));
        System.out.println(gcdPractice170(8,24));
        int[] a = {4,8,20,3,4,3,5};
        System.out.println(gcdPracticeQuiz3(a));
    }
}
