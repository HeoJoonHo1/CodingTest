package Zero;

public class Test04 {
    public static void main(String[] args) {

        age(23);
        System.out.println(age(23));
        age(130);
        System.out.println(age(130));
    }
    public static int age(int age) {
        int answer = 0;
        if (age > 0 && age <=120) {
           answer = 2022 - age;
            int i = answer + 1;
            return i;
        }
        return answer;
    }
}
