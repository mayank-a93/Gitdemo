import java.util.Scanner;

public class Calc {
    
    public void add(int a,int b)
    {
        System.out.println("Sum = "+(a+b));
    }
    
    public void subtract(int a,int b)
    {
        System.out.println("Difference = "+(a-b));
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calc c = new Calc();
        c.add(a,b);
        c.subtract(a,b);
    }
}