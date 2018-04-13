import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;



public class Calculatrice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the first number?");
		int num1 = Operation.testInt(sc.nextLine());
		System.out.println("What is the operator?");
		String ope = Operation.testOpe(sc.nextLine());
		System.out.println("What is your last number?");
		int num2 = Operation.testInt(sc.nextLine());
		
		int res = Operation.CountRes(num1, num2, ope);
		
		//We print the result of the operation
		System.out.println("The result of "+num1+" "+ope+" "+num2+" = "+res);

	}

}
