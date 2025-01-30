import java.util.Scanner;
public class Operatorsdemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scanner.nextInt();
        System.out.println("enter second number:");
        int num2=scanner.nextInt();
        System.out.println("sum:"+(num1+num2));
        System.out.println("difference:"+(num1-num2));
        System.out.println("product:"+(num1*num2));
        System.out.println("quotient:"+(num1/num2));
        System.out.println("remainder:"+(num1%num2));
        System.out.println("equal:"+(num1==num2));
        System.out.println("greater:"+(num1>num2));
        System.out.println("less:"+(num1<num2));
        System.out.println("both positive:"+(num1>0 && num2>0));
        System.out.println("atleast one positive:"+(num1>0||num2>0));
        System.out.println("not positive(num1):"+!(num1>0));
        scanner.close();
    }    
}
