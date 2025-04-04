package src;


public class TemplarWeapon {
    public static void main(String[] args) {
        TemplarWeapon templarWeapon = new TemplarWeapon();

        int r1 = templarWeapon.solution(5, 3, 2);
        int r2 = templarWeapon.solution(10, 3, 2);

        System.out.printf("1결과: %s%n", r1);
        System.out.printf("2결과: %s%n", r2);
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt += (j * j == i) ? 1 : 2;
                }
            }
            answer += (cnt > limit) ? power : cnt;
        }
        return answer;
    }
}
