public class Exam
{
    public static void main(String[] args)
    {
       boolean result;
       int num1, num2;
       num1 = 30;
       num2 = 60;

        result = num1 < num2;
        result = num1 > num2;
        result = num1 <= num2;
        result = num1 >= num2;
        result = num1 == num2;
        result = num1 != num2;

       System.out.println("결과는 : "+result);
    }
}
