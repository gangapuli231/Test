package packageio;
import java.util.Scanner;
public class Sum {
         public static int sum(int x,int y) {
        	 return x+y;
         }
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("enter two numbers to add");
        	 int x=sc.nextInt();
        	 int y=sc.nextInt();
        	 System.out.println(sum(x,y));
        	 
         }
}
