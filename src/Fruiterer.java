package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Fruiterer {
    public static void main(String[] args) {
        Fruiterer fruiterer = new Fruiterer();
        int[] s1= new int[]{1, 2, 3, 1, 2, 3, 1};
        int r1 = fruiterer.solution(3, 4, s1);
        int[] s2= new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int r2 = fruiterer.solution(4, 3, s2);

        System.out.printf("1결과: %s%n", r1);
        System.out.printf("2결과: %s%n", r2);
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list1 = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        for (int i = m - 1; i < list1.size(); i += m) {
            int min = list1.get(i);
            answer += min * m;
        }

        return answer;
    }
}
