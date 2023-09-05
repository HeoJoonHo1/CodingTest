package Zero;

public class Test10 {
    public static void main(String[] args) {
        int i = test01(10);
        System.out.println("i = " + i);
    }

    public static int test01(int num) {
        int answer = 0;
        int sum = 0;
        for (int i = 1; i <= num; ++i) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;


//        // 1 n~0  까지의 짝수를 구해야 한다.
//        // 2 해당 짝수들의 전체의 합을 구한다.
//        if (num > 0 && num <= 1000) {
//            int length = (num / 2);
//            for (int i = 1; i <= length; ++i) {
//                sum += 2;
//                answer += sum;
//                System.out.println(sum);
//            }
//            return answer;
//        }
//        return 0;
//    }
    }
}
