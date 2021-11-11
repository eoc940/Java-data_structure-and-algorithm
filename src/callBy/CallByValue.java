package callBy;

public class CallByValue {

    private static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before Swapping");
        System.out.println("a = " + a + ", b = " + b);
        swap(a,b);
        System.out.println("\n" + "After Swapping");
        System.out.println("a = " + a + ", b = " + b);

    }

}
