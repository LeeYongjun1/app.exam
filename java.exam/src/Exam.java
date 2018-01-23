import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // 키보드 입력을 준비
        Scanner kd = new Scanner(System.in);
        // 입력할 숫자를 저장하는 변수
        int num;

        // 사용자가 입력할 숫자를 변수 num에 저장
        num = kd.nextInt();

        // 저장한 숫자를 출력함
        System.out.println(num);
    }
}