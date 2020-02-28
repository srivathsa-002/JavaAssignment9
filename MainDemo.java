package Assignment9;
import java.util.Scanner;

public class MainDemo {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any text: ");
		String text = sc.nextLine();
		patternMatcher.matchesOrNot(text,"^[A-Z].*[.]$");
	}
}