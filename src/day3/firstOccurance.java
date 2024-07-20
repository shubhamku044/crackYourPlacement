package day3;

public class firstOccurance {
	public static void main(String[] args) {
		System.out.println("First occurance of needle in haystack");
		System.out.println(strStr("hello", "ll"));
		System.out.println(strStr("aaaaa", "bba"));
		System.out.println(strStr("a", "a"));
		System.out.println(strStr("mississippi", "issip"));
	}

	static int strStr(String haystack, String needle) {
		if (needle.length() > haystack.length()) return -1;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
		}
		return -1;
	}
}
