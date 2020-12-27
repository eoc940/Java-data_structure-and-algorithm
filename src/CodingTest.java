import java.util.*;

public class CodingTest {

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = convertToList(priorities);
        while (true) {
            if (list.get(0) == Collections.max(list)) {
                if (location == 0) {
                    return answer;
                }
                list.remove(0);
                answer++;
                location--;
            }
            list.remove(0);
            list.add(list.size()-1, list.get(0));
            location--;
            if (location == 0) {
                location = list.size()-1;
            }
        }
    }

    public static List<Integer> convertToList(int[] priorities) {
        List<Integer> list = new ArrayList<>();
        for (int num : priorities) {
            list.add(num);
        }
        return list;
    }





    public static void main(String[] args) {
        int[] pr = {2,1,3,2};
        int location = 2;
        System.out.println(solution(pr, location));
    }


}
