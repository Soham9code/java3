import java.util.Scanner;
public class car_selection {
    public static void main(String[]args){
        System.out.println("Do you want a car yes or no");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if(Ans1.equals("yes")){
            System.out.println("what is your favorite color between  red-blue-yellow");
            String Ans2 = scan.next();
        }
        else
        {
            System.out.println("have a nice day");
        }
    }
}
