import java.util.Scanner;
public class Hungry {
	public static void main(String[] args) {
		System.out.println("are you Hungry??");
		Scanner sc=new Scanner(System.in);
		String Answer=sc.nextLine();
		if(Answer.equals("Yes"))
			System.out.println("Eat Samosa");
		else
			System.out.println("What did you eat?");
	}

}
