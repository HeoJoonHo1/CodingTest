package Zero;

public class Test06 {
    public static void main(String[] args) {
        int intger = intger(100, 12);
        System.out.println(intger);
    }
    public static int intger(int num1,int num2){
        int answer = 0;
        if(num1>0&& num1<=100)
        {
            if(num2>0&& num2<=100){
                Double result;
                result= ((double)num1/(double)num2);
                System.out.println(result);
                Double v = result * 1000;
                System.out.println(v);
                answer = v.intValue();
                return answer;
            }
        }
return answer;}

}
