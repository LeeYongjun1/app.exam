import java.util.Scanner;

public class Exam {
    public static void main(String[] args)
    {
       car  mycar =  new car();
       System.out.println(mycar.color);

       System.out.println(mycar.x_pos);
       mycar.goForward(10);
       System.out.println(mycar.x_pos);

    }
}
class car {
    String color = "black";
    String name = "ks";
    int x_pos = 0;

    public void goForward(int forward) {
        x_pos += forward;
    }
    public int getcarposition() {
        return x_pos;
    }
    public String getcarcolor(){
        return color;
    }
    public String getName() {
        return name;
    }
}