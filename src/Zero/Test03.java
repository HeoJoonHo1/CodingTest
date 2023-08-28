package Zero;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        ArrayList<Double> solution = solution(100.0, 15.0);
        System.out.println("몫"+solution.get(0));
        System.out.println("나머지"+solution.get(1));

    }

    public static ArrayList<Double> solution(Double num1, Double num2) {
        Double answer = (double) 0;
        if (num1 > 0 && num1 <= 100) {
            if (num2 > 0 && num2 <= 100) {
                answer = num1 / num2;
                String format = String.format("%.2f", answer);
                //현재는 "answer" 상태이다.
                Double i = Double.parseDouble(format);
                int i1 = i.intValue();
                double nanu = (i - i1);ArrayList<Double> list = new ArrayList<>();
                list.add((double) i1);
                list.add(nanu);
                return list;
                //해당 코드가 에러가 난 이유는 if 문 안에서 list 를 만들어 줬는데 안에서 반환 하지 않고 밖에서 반환을 했기 떄문이다.
            }
        }
        return null;
    }
}
