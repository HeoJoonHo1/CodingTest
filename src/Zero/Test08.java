package Zero;

public class Test08 {
    // 양의 정수 2값을 받은 후 나누고 나머지 를 반환하는 메서드를 만들어라
    /*
    * / 이건 나누기 연산자야 몫을 반환해
    * % 이건 나머지 연산자야 나머지를 반환해
    */
    public static void main(String[] args) {
        int i = test01(2, 3);
        System.out.println(i);
        System.out.println(2/3);
    }

    public static int test01(int num1, int num2) {
        int result = 0;
        int a = 0;
        if (num1 > 0 && num2 > 0) {
            a = num1 / num2;
            result = num1 - (a * num2);
            return result;
        }
        return 0;
    }
}
