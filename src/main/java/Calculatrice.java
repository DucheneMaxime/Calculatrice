import java.util.Scanner;

public class Calculatrice {
	
	/**
	 * 
	 * @param Op�rateur 1
	 * @param Op�rateur 2
	 * @return La division des deux op�rateurs
	 */
	public static int division(int a , int b) {
		return a/b;
		//TO DO tests + test /0
	}
	
	/**
	 * 
	 * @param Op�rateur 1
	 * @param Op�rateur 2
	 * @return L'addition des deux op�rateurs
	 */
	public static int addition(int a , int b) {
		return a+b;
		//TO DO tests
	}
	
	/**
	 * 
	 * @param Op�rateur 1
	 * @param Op�rateur 2
	 * @return La multiplication des deux op�rateurs
	 */
	public static int multiplication(int a , int b) {
		return a*b;
		//TO DO tests
	}
	
	/**
	 * 
	 * @param Op�rateur 1
	 * @param Op�rateur 2
	 * @return La soustraction des deux op�rateurs
	 */
	public static int soustraction(int a , int b) {
		return a-b;
		//TO DO tests
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the first number?");
		int num1 = Integer.parseInt(sc.nextLine());
		// TO DO V�rifier qu'il donne un int
		System.out.println("What is the operator?");
		String ope = sc.nextLine();
		// TO DO V�rifier + ou - ou * ou /
		System.out.println("What is your last number?");
		int num2 = Integer.parseInt(sc.nextLine());
		// TO DO M�me tests que pour num1
		
		int res=0;
		// We check what is the operator and call the right method
		switch(ope) {
		case ("+"):
			res=addition(num1, num2);
		break;
		case("-"):
			res=soustraction(num1, num2);
		break;
		case("*"):
			res=multiplication(num1, num2);
		break;
		case("/"):
			res=division(num1, num2);
		break;
		default:
			System.out.println("Error");
			break;
		}
		
		//We print the result of the operation
		System.out.println("The result of "+num1+" "+ope+" "+num2+" = "+res);

	}

}
