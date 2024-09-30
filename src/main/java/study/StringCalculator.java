package study;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    String[] values;
    public void input() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        scanner.close();
        this.values = value.split(" "); // 사용자 입력값 하나씩 분리해서 배열;
    }
    // 계산
    public int calculate(String[] values) {
        int result = parseInt(values[0]); // 첫번째 숫자로 초기값 설정
        for(int i = 1; i < values.length; i+=2) {
            String operator = values[i];
            int nextValue = parseInt(values[i+1]);
            switch (operator) {
                case "+":
                    result = add(result, nextValue);
                    break;
                case "-":
                    result = subtract(result, nextValue);
                    break;
                case "*":
                    result = multiply(result, nextValue);
                    break;
                case "/":
                    result = divide(result, nextValue);
                    break;
                default:
                    throw new IllegalArgumentException("입력한 연산자를 확인하세요 : " + operator);
            }
        }
        return result;
    }

    //더하기
    int add(int i, int j) {
        return i + j;
    }

    //빼기
    int subtract(int i, int j) {
        return i - j;
    }

    //곱하기
    int multiply(int i, int j) {
        return i * j;
    }

    //
    int divide(int i, int j) {
        return i / j;
    }


}

