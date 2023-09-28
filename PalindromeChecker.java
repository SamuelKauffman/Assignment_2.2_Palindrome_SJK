import java.util.*;

public class PalindromeChecker {
	
	String word;
	int letterCount;
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public void setLetterCount(String word) {
		letterCount = word.length();
	}
	
	public int getLetterCount() {
		return letterCount;
	}
	
	public boolean PalindromeCheck(String word) {
		String currentWord = word.toLowerCase();
		StringBuilder wordBuilder = new StringBuilder();
			for(int i = 0; i < currentWord.length(); i++) {
				char currentChar = currentWord.charAt(i);
					if(currentWord.charAt(i) >= 'a' && currentWord.charAt(i) <= 'z') {
						wordBuilder.append(currentChar);
				}
			}
			
			String letterWord = wordBuilder.toString();
			System.out.println(letterWord);
			
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < letterWord.length(); j++) {
				stack.push(letterWord.charAt(j));
			}
			
			for(int h = 0; h < letterWord.length(); h++) {
				if(letterWord.charAt(h) != stack.pop()) {
					return false;
				}
			}
			return true;
	}
}
