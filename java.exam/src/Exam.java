import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // 사용자가 입력한 숫자를 저장하는 변수
        int num1;
        // 사용자 키보드 입력 준비
        Scanner kd = new Scanner(System.in);
        // 사용자로 부터 숫자 입력
        System.out.println("반지름을 입력하세요.");
        num1 = kd.nextInt();

        System.out.println("원의 넓이 는 ?");
        System.out.println(area(num1));
    }
    public static double area(int radian){
        double temp;
        double result;

        temp = multi(radian, radian);
        result = multi(temp, 3.14);
        // result = radian * radian *3.14;
        return result;
    }
    public static double multi(double num1, double num2){
        double result;
        // 곱셈 연산 실행
        result = num1 * num2;
       // 곱셈한 결과 값을 기턴(도출)
        return result;
    }
    public static double  adder(double num1, double num2){
        double result;

        result = num1 + num2;

        return  result;
    }
    public static double minus(double num1, double num2){
        double result;

        result = num1 - num2;

        return result;
    }
    public static double divide(double num1, double num2){
        double result;

        result = num1 / num2;

        return result;
    }
    public static double modular(double num1, double num2){
        double result;

        result = num1 % num2;

        return result;
    }
        /* System.out.println(adder(num1, num2)); 더하기
           System.out.println(minus(num1, num2)); 뺴기
           System.out.println(multi(num1, num2)); 곱하기
           System.out.println(divide(num1,num2)); 나눗셈
          System.out.println(modular(num1, num2)); 나머지 */

}