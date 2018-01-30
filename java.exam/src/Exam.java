import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // 사용자가 입력한 숫자를 저장하는 변수
        double num1;
        double num2;

        // 연산자를 구분할 문자를 저장하는 변수
        String operator;

        // 사용자가 키보드 입력 준비
        Scanner kd = new Scanner(System.in);
        // 사용자로 부터 숫자 입력
        System.out.println("첫번째 숫자를 입력하세요.");
        num1 = kd.nextDouble();
        // 개행문자 제거를 위한 flsh 처리
       kd.nextLine();

        System.out.println("연산을 선택하세요(덧셈:a, 뱰셈:b, 곱셈:c,나눗셈:b, 나머지:e)");
        operator = kd.nextLine();

        System.out.println("두번쨰 숫자를 입력하세요.");
        num2 = kd.nextDouble();

        switch (operator) {
            case "a":
                System.out.println("덧샘한 결과는 다음과 같습니다.");
                System.out.println(adder(num1, num2));
                break;
            case "b":
                System.out.println("뺼샘한 결과는 다음과 같습니다.");
                System.out.println(minus(num1, num2));
                break;
            case "c":
                System.out.println("곱샘한 결과는 다음과 같습니다.");
                System.out.println(multi(num1, num2));
                break;
            case "d":
                System.out.println("나눗셈 결과는 다음과 같습니다.");
                System.out.println(divide(num1, num2));
                break;
            case "e":
                System.out.println("나머지한 결과는 다음과 같습니다.");
                System.out.println(modular(num1, num2));
                break;
            default:
                System.out.println("연산을 잘못 입력하였습니다.");
        }
        System.out.println(adder(num1, num2));
        System.out.println(minus(num1, num2));
        System.out.println(multi(num1, num2));
        System.out.println(divide(num1, num2));
        System.out.println(modular(num1, num2));
    }
    public static double adder(double num1, double num2) {
        // 덧셉값을 저장하는 변수 생성
        double result;
        // 덧셋 연산 실행
        result = num1 + num2;
        // 덧셈한 결과 값을 리턴(도출)
        return result;
    }
    public static double minus(double num1, double num2) {
        // 곱셈값을 저장하는 변수 생성
        double result;
        // 곱셉 연산 실행
        result = num1 - num2;
        // 곱셋한 결과를 리턴(도출)
        return result;
    }
    public static double multi(double num1, double num2) {
        double result;
        result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        double result;
        result = num1 / num2;
        return result;
    }
    public static double modular(double num1, double nm2){
        double result;
        result = num1 % nm2;
        return result;
    }
}
