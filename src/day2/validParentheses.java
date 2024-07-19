package day2;

import java.util.Stack;

public class validParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("(}"));
	}

	static boolean isValid(String s) {
		Stack<Character> parenthesesStack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') parenthesesStack.push(')');
			else if (c == '[') parenthesesStack.push(']');
			else if (c == '{') parenthesesStack.push('}');
			else if (parenthesesStack.isEmpty() || parenthesesStack.pop() != c) return false;
		}
		return parenthesesStack.isEmpty();
	}
}
