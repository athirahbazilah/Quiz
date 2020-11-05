import java.util.Scanner;
public class quiz1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double feet,inches;
		
		System.out.print("Input the inches: ");
		inches = in.nextDouble();
		
		System.out.print("Input the feet: ");
		feet = in.nextDouble();
		
		System.out.println("Female weight is: "+(40+(5*feet))+" kg");
		System.out.println("Male weight is: "+(50+(5*feet))+" kg");
		
		

		
	}

}
