package Zero;

public class Test05 {
    public static void main(String[] args) {
        int solution = solution(1, 2);
        System.out.println(solution);

    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
            return answer;
        }
        answer =-1;
        return answer;
    }


    //int answer = (num1 == num2) ? 1 : -1;
    //        return answer;
}
