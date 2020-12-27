package chap123;

public class page117 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        if(a.length == n) {
            int b=0;
            int cnt = 0;
            for(int i=0; i<a.length; i++) {
                if(a[i] == key) {
                    idx[b++] = i;
                    cnt++;
                }
            }
            return cnt;

        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,9,2,9,4,6,7,9};
        int[] idx = {1,3,7};
        int result = searchIdx(a,8, 9,idx);
        System.out.println(result);
    }
}
