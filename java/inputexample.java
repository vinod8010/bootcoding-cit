import java.util.Scanner;
public class inputexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int n = sc.nextInt();
        System.out.println("enter second number:");
        int m =sc.nextInt();
        int add = n+m;
        // addition
        System.out.println("addition =" + add);
        // substraction
        int sub = n-m;
        System.out.println("substration ="+ sub);
        // multiplication
        int mul = n*m;
        System.out.println("multiplication="+mul);
        //division
        int divi = n/m;
        System.out.println("division=" +divi);
        //modules
        int mod = n%m;
        System.out.println("modules=" +mod);



    }
}
