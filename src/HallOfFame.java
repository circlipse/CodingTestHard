package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame(); // 인스턴스 생성
        int[] s1= new int[]{10, 100, 20, 150, 1, 100, 200};
        int[] r1 = hallOfFame.solution(3, s1);
        int[] s2= new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] r2 = hallOfFame.solution(4, s2);

        System.out.printf("1결과: %s%n", Arrays.toString(r1));
        System.out.printf("2결과: %s%n", Arrays.toString(r2));

    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            arr.add(score[i]);
            if(arr.size()<k){
                answer[i] = Collections.min(arr);
            }else{
                arr.sort(Collections.reverseOrder());
                answer[i] = arr.get(k-1);
            }
        }
        return answer;
    }

}
