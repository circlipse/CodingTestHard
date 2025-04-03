package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardMoongChi {
    public static void main(String[] args) {
        CardMoongChi cardMoongChi = new CardMoongChi(); // 인스턴스 생성
        String[] s1= new String[]{"i", "drink", "water"};
        String[] s2= new String[]{"want", "to"};
        String[] s3= new String[]{"i", "want", "to", "drink", "water"};
        String r1 = cardMoongChi.solution(s1, s2, s3);
        System.out.printf("1결과: %s%n", r1);

        s1= new String[]{"i", "water", "drink"};
        s2= new String[]{"want", "to"};
        s3= new String[]{"i", "want", "to", "drink", "water"};
        String r2 = cardMoongChi.solution(s1, s2, s3);
        System.out.printf("2결과: %s%n", r2);
    }
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> list2 = new ArrayList<>(Arrays.asList(cards2));

        for(String s : goal){
            if(!list1.isEmpty() && s.equals(list1.get(0))){
                list1.remove(0);
            }else if(!list2.isEmpty() && s.equals(list2.get(0))){
                list2.remove(0);
            }else{
                return "No";
            }
        }

        return "Yes";
    }

}
