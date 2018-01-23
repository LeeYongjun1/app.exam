import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        int num=0;
        int num2=0;
        // do while을 활용한 반복 출력
        do{
            System.out.println("java" +num);
            num++;
        }while (num<5);
        // while을 활용한 반복 출력
        while(num>5){
            System.out.println("java" +num2);
            num2++;
        }
    }
}