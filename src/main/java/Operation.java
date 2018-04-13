import java.util.Scanner;

public class Operation {
	
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
	
	/**
	 * La m�thode boucle tant que l'utilisateur ne donne pas de int
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
	 * La m�thode boucle tant que l'utilisateur ne rentre pas un des quatres op�rateurs
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
	 * La m�thode trouve le bon op�rateur et appelle la bonne
	 * m�thode de calcul
	 * @param Premier op�rateur
	 * @param Second op�rateur
	 * @param Op�rateur + - * ou /
	 * @return Le r�sultat de l'op�ration
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
