package test;
import java.util.*;
public class Generic{
    static void check(String n)
    {
        try{
            int s = Integer.parseInt(n);
            double q=s/3;
            double ans=s-q;;
            System.out.println(ans);
        }catch (NumberFormatException ex) {
            System.out.println("This is not a valid number");
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        String n=sc.nextLine();
        check(n);
    }
    }