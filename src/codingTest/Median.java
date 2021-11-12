package codingTest;

public class Median {
    /**
     * 배열 안의 값들의 범위가 정해져 있고, 범위의 레인지가 넓지 않을 때
     * 정렬을 한다면 nlogn의 시간복잡도를 갖고 시작하지만
     * 이 방식으로는 n의 시간복잡도로 해결 가능하다
     * 예를 들어 몸무게라고 한다면 최대 500kg이라 가정하겠다
     */


    public static void main(String[] args) {

        int[] weights = {1,4,4,7,9,10,22};
        // 배열의 인덱스를 몸무게로 활용. 즉 0~500까지임
        int[] count = new int[501];

        for (int w : weights) {
            count[w] += 1;
        }

        int midIndex = weights.length / 2;

        int personOrder = 0;
        for (int i = 0; i < count.length; i++) {

            if (personOrder >= midIndex && count[i] > 0) {
                System.out.println("몸무게는 " + i + "입니다");
                break;
            }

            personOrder += count[i];

        }

        System.out.println(midIndex);
        System.out.println(personOrder);
    }

}
