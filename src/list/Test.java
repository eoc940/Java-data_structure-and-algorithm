package list;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        PracArrayList arrayList = new PracArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(Arrays.toString(arrayList.print()));
        System.out.println(arrayList.size());
        arrayList.insert(2,7);
        System.out.println(Arrays.toString(arrayList.print()));
        arrayList.insert(4,9);
        arrayList.insert(0,12);
        System.out.println(Arrays.toString(arrayList.print()));
        arrayList.delete(7);
        System.out.println(Arrays.toString(arrayList.print()));
        arrayList.deleteByIndex(2);
        System.out.println(Arrays.toString(arrayList.print()));
    }
}
