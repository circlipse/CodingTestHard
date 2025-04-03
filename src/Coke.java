package src;
//https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Coke {
    public static void main(String[] args) {
        Coke coke = new Coke(); // 인스턴스 생성
        int r1 = coke.solution(2, 1, 20);
        int r2 = coke.solution(3, 1, 20);

        System.out.printf("1결과: %d%n", r1);
        System.out.printf("2결과: %d%n", r2);
    }
    public int solution(int a, int b, int n) {
        int c = n;
        int answer = 0;
        while(c>=a){
            if(c%a==0){
                answer += (c / a) * b;
                c = (c / a) * b;
            }else{
                answer += (c / a) * b;
                c = (c / a) * b + c%a;
            }
        }
        return answer;
    }
}
