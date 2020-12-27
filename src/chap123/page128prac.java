package chap123;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class page128prac {

    static class PhData {
        private String name;
        private int height;
        private double vision;

        public PhData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhData> HEIGHT_COMP = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhData>{
            public int compare(PhData d1, PhData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0 ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 정보를 입력하시겠습니까? : ");
        int peopleNum = sc.nextInt();
        PhData[] x = new PhData[peopleNum];

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("키를 입력하세요 : ");
        int height = sc.nextInt();
        System.out.print("시력을 입력하세요 : ");
        double vision = sc.nextDouble();
        x[0] = new PhData(name, height, vision);
        for (int i=1; i<peopleNum; i++) {
            do {
                System.out.print("이름을 입력하세요 : ");
                name = sc.next();

                System.out.print("키를 입력하세요 : ");
                height = sc.nextInt();

                System.out.print("시력을 입력하세요 : ");
                vision = sc.nextDouble();
                x[i] = new PhData(name, height, vision);
            } while (x[i].height < x[i-1].height);
        }


        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int findHeight = sc.nextInt();

        int findIndex = Arrays.binarySearch(x, new PhData("", findHeight, 0.0), PhData.HEIGHT_COMP);
        if(findIndex >= 0) {
            System.out.println("그 사람은 x[" +findIndex+ "]에 있습니다");
            System.out.println("찾은 데이터 : " + x[findIndex]);
        } else {
            System.out.println("그 키를 가진 사람은 없습니다");
        }
    }
}
