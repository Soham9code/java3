import java.util.Scanner;
public class new1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = scan.nextInt();
        System.out.println("Enter breadth:");
        int breadth = scan.nextInt();
        System.out.println("Enter radius:");
        int radius = scan.nextInt();
        System.out.println("Area of perimeter of rectangle:"+(2*length)+(2*breadth));
        System.out.println("Area of circuference of the circle:"+2*22.7*radius*radius);



    }
}
