import java.util.Scanner;

public class Operation {
	
	/**
	 * 
	 * @param Opérateur 1
	 * @param Opérateur 2
	 * @return La division des deux opérateurs
	 */
	public static int division(int a , int b) {
		return a/b;
		//TO DO tests + test /0
	}
	
	/**
	 * 
	 * @param Opérateur 1
	 * @param Opérateur 2
	 * @return L'addition des deux opérateurs
	 */
	public static int addition(int a , int b) {
		return a+b;
		//TO DO tests
	}
	
	/**
	 * 
	 * @param Opérateur 1
	 * @param Opérateur 2
	 * @return La multiplication des deux opérateurs
	 */
	public static int multiplication(int a , int b) {
		return a*b;
		//TO DO tests
	}
	
	/**
	 * 
	 * @param Opérateur 1
	 * @param Opérateur 2
	 * @return La soustraction des deux opérateurs
	 */
	public static int soustraction(int a , int b) {
		return a-b;
		//TO DO tests
	}
	
	/**
	 * La méthode boucle tant que l'utilisateur ne donne pas de int
	 * @param String a tester pour voir si c'est un int
	 * @return
	 */
	public static int testInt(String test) {
		Scanner sc = new Scanner(System.in);
		/*while(!StringUtils.isNumeric(test)) {
			System.out.println("Please write down a number.");
			test = sc.nextLine();
		}*/
		return Integer.parseInt(test);
	}
	
	/**
	 * La méthode boucle tant que l'utilisateur ne rentre pas un des quatres opérateurs
	 * @param String a tester
	 * @return + - * ou / 
	 */
	public static String testOpe(String test) {
		Scanner sc = new Scanner(System.in);
		while(!(test.equals("/")) && !(test.equals("*")) && !(test.equals("+")) && !(test.equals("-"))) {
			System.out.println("Please type a valid operator among the followings: + - * /");
			test = sc.nextLine();
		}
		return test;
	}
	
	/**
	 * La méthode trouve le bon opérateur et appelle la bonne
	 * méthode de calcul
	 * @param Premier opérateur
	 * @param Second opérateur
	 * @param Opérateur + - * ou /
	 * @return Le résultat de l'opération
	 */
	public static int CountRes(int num1, int num2, String ope) {
		// We check what is the operator and call the right method accordingly
		switch(ope) {
		case ("+"):
			return addition(num1, num2);
		case("-"):
			return soustraction(num1, num2);
		case("*"):
			return multiplication(num1, num2);
		case("/"):
			return division(num1, num2);
		default:
			System.out.println("Error");
			break;
		}
		return 0;
	}


}
