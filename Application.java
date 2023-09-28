import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		PalindromeChecker checker = new PalindromeChecker();

		checker.setWord("Race car.");
		
		System.out.println(checker.PalindromeCheck("Race car."));
		
		checker.setWord("Dog");
		
		System.out.println(checker.PalindromeCheck("Dog"));

	}

}
