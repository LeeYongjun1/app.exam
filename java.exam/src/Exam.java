import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // 키보드 입력을 준비
        Scanner keyboard=new Scanner(System.in);
        // 입력을 유도하는 메세지 출력
        System.out.println("당신의 이름은? ");
        // 문자를 키보드로 입력받음
        String str = keyboard.nextLine();
        // 입력후 저장한 문자를 출력함
        System.out.println("안녕하세요 "+str+ '님');
        // 입역을 유도하는 메세지 출력
        System.out.println("당신은 스파게티를 좋아한다는데, 진실입니까?");
        // true 혹은 false를 저장할 변수 생성
        boolean isTrue=keyboard.nextBoolean();
        // true 혹은 false 값에 따라 변도 처리
        if(isTrue == true)
             System.out.println("오~ 좋아하는군요.");
        else
            System.out.println("이런 아니었군요.");
        // 실수 입력을 위한 메세지
        System.out.println("당신과 동생의 키는 어떻해 되나요?");
        // 실수를 2번 입력받아 저장함
        double num1=keyboard.nextDouble();
        double num2=keyboard.nextDouble();
        // 입력후 저장한 실수를 서로 뺄샘
        double diff=num1-num2;
        // 뺄셈한 결과가 양수이면 첫번째 입력한 실수가 큼
        // 뺄셈한 결과가 음수이면 첫번째 입력한 실수가 큼
        if(diff>0)
            System.out.println("당신이 +5 만큼 크군요.");
        else
            System.out.println("당신이 + (-5) 만큼 작군요.");
    }
}