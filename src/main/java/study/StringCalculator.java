package study;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int input() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        String[] arr = stringToArray(userInput);
        return calculate(arr);
    }
    //문자열 배열로 변환
    public String[] stringToArray(String str) {
        return str.split("");
    }
    // 계산함수
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

