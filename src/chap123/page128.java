package chap123;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class page128 {

    static class PhysData {
        private String name;
        private int height;
        private double vision;

        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0 ;
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhysData[] x = {
            new PhysData("이지원", 164, 0.2),
            new PhysData("김형근", 177, 1.5),
            new PhysData("김범식", 178, 0.5),
            new PhysData("이건희", 179, 1.3)
        };
        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhysData("", height, 0.0),
                PhysData.HEIGHT_ORDER
        );
        if (idx < 0) {
            System.out.println("찾으시는 값이 없습니다");
        } else {
            System.out.println("찾은 데이터 : " + x[idx]);
        }

    }
}
