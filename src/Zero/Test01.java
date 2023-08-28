package Zero;

import java.util.Scanner;

public class Test01 {
    //문자열 str이 주어질때 출력하는 코드를 작성해보세요.
    //제한사항 1<= str <= 1000000 이 나와야 한다.sdsdsssss
    //https://park-youjin.tistory.com/16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() >= 1 || str.length()<=100000){
            System.out.println(str);
        }
    }
}
