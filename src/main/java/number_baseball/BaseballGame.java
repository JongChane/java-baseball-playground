package number_baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseballGame {
    //세자리 난수 생성기
    public int generateThreeDigitNumber(){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        int hundred = numbers.get(0) * 100;
        int ten = numbers.get(1) * 10;
        int one = numbers.get(2);
        return hundred + ten + one;
    }
}
