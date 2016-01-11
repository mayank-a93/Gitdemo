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
	
	public void multiply(int a,int b)
    {
        System.out.println("Product = "+(a*b));
    }
	
	public void divide(int a,int b)
    {
        System.out.println("Remainder = "+(a%b));
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calc c = new Calc();
        c.add(a,b);
        c.subtract(a,b);
		c.multiply(a,b);
		c.divide(a,b);
    }
}