package Zero;

public class Test07 {
    //값을 4개를 받아와서 분수 + 분수를 하고 해당 값을 분수로 받아서 분수의 최대공약수룰 구해서 해당 값을 a/b = [a,b]로 만들어서 리턴한다.
    public static void main(String[] args) {
        soltion(1, 2, 3, 4);
    }
    public static int[] soltion(int number1, int demo1, int number2, int demo2) {
        int[] number = new int[0];
        Double v = (double) number1 / (double) demo1 + (double) number2 / (double) demo2;
        System.out.println(number1 * demo2 + number2 * demo1);
        System.out.println(demo1 * demo2);
        return number;
    }
}
